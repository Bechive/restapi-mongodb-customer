
package customer;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "customer", path = "customer")
public interface CustomerRepository extends MongoRepository<Customer, String> {
	
	List<Customer> findByFirstName(@Param("firstName") String firstName);
	List<Customer> findByLastName(@Param("lastName") String lastName);
	List<Customer> findByEmail(@Param("email") String email);

}
