package teste_api.enitity;


import jakarta.persistence.*;
import lombok.*;
import teste_api.dto.CarteiraDto;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Carteira {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nome;
    private String investidor;

    public Carteira(CarteiraDto carteira) {
    }

    public Carteira(String nome, String investidor) {
        this.nome = nome;
        this.investidor = investidor;
    }

    public String getNome() {
        return nome;
    }

    public String getInvestidor() {
        return investidor;
    }

}
