package superbank.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AccountDTO {
    private String numeroConta;
    private String agencia;
    private ClientDTO correntista;
    private Double valorConta;
}
