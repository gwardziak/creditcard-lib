package pl.rajca.creditcard;

class CreditCard {
    private boolean blocked = true;
    private double balance = 0;
    private double limit;
    
    public void assignLimit(double money) {
        balance = money;
        limit = money;
    }
    
    
    public boolean isBlocked(){
        return this.blocked;
    }
    
    public double getLimit() {
        return limit;
    }
    
    public void block(){
        this.blocked = true;
    }

    public void withdraw(double money) {
        this.balance = balance - money;
    }
    
    public double getAccountBalance() {
        return balance;
    }
    
    public void repay(double money) {
        if(balance >= money) {
            this.limit = limit - money;
            balance = balance - money;
        }
    } 

        
    
}