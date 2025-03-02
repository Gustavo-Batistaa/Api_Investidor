package teste_api.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import teste_api.dto.CarteiraDto;
import teste_api.enitity.Carteira;
import teste_api.repository.CarteiraRepository;

@Service
public class CarteiraService {
    @Autowired
    private CarteiraRepository carteiraRepository;

    public CarteiraDto salvarCarteira(CarteiraDto carteiraDto) {
        Carteira carteira = new Carteira(carteiraDto.nome(), carteiraDto.investidor());
        Carteira carteira1 = carteiraRepository.save(carteira);
        return new CarteiraDto(carteira1.getNome(),carteira1.getInvestidor());
    }

}
