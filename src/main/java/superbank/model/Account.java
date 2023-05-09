package superbank.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Account {
    private String numeroConta;
    private String agencia;
    private Client correntista;
    private Double valorConta;
}
