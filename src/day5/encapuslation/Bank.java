package day5.encapuslation;

public class Bank {
    public static void main(String[] args) {
        Account accountOne = new Account();
        //accountOne.name = "Binod Maharjan";
        //accountOne.accountNumber = "999-111-2222-3333";
        //accountOne.accountType = AccountType.SAVING;
        //accountOne.accountBalance = 999999999;
        //accountOne.socialSecurityNumber = "123-45-6789";

        accountOne.setName("Binod Maharjan");
        accountOne.setAccountNumber("999-111-222-3333");
        accountOne.setAccountType(AccountType.SAVING);
        accountOne.setAccountBalance(999999999);
        accountOne.setSocialSecurityNumber("123-45-6789");

        System.out.println("The customer name is " + accountOne.getName());
        System.out.println("The account number is " + accountOne.getAccountNumber());

    }
}
