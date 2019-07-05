package org.clearingio.file;

import org.beanio.BeanReader;
import org.beanio.BeanReaderErrorHandler;
import org.beanio.BeanReaderException;
import org.beanio.builder.FixedLengthParserBuilder;
import org.beanio.builder.StreamBuilder;
import org.clearingio.ctf.*;
import org.clearingio.ctf.incoming.*;
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
				.addRecord(MemberSettlementDataTransactionsTCR0N.class)
				.addRecord(MemberSettlementDataTransactionsTCR0V1.class)
				.addRecord(MemberSettlementDataTransactionsTCR0V2.class)
				.addRecord(MemberSettlementDataTransactionsTCR0V3.class)
				.addRecord(MemberSettlementDataTransactionsTCR0V4.class)
				.addRecord(MemberSettlementDataTransactionsTCR0V5.class)
				.addRecord(MemberSettlementDataTransactionsTCR0V6.class)
				.addRecord(MemberSettlementDataTransactionsTCR0V7.class)
				.addRecord(MemberSettlementDataTransactionsTCR0V9.class)
				.addRecord(MemberSettlementDataTransactionsTCR1V4.class)
				.addRecord(MemberSettlementDataTransactionsTCR1V9.class)
				.addRecord(ReclassificationAdviceTransactionTRC0At7.class)
				.addRecord(ReclassificationAdviceTransactionTRC9.class)
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
		beanReader.setErrorHandler(new BeanReaderErrorHandler() {
			@Override
			public void handleError(BeanReaderException ex) throws Exception {
				System.err.println(ex.getRecordContext().getRecordText());
			}
		});
		for(Object obj = beanReader.read(); obj != null; obj = beanReader.read()) {
			list.add(obj);
		}
		beanReader.close();
		return list;
	}

	public static void main(String[] args) {
		StreamFactoryClearingIO streamFactoryClearingIO = new StreamFactoryClearingIO();
		//String pathname = "";
		//streamFactoryClearingIO.createReader("OutgoingVisa", new File(pathname));
		//String pathname = "";
		//streamFactoryClearingIO.createReader("IncomingELO", new File(pathname));
		String pathname = "";
		streamFactoryClearingIO.createReader("IncomingVisa", new File(pathname));
	}
}
