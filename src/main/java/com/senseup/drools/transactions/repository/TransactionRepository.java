package com.senseup.drools.transactions.repository;

import java.util.ArrayList;
import java.util.List;

import com.senseup.drools.transactions.domain.TransactionEvent;

public class TransactionRepository {

	  public static final String SARAH_ID = "CA-SARAH-1";
	  public static final String SIMON_ID= "CA-SIMON-2";
	  public static final String EMILY_ID = "AU-EMILY-3";
	  public static final String JAMES_ID = "AU-JAMES-4";

	  public static List<TransactionEvent> getTransactionEvents() {
	    List<TransactionEvent> transactions = new ArrayList<>();

	    transactions.add(new TransactionEvent(SARAH_ID,1500.00));
	    transactions.add(new TransactionEvent(SIMON_ID,2000.00));
	    transactions.add(new TransactionEvent(EMILY_ID,50.00));
	    transactions.add(new TransactionEvent(JAMES_ID,250.00));
	    transactions.add(new TransactionEvent(SARAH_ID,1300.00));
	    transactions.add(new TransactionEvent(SIMON_ID,20.00));
	    transactions.add(new TransactionEvent(EMILY_ID,500.00));
	    transactions.add(new TransactionEvent(SARAH_ID,1300.00));
	    transactions.add(new TransactionEvent(SIMON_ID,20.00));
	    transactions.add(new TransactionEvent(EMILY_ID,500.00));
	    
	    transactions.add(new TransactionEvent(JAMES_ID,17.00));
	    transactions.add(new TransactionEvent(JAMES_ID,170.00));
	    transactions.add(new TransactionEvent(JAMES_ID,150.00));	    
	    transactions.add(new TransactionEvent(JAMES_ID,750.00));	    
	    transactions.add(new TransactionEvent(JAMES_ID,175.00));	    
	    transactions.add(new TransactionEvent(JAMES_ID,123.00));	    
	    transactions.add(new TransactionEvent(JAMES_ID,145.00));	    
	    transactions.add(new TransactionEvent(JAMES_ID,2750.00));	    
	    transactions.add(new TransactionEvent(JAMES_ID,3750.00));	    
	    transactions.add(new TransactionEvent(JAMES_ID,8750.00));
	    
	    return transactions;
	  }

}
