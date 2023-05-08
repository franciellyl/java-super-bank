package superbank.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Conta {
    private String numeroConta;
    private String agencia;
    private Cliente correntista;
    private Double valorConta;
}
