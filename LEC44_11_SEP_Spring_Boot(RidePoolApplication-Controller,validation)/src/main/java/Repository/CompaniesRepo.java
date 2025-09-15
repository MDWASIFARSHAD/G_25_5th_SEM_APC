package Repository;

import Entity.Companies;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;
@Repository
public interface CompaniesRepo extends JpaRepository<Companies, Integer> {
}
