package com.senseup.drools.firefighter;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieSession;

import com.senseup.drools.firefighter.domain.Person;
import com.senseup.drools.firefighter.domain.Pet;

public class Test {

	public static void main(final String[] args) {
        
		System.out.println("Running...");
		
		KieSession ksession = KieServices.Factory.get()
				.getKieClasspathContainer()
				.newKieSession("Firefighter");

        Person person = new Person("Mirelly");
        Pet pet = new Pet("Planck", "on a limb", Pet.PetType.CAT);
        person.setPet(pet);

        // Now we will insert the Pet and the Person into the KnowledgeSession
        ksession.insert(pet);
        ksession.insert(person);

        // We will fire all the rules that were activated
        ksession.fireAllRules();
     

        
        //Dispose the knowledge session
        ksession.dispose();
	}

}