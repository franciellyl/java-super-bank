package superbank.service;

import org.springframework.stereotype.Component;
import superbank.model.Client;

@Component
public interface AccountProcessorService {
    void newClient(Client client);
}
