package superbank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import superbank.model.Client;
import superbank.service.AccountProcessorService;
import superbank.service.impl.AccountProcessorServiceImpl;

@RequestMapping(path = "/super-bank/v1/")
@RestController
public class SuperBankController {

    @Autowired
    AccountProcessorService accountProcessorService;

    @PostMapping("/new-client")
    public void createClient(@RequestBody Client clientDTO){
         accountProcessorService.newClient(clientDTO);

    }

    @GetMapping("/healthcheck")
    public ResponseEntity<String> healthCheck(){
        return ResponseEntity.ok("UP");
    }


}
