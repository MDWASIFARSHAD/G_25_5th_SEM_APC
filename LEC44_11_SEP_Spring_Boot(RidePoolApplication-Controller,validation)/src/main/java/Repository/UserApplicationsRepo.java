package Repository;

import Entity.UserApplications;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface UserApplicationsRepo extends JpaRepository<UserApplications, Integer> {
    List<UserApplications> findByApplicationStatus(String applicationStatus);
}
