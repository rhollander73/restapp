package nl.hollander.simplerestapp.repositories;

import nl.hollander.simplerestapp.models.ProductInstallation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.math.BigDecimal;
import java.util.List;

@RepositoryRestResource
public interface ProductInstallationRepository extends CrudRepository<ProductInstallation, Long> {

    @RestResource(rel = "find-by-name", path="find-by-name")
    List<ProductInstallation> findByName(@Param("name") String name);

    @RestResource(rel = "find-by-outpower-between", path="find-by-outpower-between")
    List<ProductInstallation> findByOutPowerBetween(@Param("lower") BigDecimal lower, @Param("upper") BigDecimal upper);
}
