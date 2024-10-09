package Controller;

import java.lang.reflect.Type;
import java.util.List;
import java.util.regex.Pattern;

import Entity.Product;
import Exception.InvalidProducIdException;
import  Exception.InvalidProductNameException;
import Exception.InvalidQuantityException;
import Service.ProductService;
import Exception.NotFoundProductIdException;
public class ProductController {
    private List<Product> products;
    private ProductService ps;
    public ProductController(ProductService ps) {
        this.ps = ps;
        this.products = ps.getProducts();
    }
    public  String validateProductId(String productId) throws InvalidProducIdException{
        if (!Pattern.matches("(MS|NE|SE)[0-9]{6}", productId)) {
            throw new InvalidProducIdException("Định dạng ID Sản Phẩm Không Hợp Lệ");
        }
        else{
            return productId;
        }
    }
    public String validateProductName(String productName) throws InvalidProductNameException {
        if (!Pattern.matches("[a-zA-Z\\s]+", productName)) {
            throw new InvalidProductNameException("Định Dạng Tên Sản Phẩm Không Đúng!");
        }
        else{
            return productName;
        }
    }
    public int validateProductQuantity(String productQuantity){
        int quantity = Integer.parseInt(productQuantity);
        try{
            if(quantity < 0){
                throw new InvalidQuantityException("Số lượng sản phẩm phải là số dương");
            }
        }catch (InvalidQuantityException ex){
            System.out.println("Định dạng số lượng không hợp lệ!");
            return 0;
        }
        return quantity;
    }
    public Product getProductById(String id){
        try{
            Product product = ps.getProductById(id);
            return product;
        } catch (NotFoundProductIdException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

}
