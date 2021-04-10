package pl.khomenko.demo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogiRepository extends CrudRepository<LogiAcc, Long> {

}
