package pl.rajca.creditcard;

class CreditCard {
<<<<<<< HEAD
    private boolean blocked = true;
=======
    private double balance = 0;
    private double limit;
>>>>>>> withdraw_feature
    
    public void assignLimit(double money) {
        balance = money;
        limit = money;
    }
    
    
    public boolean isBlocked(){
        return this.blocked;
    }
    
    public double getLimit() {
        return 2000;
    }
    
<<<<<<< HEAD
    public void block(){
        this.blocked = true;
    }
=======
    public void withdraw(double money) {
        this.balance = balance - money;
    }
    
    public double getAccountBalance() {
        return balance;
    }
    
>>>>>>> withdraw_feature
}