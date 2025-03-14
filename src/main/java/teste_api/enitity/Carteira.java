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
    private boolean ativada;


    public Carteira() {}

    public Carteira(String nome, String investidor, boolean ativada) {
        this.nome = nome;
        this.investidor = investidor;
        this.ativada = true;
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

    public Boolean getAtivada(boolean ativada) {
        return ativada;


    }

    public void setAtivada(boolean ativada) {
        this.ativada = ativada;
    }


}
