public interface BankSystem {


    public int createAccount(String AccountHolderName, int AccountNo, double Amount, String AccountType, String CreatedAt);
    public void getDetails();
    public int depositMoney(double amount);
    public int withdrawMoney(double amount);
    public void getAccountDetails();


}
