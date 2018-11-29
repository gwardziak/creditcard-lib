package pl.rajca.creditcard;

class CreditCardApi {
    
    CreditCardPool pool;
    
    public CreditCardApi(CreditCardPool pool) {
        this.pool = pool;
    }
    public void withdraw(String cardNumber, double money) {
        pool.find(cardNumber).withdraw(money);
  
    }
}