package pkg23549009002;
import java.util.ArrayList;
public class Product {
    String productName;
    int productPrice;
    int availableproducts;
    String measurementType;
    static int totalAmount = 0;
    ArrayList<GroceryProduct> groceryProduct;
    ArrayList<CannedProduct> cannedProduct;
    ArrayList<BakeryProduct> bakeryProduct;
    ArrayList<Vegetables> vegetables;
    ArrayList<Drinks> drinks;
    ArrayList<Toiletries> toiletries;
    Product(String productName,int productPrice,int availableProducts,String measurementType){
        this.productName = productName;
        this.productPrice = productPrice;
        this.availableproducts = availableProducts;
        this.measurementType=measurementType;
    }
    Product(ArrayList<GroceryProduct>groceryProduct,ArrayList<CannedProduct>cannedProduct,
        ArrayList<BakeryProduct> bakeryProduct,ArrayList<Vegetables> vegetables,ArrayList<Drinks> drinks,ArrayList<Toiletries> toiletries){
        this.groceryProduct = groceryProduct;
        this.cannedProduct=cannedProduct;
        this.bakeryProduct=bakeryProduct;
        this.vegetables=vegetables;
        this.drinks=drinks;
        this.toiletries=toiletries;
    }
    void setPrice(int price)  {  this.productPrice = price;   }
    int getPrice()   {  return productPrice;   }
    boolean amountCounter()  {  return true;  }
    void printDetails(){
        System.out.println("        Available Grocery Products are - ");
        for(Product list:groceryProduct){
            System.out.println(list.productName +"     "+list.productPrice+"taka  ");
            System.out.println("Currently Available Quantity "+list.availableproducts+" "+list.measurementType);
        }System.out.println("        Available Canned Products are - ");
        for(Product list:cannedProduct){
            System.out.println(list.productName +"     "+list.productPrice+"taka  ");
            System.out.println("Currently Available Quantity "+list.availableproducts+" "+list.measurementType);
        }System.out.println("        Available Bakery Items are - ");
        for(Product list:bakeryProduct){
            System.out.println(list.productName +"     "+list.productPrice+"taka  ");
            System.out.println("Currently Available Quantity "+list.availableproducts+" "+list.measurementType);
        }System.out.println("        Available Vegetables are - ");
        for(Product list:vegetables){
            System.out.println(list.productName +"     "+list.productPrice+"taka  ");
            System.out.println("Currently Available Quantity "+list.availableproducts+" "+list.measurementType);
        }System.out.println("        Available Drinks are - ");
        for(Product list:drinks){
            System.out.println(list.productName +"     "+list.productPrice+"taka  ");
            System.out.println("Currently Available Quantity "+list.availableproducts+" "+list.measurementType);
        }System.out.println("        Available Toiletries Product are - ");
        for(Product list:toiletries){
            System.out.println(list.productName +"     "+list.productPrice+"taka  ");
            System.out.println("Currently Available Quantity "+list.availableproducts+" "+list.measurementType);
        }
    }
}