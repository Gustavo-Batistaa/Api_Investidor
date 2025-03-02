package teste_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import teste_api.enitity.Ativo;

public interface AtivoRepository extends JpaRepository<Ativo, Integer> {
}
