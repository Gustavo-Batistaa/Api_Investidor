package teste_api.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import teste_api.dto.CarteiraDto;
import teste_api.dto.DadosAtualizadoscarteira;
import teste_api.enitity.Carteira;
import teste_api.repository.CarteiraRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CarteiraService {
    @Autowired
    private CarteiraRepository carteiraRepository;

    public CarteiraDto salvarCarteira(CarteiraDto carteiraDto) {
        Carteira carteira = new Carteira(carteiraDto.nome(), carteiraDto.investidor());
        Carteira carteira1 = carteiraRepository.save(carteira);
        return new CarteiraDto(carteira1.getId(), carteira1.getNome(), carteira1.getInvestidor());
    }

    public List<Carteira> buscarTodos() {
        return carteiraRepository.findAll();

    }

    @Transactional
    public ResponseEntity<CarteiraDto> atualizarInformacoes(Long id, DadosAtualizadoscarteira dados) {
        Optional<Carteira> carteiraOptional = carteiraRepository.findById(id);

        if (carteiraOptional.isEmpty()) {
            return ResponseEntity.notFound().build(); // Retorna erro 404 se o ID não existir
        }

        // Obtém a entidade do banco de dados
        Carteira carteira = carteiraOptional.get();

        // Atualiza apenas os campos que não são nulos
        if (dados.nome() != null) {
            carteira.setNome(dados.nome());
        }
        if (dados.investidor() != null) {
            carteira.setInvestidor(dados.investidor());
        }

        // Salva a entidade modificada no banco
        carteiraRepository.save(carteira);

        // Retorna os dados atualizados como DTO
        CarteiraDto carteiraDto = new CarteiraDto(carteira.getId(), carteira.getNome(), carteira.getInvestidor());
        return ResponseEntity.ok(carteiraDto);
    }



}





