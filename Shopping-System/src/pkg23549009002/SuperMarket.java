package pkg23549009002;
import java.util.ArrayList;
import java.util.Scanner;
public class SuperMarket {
    final String marketName;
    ArrayList<User>userList;
    Product productList;
    ArrayList<Product> cart=new ArrayList<Product>();
    SuperMarket(String marketName,ArrayList<User>userList,Product productList){
        this.marketName=marketName;
        this.userList=userList;
        this.productList=productList;
    }
    Scanner input=new Scanner(System.in);
    String addProduct(){
        System.out.println("What type of products do you want to add?");
        System.out.println("1. Grocery Product 2. Canned Product  3. Bakery Product 4. Vegetables  5. Drinks   6. Toiletries");
        System.out.println("Select an option - ");
        int add = input.nextInt();
        input.nextLine();
        if(add!=1 && add!=2 && add!=3 && add!=4 && add!=5 && add!=6)  return "Product Type Didn't Match !!! Process Failed ";
        System.out.println("Enter a product name - ");
        String addProduct = input.nextLine();
        System.out.println("Enter the price (per unit) - ");
        int addprice = input.nextInt();
        System.out.println("Enter available total quantity of the product - ");
        int addQuantity = input.nextInt();
        System.out.println("Enter the measurment type for this product - ");
        String addType = input.nextLine();
        if (add == 1) {
            GroceryProduct newProduct = new GroceryProduct(addProduct, addprice, addQuantity, addType);
            productList.groceryProduct.add(newProduct);
        }  if (add == 2) {
            CannedProduct newProduct = new CannedProduct(addProduct, addprice, addQuantity, addType);
            productList.cannedProduct.add(newProduct);
        }  if (add == 3) {
            BakeryProduct newProduct = new BakeryProduct(addProduct, addprice, addQuantity, addType);
            productList.bakeryProduct.add(newProduct);
        }  if (add == 4) {
            Vegetables newProduct = new Vegetables(addProduct, addprice, addQuantity, addType);
            productList.vegetables.add(newProduct);
        }  if (add == 5) {
            Drinks newProduct = new Drinks(addProduct, addprice, addQuantity, addType);
            productList.drinks.add(newProduct);
        }  if (add == 6) {
            Toiletries newProduct = new Toiletries(addProduct, addprice, addQuantity, addType);
            productList.toiletries.add(newProduct);
        } 
        System.out.println("    New Product "+addProduct+" Added to the list     ");
        return "    New Product Added Sucessfully !!!   ";
    }
    String removeProduct(){
        System.out.println("What type of products do you want to remove?");
        System.out.println("1. Grocery Product 2. Canned Product  3. Bakery Product 4. Vegetables "
                + "5. Drinks   6. Toiletries");
        System.out.println("Select an option - ");
        int add = input.nextInt();
        if(add!=1 && add!=2 && add!=3 && add!=4 && add!=5 && add!=6)
            return "Product Type Didn't Match !!! Process Failed ";
        System.out.println("Enter a product name - ");
        String revProduct = input.nextLine();
        if (add == 1) {  // ConcurrentModificationException  can occur
            for (GroceryProduct product : productList.groceryProduct) {
                if (revProduct.equalsIgnoreCase(product.productName))  productList.groceryProduct.remove(product);
            }
        }
        if (add == 2) {
            for(CannedProduct product:productList.cannedProduct){
                if(revProduct.equalsIgnoreCase(product.productName))  productList.cannedProduct.remove(product);
            }
        }
        if (add == 3) {
            for(BakeryProduct product:productList.bakeryProduct){
                if(revProduct.equalsIgnoreCase(product.productName))    productList.bakeryProduct.remove(product);
            }
        }
        if (add == 4) {
            for(Vegetables product:productList.vegetables){
                if(revProduct.equalsIgnoreCase(product.productName))   productList.vegetables.remove(product);
            }
        }
        if (add == 5) {
            for(Drinks product:productList.drinks){
                if(revProduct.equalsIgnoreCase(product.productName))   productList.drinks.remove(product);
            }
        }
        if (add == 6) {
            for(Toiletries product:productList.toiletries){
                if(revProduct.equalsIgnoreCase(product.productName))  productList.toiletries.remove(product);
            }
        }
        return "        ...Product Removed Successfully...        ";
    }
    String changeProductPrice(){
        System.out.println("Select a category -");
        System.out.println("1. Grocery Product 2. Canned Product  3. Bakery Product 4. Vegetables "
                + "5. Drinks   6. Toiletries");
        System.out.println("Select an option - ");
        int add = input.nextInt();
        input.nextLine();
        if(add!=1 && add!=2 && add!=3 && add!=4 && add!=5 && add!=6)
            return "Product Type Didn't Match !!! Process Failed ";
        System.out.println("Enter a product name - ");
        String cngProduct = input.nextLine();
        if(add == 1){
            for (GroceryProduct product : productList.groceryProduct) {
                if (cngProduct.equalsIgnoreCase(product.productName)) {
                    int cngPrice=input.nextInt();
                    product.setPrice(cngPrice);
                }
            }
        }   if(add == 2){
            for (CannedProduct product : productList.cannedProduct) {
                if (cngProduct.equalsIgnoreCase(product.productName)) {
                    int cngPrice=input.nextInt();
                    product.setPrice(cngPrice);
                }
            }
        }   if(add == 3){
            for (BakeryProduct product : productList.bakeryProduct) {
                if (cngProduct.equalsIgnoreCase(product.productName)) {
                    int cngPrice=input.nextInt();
                    product.setPrice(cngPrice);
                }
            }
        }   if(add == 4){
            for (Vegetables product : productList.vegetables) {
                if (cngProduct.equalsIgnoreCase(product.productName)) {
                    int cngPrice=input.nextInt();
                    product.setPrice(cngPrice);
                }
            }
        }   if(add == 5){
            for (Drinks product : productList.drinks) {
                if (cngProduct.equalsIgnoreCase(product.productName)) {
                    int cngPrice=input.nextInt();
                    product.setPrice(cngPrice);
                }
            }
        }   if(add == 6){
            for (Toiletries product : productList.toiletries) {
                if (cngProduct.equalsIgnoreCase(product.productName)) {
                    int cngPrice=input.nextInt();
                    product.setPrice(cngPrice);
                }
            }
        }   return "        ...Price Changed...";
    }
    String shopping()  {
        System.out.println("Select a category -");
        System.out.println("1. Grocery Product 2. Canned Product  3. Bakery Product 4. Vegetables "
                + "5. Drinks   6. Toiletries");
        System.out.println("Select an option - ");
        int add = input.nextInt();
        input.nextLine();
        if(add!=1 && add!=2 && add!=3 && add!=4 && add!=5 && add!=6)
            return "Product Type Didn't Match !!! Process Failed ";
        boolean check=false;
        if(add==1)    {
        for(GroceryProduct product:productList.groceryProduct) 
            System.out.println("Product Name: "+product.productName +"   Price: "+product.productPrice);
        System.out.println("Enter a product name - ");
        String shopProduct = input.nextLine();
        System.out.println("Enter quantity - ");
        int quantity=input.nextInt();
        for(GroceryProduct product:productList.groceryProduct)    {
            if(shopProduct.equalsIgnoreCase(product.productName)){
                Product.totalAmount += product.productPrice * quantity;
                System.out.println(Product.totalAmount);
                check=true;
                cart.add(product);
                break;
            }
        }
        }   if(add == 2){
        for(CannedProduct product:productList.cannedProduct)
            System.out.println("Product Name: "+product.productName+"   Price: "+product.productPrice);
        System.out.println("Enter a product name - ");
        String shopProduct = input.nextLine();
        System.out.println("Enter quantity - ");
        int quantity=input.nextInt();
        for(CannedProduct product:productList.cannedProduct) {
            if(shopProduct.equalsIgnoreCase(product.productName)){
                Product.totalAmount += product.productPrice * quantity;
                check=true;
                cart.add(product);
                break;
            }
        }
        }   if(add==3){
        for(BakeryProduct product:productList.bakeryProduct)  System.out.println("Product Name: "+product.productName+"   Price: "+product.productPrice);
        System.out.println("Enter a product name - ");
        String shopProduct = input.nextLine();
        System.out.println("Enter quantity - ");
        int quantity=input.nextInt();
        for(BakeryProduct product:productList.bakeryProduct){
            if(shopProduct.equalsIgnoreCase(product.productName)){
                Product.totalAmount += product.productPrice * quantity;
                check=true;
                cart.add(product);
                break;
            } } }   if(add==4){
        for(Vegetables product:productList.vegetables) System.out.println("Product Name: "+product.productName +"   Price: "+product.productPrice);
        System.out.println("Enter a product name - ");
        String shopProduct = input.nextLine();
        System.out.println("Enter quantity - ");
        int quantity=input.nextInt();
        for(Vegetables product:productList.vegetables){
            if(shopProduct.equalsIgnoreCase(product.productName)){
                Product.totalAmount += product.productPrice * quantity;
                check=true;
                cart.add(product);
                break;
            } } }   if(add==5){
        for(Drinks product:productList.drinks) System.out.println("Product Name: "+product.productName+"   Price: "+product.productPrice);
        System.out.println("Enter a product name - ");
        String shopProduct = input.nextLine();
        System.out.println("Enter quantity - ");
        int quantity=input.nextInt();
        for(Drinks product:productList.drinks) {
            if(shopProduct.equalsIgnoreCase(product.productName)){
                Product.totalAmount += product.productPrice * quantity;
                check=true;
                cart.add(product);
                break;
            } 
        }
        }   
        if(add==6){
        for(Toiletries product:productList.toiletries) System.out.println("Product Name: "+product.productName+"   Price: "+product.productPrice);
        System.out.println("Enter a product name - ");
        String shopProduct = input.nextLine();
        System.out.println("Enter quantity - ");
        int quantity=input.nextInt();
        for(Toiletries product:productList.toiletries){
            if(shopProduct.equalsIgnoreCase(product.productName)){
                Product.totalAmount += product.productPrice * quantity;
                check=true;
                cart.add(product);
                break;
            } } }
        if(check) return "    Product Added To Cart   ";
        else return "    Not Available  ";
    }   
}