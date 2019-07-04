package org.clearingio.file;

import org.beanio.BeanReader;
import org.beanio.builder.FixedLengthParserBuilder;
import org.beanio.builder.StreamBuilder;
import org.clearingio.ctf.*;
import org.clearingio.ctf.incoming.HeaderRecordsTCR0IncomingCTF;
import org.clearingio.ctf.incoming.ReturnedItemTransactionsTRC0At8;
import org.clearingio.ctf.incoming.ReturnedItemTransactionsTRC9;
import org.clearingio.ctf.outgoing.HeaderRecordsTCR0OutgoingCTF;
import org.clearingio.elo.*;
import org.clearingio.elo.incoming.*;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class StreamFactoryClearingIO {

	private org.beanio.StreamFactory streamFactory = org.beanio.StreamFactory.newInstance();

	public StreamFactoryClearingIO() {
		StreamBuilder streamBuilderOutgoingVisa = new StreamBuilder("OutgoingVisa");
		streamBuilderOutgoingVisa.format("fixedlength")
				.parser(new FixedLengthParserBuilder())
				.addRecord(HeaderRecordsTCR0OutgoingCTF.class)
				.addRecord(DraftDataTransactionsTRC0.class)
				.addRecord(DraftDataTransactionsTRC1AdditionalData.class)
				.addRecord(DraftDataTransactionsTRC2Brazil.class)
				.addRecord(DraftDataTransactionsTRC5PaymentServiceData.class)
				.addRecord(BatchAndFileTrailerRecordsTCR0.class);
		streamFactory.define(streamBuilderOutgoingVisa);

		StreamBuilder streamBuilderIncomingVisa = new StreamBuilder("IncomingVisa");
		streamBuilderIncomingVisa.format("fixedlength")
				.parser(new FixedLengthParserBuilder())
				.addRecord(HeaderRecordsTCR0IncomingCTF.class)
				.addRecord(ReturnedItemTransactionsTRC0At8.class)
				.addRecord(ReturnedItemTransactionsTRC9.class)
				.addRecord(BatchAndFileTrailerRecordsTCR0.class);
		streamFactory.define(streamBuilderIncomingVisa);

		StreamBuilder streamBuilderIncomingELO = new StreamBuilder("IncomingELO");
		streamBuilderIncomingELO.format("fixedlength")
				.parser(new FixedLengthParserBuilder())
				.addRecord(HeaderB0.class)
				.addRecord(Transaction00MainData.class)
				.addRecord(Transaction01AdditionalInformation.class)
				.addRecord(Transaction02CountryOfSettlementData.class)
				.addRecord(Transaction03FundsTransferData.class)
				.addRecord(Transaction05PaymentServiceData.class)
				.addRecord(Transaction07CardChipData.class)
				.addRecord(Transaction08LiquidationOfAirlineCompanies.class)
				.addRecord(Transaction09PartialRejectionReasonData.class)
				.addRecord(FeeCollectionFinancialDisputeAdjustment00.class)
				.addRecord(FeeCollectionFinancialDisputeAdjustment02AdditionalData.class)
				.addRecord(FraudWarning40Data.class)
				.addRecord(FraudWarning40AdditionalData.class)
				.addRecord(ReturnTransactional44DataReturn00.class)
				.addRecord(TrailerBZ.class);
		streamFactory.define(streamBuilderIncomingELO);


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

	public static void main(String[] args) {
		StreamFactoryClearingIO streamFactoryClearingIO = new StreamFactoryClearingIO();
		//String pathname = "C:\\SIPPE\\adq\\visa\\VISA.ADQ.OUT.CTF.466276.1549557003641.ctf";
		//streamFactoryClearingIO.createReader("OutgoingVisa", new File(pathname));
		String pathname = "C:\\SIPPE\\adq\\elo\\ELO_ADQ_R_RITM0020932\\1ELO_ADQ_R_0075390C0347.txt";
		streamFactoryClearingIO.createReader("IncomingELO", new File(pathname));
	}
}
