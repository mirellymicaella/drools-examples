
package com.senseup.drools.transactions;

import java.util.List;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieSession;


import com.senseup.drools.transactions.domain.TransactionEvent;
import com.senseup.drools.transactions.repository.TransactionRepository;

public class Test {

	public static void main(final String[] args) {
		System.out.println("Running...");
		KieSession ksession = KieServices.Factory.get()
				.getKieClasspathContainer()
				.newKieSession("Transaction");
		
		List<TransactionEvent> transactions = TransactionRepository.getTransactionEvents();
		transactions.forEach(ksession::insert);

		System.out.println("==== DROOLS SESSION START ==== ");
		ksession.fireAllRules();
	     //transactions.forEach(transaction -> System.out.println(transaction ));

		System.out.println("==== DROOLS SESSION END ==== ");
		ksession.dispose();

	}

}
