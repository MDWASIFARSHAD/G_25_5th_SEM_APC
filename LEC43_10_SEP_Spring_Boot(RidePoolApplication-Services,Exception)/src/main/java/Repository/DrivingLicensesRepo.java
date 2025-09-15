package Repository;

import Entity.DrivingLicenses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface DrivingLicensesRepo extends JpaRepository<DrivingLicenses, Integer> {
    @Query("SELECT d FROM DrivingLicenses d WHERE d.user.id = :userId")
    Optional<DrivingLicenses> findByUserId(@Param("userId") Integer userId);
}
