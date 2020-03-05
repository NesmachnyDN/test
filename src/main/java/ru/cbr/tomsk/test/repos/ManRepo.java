package ru.cbr.tomsk.test.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.cbr.tomsk.test.domain.Man;

@Repository
public interface ManRepo extends JpaRepository<Man, Long> {

}