package yavirac.seguridad.repository;
import yavirac.seguridad.models.Career;
import org.springframework.data.repository.CrudRepository;

public interface CareerRepository extends CrudRepository <Career, Long> {
    
}
