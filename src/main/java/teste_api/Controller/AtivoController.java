package teste_api.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import teste_api.dto.AtivoDto;
import teste_api.enitity.Ativo;
import teste_api.repository.AtivoRepository;
import teste_api.service.AtivoService;

@Controller
@RestController
@RequestMapping("/ativos")
public class AtivoController {

    @Autowired

    private AtivoRepository ativoRepository;

    @Transactional
    @PostMapping
    public void salvarBanco(@RequestBody AtivoDto ativo) {
    ativoRepository.save(new Ativo(ativo));


    }


}
