package superbank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import superbank.model.ClientDTO;
import superbank.service.AccountProcessorService;

import java.net.http.HttpResponse;

@RequestMapping(path = "/super-bank/v1/")
@RestController
public class SuperBankController {

    @Autowired
    AccountProcessorService accountProcessorService;

    @PostMapping("/new-client")
    public ResponseEntity<String> createClient(@RequestBody ClientDTO clientDTO){
         accountProcessorService.newClient(clientDTO);
         return ResponseEntity.status(200).body("New client created.");
    }

    @GetMapping("/healthcheck")
    public ResponseEntity<String> healthCheck(){
        return ResponseEntity.ok("UP");
    }


}
