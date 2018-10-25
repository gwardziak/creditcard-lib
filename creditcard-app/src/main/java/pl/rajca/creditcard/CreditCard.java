package pl.rajca.creditcard;

class CreditCard {
    private boolean blocked = true;
    
    public void assignLimit(double money) {
        
    }
    
    
    public boolean isBlocked(){
        return this.blocked;
    }
    
    public double getLimit() {
        return 2000;
    }
    
    public void block(){
        this.blocked = true;
    }
}