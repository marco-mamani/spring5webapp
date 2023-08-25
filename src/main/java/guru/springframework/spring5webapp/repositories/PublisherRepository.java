package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by marco on 8/24/2023.
 */
public interface PublisherRepository extends CrudRepository<Publisher, Long> {

}
