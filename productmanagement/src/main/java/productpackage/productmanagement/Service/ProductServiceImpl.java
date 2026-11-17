package productpackage.productmanagement.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import productpackage.productmanagement.DTO.ProductDTO;
import productpackage.productmanagement.Model.ProductModel;
import productpackage.productmanagement.Repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService{
    @Autowired
    private ProductRepository productRepository;

    @Override
    public String addProduct(ProductDTO productDTO){
        ProductModel productModel = new ProductModel(productDTO.getProductId(),productDTO.getProductName(),productDTO.getProductPrice(),productDTO.getProductQuantity(),productDTO.getProductCategory(),productDTO.getProductDescription());
        productRepository.save(productModel);
        return "Product Data Stored Successfully";
    }
}
