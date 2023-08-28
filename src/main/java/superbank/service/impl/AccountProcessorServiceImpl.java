package superbank.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import superbank.model.ClientDTO;
import superbank.service.AccountProcessorService;

@Service
@Slf4j
public class AccountProcessorServiceImpl implements AccountProcessorService {

    @Override
    public void newClient(ClientDTO clientDTO) {
        log.info("Creating new client");
        //In progress
    }
}
