package superbank.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Client {
    private String nome;
    private String dataNascimento;
    private String cpf;
    private String profissao;
}
