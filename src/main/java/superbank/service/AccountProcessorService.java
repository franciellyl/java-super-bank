package superbank.service;

import org.springframework.stereotype.Component;
import superbank.model.ClientDTO;

@Component
public interface AccountProcessorService {
    void newClient(ClientDTO clientDTO);
}
