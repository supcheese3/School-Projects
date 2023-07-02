/**
 * Name: Nathan Williamson
 * Date: 11/2/2021
 * Assignment: ProductList.java
 * 
 * Purpose (Class Description): 
 */
import java.util.ArrayList;

public class ProductList {
    ArrayList<String> products = new ArrayList<String>();
    
    public ProductList(){
        products.fill(setInitialInventory());
    }

    public void setInitialInventory(){
        ArrayList<Product> products = new ArrayList<Product>();
        products.add(new Product("Ab231425", "PS5", 499.99, 1000));
        products.add(new Product("15415ad3", "Xbox One", 499.99, 600));
        products.add(new Product("adc32313", "Nintendo Switch OLED", 349.99, 500));
        products.add(new Product("gfer1223", "Oculus Quest 2", 299, 399.99));
        products.add(new Product("hete3215", "Something", 500, 400));
        
    }

    public void addProduct(ArrayList<Product> products){
        this.products.add(products);
    }

    public void removeProduct(ArrayList<Product> products){
        this.products.remove(products);
    }
/*
    public void sortProductsById(){
    }

    public void sortProductsByName(){
    }

    public void sortProductsByCost(){

    }

    public void sortProductsByPrice(){

    }

    public void getProductsDisplay(){

    }
*/

  
}