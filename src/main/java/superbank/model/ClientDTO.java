package superbank.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClientDTO {
    private String name;
    private String dateOfBirth;
    private String email;
    private String address;
}
