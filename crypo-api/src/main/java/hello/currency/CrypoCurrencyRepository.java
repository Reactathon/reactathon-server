package hello.currency;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "currencies", path = "currencies")
public interface CrypoCurrencyRepository extends CrudRepository<CryptoCurrency, Long> {

}

