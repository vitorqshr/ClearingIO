package org.clearingio.file;

import org.beanio.BeanReader;
import org.beanio.builder.FixedLengthParserBuilder;
import org.beanio.builder.StreamBuilder;
import org.clearingio.elo.*;
import org.clearingio.elo.incoming.*;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class StreamFactoryClearingIO {

	private org.beanio.StreamFactory streamFactory = org.beanio.StreamFactory.newInstance();

	public StreamFactoryClearingIO() {
		StreamBuilder streamBuilder = new StreamBuilder("IncomingELO");
		streamBuilder.format("fixedlength")
				.parser(new FixedLengthParserBuilder())
				//.addRecord(FraudWarning40Data.class)
				//.addRecord(FraudWarning40AdditionalData.class)
				.addRecord(HeaderB0.class)
				.addRecord(Transaction00MainData.class)
				.addRecord(Transaction01AdditionalInformation.class)
				.addRecord(Transaction02CountryOfSettlementData.class)
				//.addRecord(Transaction03FundsTransferData.class)
				.addRecord(Transaction05PaymentServiceData.class)
				.addRecord(Transaction07CardChipData.class)
				//.addRecord(Transaction08LiquidationOfAirlineCompanies.class)
				.addRecord(Transaction09PartialRejectionReasonData.class)
				//.addRecord(FeeCollection10Debit.class)
				//.addRecord(FeeCollection12AdditionalData.class)
				.addRecord(TrailerBZ.class)
				.addRecord(ReturnTransactional44DataReturn00.class);
		streamFactory.define(streamBuilder);
	}

	public List<Object> createReader(String streamBuilderName, File file) {
		List<Object> list = new ArrayList<>();
		BeanReader beanReader = streamFactory.createReader(streamBuilderName, file);
		for(Object obj = beanReader.read(); obj != null; obj = beanReader.read()) {
			list.add(obj);
		}
		beanReader.close();
		return list;
	}
}
