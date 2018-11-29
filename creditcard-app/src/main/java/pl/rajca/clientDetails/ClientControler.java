package pl.rajca.clientDetails;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/")

class ClientControler {
    
    
    @Autowired
    ClientDetailsRepository() {};

    @GetMapping("/clients")
    public ClientDetails[] list() {
        return new ClientDetails[] {
            new ClientDetails("Andrzej");    
        }; 
    }
    
    @PostMapping("/clients")
    public void createUser(@RequestBody ClientDetails clientDetails) {
        users.add(clientDetails);
    }
    
}