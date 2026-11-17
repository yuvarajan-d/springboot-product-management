package productpackage.productmanagement.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import productpackage.productmanagement.DTO.ProductDTO;
import productpackage.productmanagement.Service.ProductService;


@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductService  productService;

    @PostMapping("/add")
    public String addProduct(@RequestBody ProductDTO productDTO){
        return productService.addProduct(productDTO);
    }
}
