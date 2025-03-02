package teste_api.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import teste_api.dto.CarteiraDto;
import teste_api.service.CarteiraService;

@RestController
@RequestMapping("api/carteira")

public class CarteiraController {

    @Autowired
    private CarteiraService carteiraService;

    @PostMapping
    public ResponseEntity<CarteiraDto> salvarCarteira(@RequestBody CarteiraDto carteira) {
        CarteiraDto carteeiradto = carteiraService.salvarCarteira(carteira);
        return  ResponseEntity.status(HttpStatus.CREATED).body(carteeiradto);


    }

}
