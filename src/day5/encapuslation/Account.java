package day5.encapuslation;

public class Account {
    private String name;
    private String accountNumber;
    private AccountType accountType;
    private double accountBalance;
    private String socialSecurityNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    /*Commenting because this is very sensitive information, no one will be able to get his field.

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }
    */
    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }
}
