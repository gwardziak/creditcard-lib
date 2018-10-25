package pl.rajca.creditcard;

class CreditCard {
    private double balance = 0;
    private double limit;
    
    public void assignLimit(double money) {
        balance = money;
        limit = money;
    }
    
    public double getLimit() {
        return 2000;
    }
    
    public void withdraw(double money) {
        this.balance = balance - money;
    }
    
    public double getAccountBalance() {
        return balance;
    }
    
}