package pl.rajca.creditcard;

import java.util.Map;
import java.util.HashMap;

class CreditCardPool {
    private Map<String, CreditCard> cards = new HashMap<String, CreditCard>();
    
    public void add(CreditCard card) {
        cards.put(card.getNumber(), card);
    }
    
    public CreditCard find(String number) {
        return cards.get(number);
    }
}