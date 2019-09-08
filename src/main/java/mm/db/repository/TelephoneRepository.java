package mm.db.repository;

import mm.db.model.Telephone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TelephoneRepository  extends JpaRepository<Telephone,Long> {
}
