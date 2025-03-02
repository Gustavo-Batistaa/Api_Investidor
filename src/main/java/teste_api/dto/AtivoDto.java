package teste_api.dto;

import org.antlr.v4.runtime.misc.NotNull;
import teste_api.enitity.Carteira;

public record AtivoDto (
        @NotNull
        String nome,
        @NotNull
        String tipo,
        @NotNull
        Double valorAtual,
        @NotNull
        Carteira carteiraid ){
}
