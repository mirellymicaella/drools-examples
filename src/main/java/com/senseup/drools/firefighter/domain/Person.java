package com.senseup.drools.firefighter.domain;

public class Person {
    private String name;
    private Pet pet;
    private int petCallCount = 0 ;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public int getPetCallCount() {
        return petCallCount;
    }

    public void setPetCallCount(int petCallCount) {
        this.petCallCount = petCallCount;
    }

    

    @Override
    public String toString() {
        return "Person[name= '"+name+"', petName= '"+pet.getName()+"', petCallCount= '"+petCallCount+"']";
    }
    
}