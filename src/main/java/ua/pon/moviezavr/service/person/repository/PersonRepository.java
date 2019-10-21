package ua.pon.moviezavr.service.person.repository;

import org.springframework.data.repository.CrudRepository;
import ua.pon.moviezavr.service.person.entity.PersonEntity;

public interface PersonRepository extends CrudRepository<PersonEntity, Long> {
}
