package pl.rajca.creditcard;

import org.junit.Assert;
import org.junit.Test;

public class CreditCardApiTest {
    private final static double initialCredit = 200;
    private final static String cardNumber = "123456789";
    private CreditCardApi api;
    private CreditCardPool creditCardPool;
    
    @Test
    public void handleWithdraw() {
        thereIsCreditCardPool();
        thereIsCreditCardApi();
        thereIsCardWithNumber(cardNumber);
        
        api.withdraw(cardNumber, 20);
        
        saldoOfCreditCardWithIdEquals(cardNumber, 180);
    }
    
    private void thereIsCreditCardPool() {
        this.creditCardPool = new CreditCardPool();
    }
    
    private void thereIsCreditCardApi() {
        this.api = new CreditCardApi(this.creditCardPool);
    }
    
    private void thereIsCardWithNumber(String cardNumber) {
        CreditCard card = new CreditCard(cardNumber);
        card.assignLimit(initialCredit);
        
        creditCardPool.add(card);
        
    }
    
    private void saldoOfCreditCardWithIdEquals(String cardNumber, double expectedBalance) {
        CreditCard card = creditCardPool.find(cardNumber);
        Assert.assertTrue(card.getAccountBalance() == expectedBalance);
        
    }
}