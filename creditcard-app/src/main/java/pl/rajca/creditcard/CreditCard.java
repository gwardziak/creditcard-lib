package pl.rajca.creditcard;

class CreditCard {
    private boolean blocked = false;
    private double balance = 0;
    private double limit;
    private String cardNumber;
    
    public CreditCard() {
        this.cardNumber = "random_number";
    }
    
    public CreditCard(String cardNumber) {
        this.cardNumber = cardNumber;
        
    }
    
    public String getNumber() {
        return cardNumber;
    }
    
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
        if(isBlocked())
            throw new TransactionOnBlockedCardException();
            
        if(money > balance)
             throw new NotEnoughMoneyException();
             
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