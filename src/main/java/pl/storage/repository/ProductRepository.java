package pl.storage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pl.storage.model.ProductEntity;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Long> {

    ProductEntity findFirstByProductName(String productName);

    @Query("select p from ProductEntity p where p.productName like :productName")
    List<ProductEntity> findByProductName(@Param("productName") String productName);

    ProductEntity findFirstByProductCode(String productCode);

    @Query("select p from ProductEntity p where p.productCode like :productCode")
    List<ProductEntity> findByProductCode(@Param("productCode") String productCode);

    @Query("select p from ProductEntity p")
    List<ProductEntity> OrderByLastModifiedDescTop10();


}
