package ru.cbr.tomsk.test.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.cbr.tomsk.test.domain.LastName;

@Repository
public interface LastNameRepo extends JpaRepository<LastName, Long> {
}
