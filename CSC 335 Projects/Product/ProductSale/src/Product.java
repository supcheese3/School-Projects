/**
 * Name: Nathan Williamson   
 * Date: 11/2/2021
 * Assignment: Product.java
 * 
 * Purpose (Class Description): 
 */
public class Product {
    private String productID;
    private String productName;
    private double itemCost;
    private double productPrice;

    public Product(String productID, String productName, double itemCost, double productPrice){
        this.productID = productID;
        this.productName = productName;
        this.itemCost = itemCost;
        this.productPrice = productPrice;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getItemCost() {
        return itemCost;
    }

    public void setItemCost(double itemCost) {
        this.itemCost = itemCost;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductDisplay(){
        return productName+" ("+productID+")"+ "was bought for "+productPrice+" and sells for "+itemCost;
    }
}