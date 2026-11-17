package productpackage.productmanagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import productpackage.productmanagement.Model.ProductModel;

@Repository
public interface ProductRepository extends JpaRepository<ProductModel,Integer>{

}