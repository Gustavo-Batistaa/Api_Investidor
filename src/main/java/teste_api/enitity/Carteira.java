package teste_api.enitity;


import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@Builder
@Table(name="carteira")
public class Carteira {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String nome;
    private String investidor;

    public Carteira() {

    }

    public Carteira(String nome, String investidor) {
        this.nome = nome;
        this.investidor = investidor;
    }


    public void setInvestidor(String investidor) {
        this.investidor = investidor;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getInvestidor() {
        return investidor;
    }


}
