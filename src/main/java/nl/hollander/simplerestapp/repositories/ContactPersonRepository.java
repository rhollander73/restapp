package nl.hollander.simplerestapp.repositories;

import nl.hollander.simplerestapp.models.ContactPerson;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ContactPersonRepository extends CrudRepository<ContactPerson, Long> {
}
