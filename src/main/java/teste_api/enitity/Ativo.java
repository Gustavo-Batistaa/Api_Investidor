package teste_api.enitity;


import jakarta.persistence.*;
import lombok.*;
import teste_api.dto.AtivoDto;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Ativo {
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;

        private String nome;
        private String tipo;
        private Double valorAtual;

        @ManyToOne
        @JoinColumn(name = "carteiraid_id")
        private Carteira carteiraid;


        public Ativo(AtivoDto ativo) {
        }
}
