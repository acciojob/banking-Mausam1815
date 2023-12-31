package com.driver;

public class CurrentAccount extends BankAccount{
    String tradeLicenseId; //consists of Uppercase English characters only

    public CurrentAccount(String name, double balance, String tradeLicenseId) throws Exception {
        // minimum balance is 5000 by default. If balance is less than 5000, throw "Insufficient Balance" exception
        super(name, balance, 5000);
        this.tradeLicenseId = tradeLicenseId;

        if(balance < 5000) {
            throw new Exception("Insufficient Balance");
        }
    }

    public void validateLicenseId() throws Exception {
        // A trade license Id is said to be valid if no two consecutive characters are same
        // If the license Id is valid, do nothing
        // If the characters of the license Id can be rearranged to create any valid license Id
        // If it is not possible, throw "Valid License can not be generated" Exception

        if(tradeLicenseId == null || tradeLicenseId.length() < 2) {
            throw new Exception("Valid License can not be generated");
        }
        StringBuilder validLicenseId = new StringBuilder();
        validLicenseId.append(tradeLicenseId.charAt(0));
        for(int i=1; i<tradeLicenseId.length(); i++) {
            if(tradeLicenseId.charAt(i) == tradeLicenseId.charAt(i -1 )) {
                char nextChar = (tradeLicenseId.charAt(i) == 'Z') ? 'A' : (char) (tradeLicenseId.charAt(i) + 1);
                validLicenseId.append(nextChar);
            }else {
                validLicenseId.append(tradeLicenseId.charAt(i));
            }
        }
        tradeLicenseId = validLicenseId.toString();
    }

    public String getTradeLicenseId() {
        return tradeLicenseId;
    }

    public String getName() {
        return super.getName();
    }
    public double getMinBalance() {
        return super.getMinBalance();
    }

}
