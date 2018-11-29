package pl.rajca.clientDetails;

import java.util.Map;
import java.util.HashMap;

class ClientDetailsRepository {
    Map<Integer, ClientDetails> users = new TreeMap<>();
    
    public void add(Integer id, ClientDetails client) {
        users.put(id, client);
    }
    
    public ClientDetails find(Integer id) {
        return users.get(id);
    }
}
    
