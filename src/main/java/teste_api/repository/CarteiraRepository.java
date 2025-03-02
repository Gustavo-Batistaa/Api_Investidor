package teste_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import teste_api.enitity.Carteira;

public interface CarteiraRepository extends JpaRepository<Carteira, Integer> {


}
