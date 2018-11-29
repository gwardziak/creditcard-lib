package pl.rajca.creditcard;

import org.junit.Test;
import org.junit.Assert;

public class CreditCardPoolTest {
    
    private final static String number = "1234";
    
    @Test
    public void allowAddAndFindCard() {
        CreditCardPool pool = new CreditCardPool();
        CreditCard c = new CreditCard(number);
        
        pool.add(c);
        CreditCard loaded = pool.find(number);
        
        Assert.assertTrue(loaded.getNumber() == number);
    }
}