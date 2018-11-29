package pl.rajca.creditcard;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/api/cards")

class CreditCardController {
    
    CreditCardApi api;
    
    @Autowired
    public CreditCardController(CreditCardApi api) {
        this.api = api;
    }

    @RequestMapping("/{number}")
    public CardInfo cardBalance(@PathVariable String number) {
        CardInfo info = new CardInfo();
        info.number = number;
        info.balance = 3000;
    
        return info;
    }
    
    @PostMapping("/{number}/{money}")
    public void withdraw(
        @PathVariable String number, 
        @PathVariable double money) {
            
        api.withdraw(number, money);
        
    }
    
    @PostMapping("/withdraw")
    public void withdraw(
        @RequestBody CardWithdrawCommand withdraw) {
            
        api.withdraw(number, money);
        
    }
    
    class CardWithdrawCommand {
        public String number;
        public double money;
        
        
    }
    
    class CardInfo {
        public String number;
        public double balance;
    }
}