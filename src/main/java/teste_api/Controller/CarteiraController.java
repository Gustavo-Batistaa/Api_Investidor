package teste_api.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import teste_api.dto.CarteiraDto;
import teste_api.dto.DadosAtualizadoscarteira;
import teste_api.enitity.Carteira;
import teste_api.repository.CarteiraRepository;
import teste_api.service.CarteiraService;

import java.util.List;

@RestController
@RequestMapping("api/carteira")

public class CarteiraController {

    @Autowired
    private CarteiraService carteiraService;
    @Autowired
    private CarteiraRepository repository;

    @PostMapping
    public ResponseEntity<CarteiraDto> salvarCarteira(@RequestBody CarteiraDto carteira) {
        CarteiraDto carteeiradto = carteiraService.salvarCarteira(carteira);
        return  ResponseEntity.status(HttpStatus.CREATED).body(carteeiradto);


    }

    @GetMapping
    public List<Carteira> buscarCarteira() {
        return carteiraService.buscarTodos();
    }

    @PutMapping
    public ResponseEntity atualizarCarteira(@RequestBody DadosAtualizadoscarteira dados) {
        return carteiraService.atualizarInformacoes(dados.id(), dados);

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> removerCarteira(@PathVariable Long id) {
        return carteiraService.desativarCarteira(id);



    }



}
