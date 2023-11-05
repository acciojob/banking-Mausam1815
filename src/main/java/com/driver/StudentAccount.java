package com.driver;

public class StudentAccount extends BankAccount{

    String  institutionName;

    public StudentAccount(String name, double balance, String  institutionName) {
        //minimum balance is 0 by default
        super(name, balance, 0);
        this.institutionName = institutionName;
    }

    public String getInstitutionName() {
        return institutionName;
    }

    public String getName() {
        return super.getName();
    }
    public double getMinBalance() {
        return super.getMinBalance();
    }
}
