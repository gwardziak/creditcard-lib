package pl.rajca.creditcard;

import org.junit.Assert;
import org.junit.Test;

public class CreditCardTest {

    @Test
    public void allowAssignLimitToCard() {
        CreditCard card = new CreditCard();

        card.assignLimit(2000);

        Assert.assertTrue(card.getLimit() == 2000);
    }
    
    @Test
    public void canBlockCreditCard(){
        CreditCard card = new CreditCard();
        
        card.block();
    
        
        Assert.assertTrue(card.isBlocked());
    }

    @Test
    public void withdrawDecreaseAvaivableFunds() {
        CreditCard card = new CreditCard();
        
        card.assignLimit(2000);
        card.withdraw(2000);
        
        Assert.assertTrue(card.getAccountBalance() == 0);
    }
    
    
    @Test
    public void repayDebt() {
        CreditCard card = new CreditCard();
        card.assignLimit(2500);
        card.withdraw(1000);
        card.withdraw(1000);
        card.repay(500);
    
        Assert.assertTrue(card.getLimit() == 2000);
    }
}