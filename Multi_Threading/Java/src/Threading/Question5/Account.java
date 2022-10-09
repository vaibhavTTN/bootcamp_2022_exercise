package Threading.Question5;

class Account {
    private String accountNumber;
    private int amount;

    private Object lock;

    public Account(String accountName, int amount) {
        this.accountNumber = accountName;
        this.amount = amount;
        this.lock = new Object();
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getAmount() {
        return amount;
    }

    public void setAccountNumber(String accountName) {
        this.accountNumber = accountName;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Object getLock() {
        return lock;
    }
}
