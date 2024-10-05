package pkg23549009002;
import java.util.ArrayList;
import java.util.Scanner;
// @author Abeeda
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        GroceryProduct grocery1 = new GroceryProduct("Rice", 60, 45, "kg");
        GroceryProduct grocery2 = new GroceryProduct("Pasta", 70, 90, "packet");
        GroceryProduct grocery3 = new GroceryProduct("Flour", 75, 150, "packet");
        GroceryProduct grocery4 = new GroceryProduct("Cooking Oil", 95, 250, "1 Liter Bottle");
        GroceryProduct grocery5 = new GroceryProduct("Salt", 45, 70, "kg");
        GroceryProduct grocery6 = new GroceryProduct("Spices", 35, 10, "packet");
        ArrayList<GroceryProduct> groceryList = new ArrayList<GroceryProduct>()
        {{add(grocery1);add(grocery2);add(grocery3);add(grocery4);add(grocery5);add(grocery6);}};
        CannedProduct cannedProduct1 = new CannedProduct("Canned Fish", 150, 50, "Can");
        CannedProduct cannedProduct2 = new CannedProduct("Canned Fruits", 100, 50, "Can");
        CannedProduct cannedProduct3 = new CannedProduct("Canned Meat", 300, 50, "Can");
        CannedProduct cannedProduct4 = new CannedProduct("Canned Soup", 70, 50, "Can");
        CannedProduct cannedProduct5 = new CannedProduct("Canned Beans", 95, 50, "Can");
        CannedProduct cannedProduct6 = new CannedProduct("Canned Tomatoes", 50, 50, "Can");
        ArrayList<CannedProduct> cannedProductList = new ArrayList<CannedProduct>() {
            {add(cannedProduct6);add(cannedProduct5);add(cannedProduct4);add(cannedProduct3);add(cannedProduct2);add(cannedProduct1);}};
        Vegetables vegetable1 = new Vegetables("Potatoes", 30, 50, "kg");
        Vegetables vegetable2 = new Vegetables("Tomatoes", 20, 50, "kg");
        Vegetables vegetable3 = new Vegetables("Onions", 60, 70, "kg");
        Vegetables vegetable4 = new Vegetables("Eggplant", 15, 10, "kg");
        Vegetables vegetable5 = new Vegetables("Broccoli", 30, 7, "kg");
        ArrayList<Vegetables> vegetableList = new ArrayList<Vegetables>(){{add(vegetable1);add(vegetable2);add(vegetable3);add(vegetable4);add(vegetable5); }};

        BakeryProduct bakeryItem1 = new BakeryProduct("Bread", 30, 40, "Packet");
        BakeryProduct bakeryItem2 = new BakeryProduct("Hamburger buns", 40, 30, "Piece");
        BakeryProduct bakeryItem3 = new BakeryProduct("Donuts", 40, 10, "Piece");
        BakeryProduct bakeryItem4 = new BakeryProduct("Cakes", 50, 20, "Piece");
        BakeryProduct bakeryItem5 = new BakeryProduct("Biscuits", 70, 25, "Packet");
        BakeryProduct bakeryItem6 = new BakeryProduct("Pastries", 35, 12, "Piece");
        ArrayList<BakeryProduct> bakeryItemList = new ArrayList<BakeryProduct>(){{add(bakeryItem1);
            add(bakeryItem2);add(bakeryItem3);add(bakeryItem4);add(bakeryItem5);add(bakeryItem6);}};
        Drinks drinksItem1 = new Drinks("Sprite", 25, 50, "Bottle");
        Drinks drinksItem2 = new Drinks("CocaCola", 30, 50, "Bottle");
        Drinks drinksItem3 = new Drinks("Bruvana", 40, 50, "Bottle");
        Drinks drinksItem4 = new Drinks("Mojo", 20, 50, "Bottle");
        Drinks drinksItem5 = new Drinks("SMC Electrolite Drinks", 35, 50, "Bottle");
        Drinks drinksItem6 = new Drinks("Drinko", 25, 50, "Bottle");
        Drinks drinksItem7 = new Drinks("Pran Mango Juice", 20, 50, "Bottle");
        ArrayList<Drinks> drinksItem = new ArrayList<Drinks>(){{add(drinksItem1);add(drinksItem2);add(drinksItem3);add(drinksItem4);add(drinksItem5);add(drinksItem6);add(drinksItem7);}};
        Toiletries toiletriesItem1 = new Toiletries("Soap", 50, 40, "Packet");
        Toiletries toiletriesItem2 = new Toiletries("Shampoo", 175, 40, "Bottle");
        Toiletries toiletriesItem3 = new Toiletries("Shower Jel", 250, 40, "Bottle");
        Toiletries toiletriesItem4 = new Toiletries("Face Wash", 150, 40, "Bottle");
        Toiletries toiletriesItem5 = new Toiletries("Dettol Hand Wash", 80, 40, "Bolttle");
        Toiletries toiletriesItem6 = new Toiletries("Body Spray", 350, 40, "Bottle");
        ArrayList<Toiletries> toiletriesItem = new ArrayList<Toiletries>() {{add(toiletriesItem1);add(toiletriesItem2);add(toiletriesItem3);add(toiletriesItem4);add(toiletriesItem5);add(toiletriesItem6);}};
        Product productList = new Product(groceryList, cannedProductList,bakeryItemList, vegetableList, drinksItem, toiletriesItem);
        User user1 = new User("Reefah Tasnia", "reefah004@gmail.com", "23549009004", "User");
        User user2 = new User("Afia Tasnia", "afia008@gmail.com", "23549009008", "User");
        User user3 = new User("Fuad Al Hasan", "fuad056@gmail.com", "23549009056", "User");
        ArrayList<User> userList = new ArrayList<User>(){{add(user1);add(user2);add(user3);}};
        Admin admin1 = new Admin("Alice", "alice0024@gmail.com", "ALiCE2024", "Admin");
        SuperMarket market = new SuperMarket("BIG BAZAR", userList, productList);
        while (true) {
            System.out.println("Select an option - ");
            System.out.println("1. Create an account");
            System.out.println("2. Already have an account! Login");
            System.out.println("3. EXIT");
            int x = input.nextInt();
            if (x == 1) {
                System.out.println("Enter your name - ");
                String newName = input.nextLine();
                input.nextLine();
                System.out.println("Enter your Email - ");
                System.out.println("i.g. @gmail.com");
                String newEmail = input.nextLine();
                input.nextLine();
                System.out.println("Enter a password - ");
                System.out.println("Password must have at least 8 characters/numbers");
                String newPassword = input.nextLine();
                input.nextLine();
                User newUser = new User();
                newUser.setName(newName);
                newUser.setEmail(newEmail);
                newUser.setPassword(newPassword);
                newUser.setType("User");
                market.userList.add(newUser);
            } 
            else if (x == 2) {
                System.out.println("Are you a user?");
                System.out.println("1. Yes");
                System.out.println("2. No");
                int y = input.nextInt();
                input.nextLine();
                if (y == 1) {    // FOR USER LOGIN
                    System.out.println("Enter your Email - ");
                    System.out.println("i.g. @gmail.com");
                    while (true) {
                        String Email = input.nextLine();
                        input.nextLine();
                        boolean check = false;
                        for (User u : userList) {
                            if (Email.equals(u.email)) {
                                check = true;
                                break;
                            }
                        }
                        if (check == true) {  // EMAIL MATCHED PROCCED TO CHECK PASSWORD
                            System.out.println("Enter a password - ");
                            System.out.println("Password must have at least 8 characters/numbers");
                            while (true) {
                                String Password = input.nextLine();
                                boolean passCheck = false;
                                for (User u : userList) {
                                    if (Password.equals(u.password)) {
                                        passCheck = true;  // change made
                                        System.out.println("Welcome to " + market.marketName);
                                        break;
                                    }
                                }
                                if (passCheck == true) break;
                                else {
                                    System.out.println("Incorrect Password !!! ");
                                    System.out.println("Enter a correct password -");
                                }
                            }  break;
                        } else {
                            System.out.println("Invalid Email !!! User Not Found");
                            System.out.println("Enter a valid email");
                        }
                    }
                    while (true) {
                        System.out.println("Select an option - ");   //AFTER LOGGED IN
                        System.out.println("1. Shop Now");
                        System.out.println("2. View Cart");
                        System.out.println("3. Checkout");
                        System.out.println("4. Logout");
                        int pick = input.nextInt();
                        if (pick == 1) System.out.println(market.shopping());
                        else if (pick == 2) {
                            if (market.cart.isEmpty()) {
                                System.out.println("Cart is empty.Buy product....");
                            } else {
                                for (int i = 0; i < market.cart.size(); i++) {
                                    System.out.print("Product Name :" + market.cart.get(i).productName + "  ");
                                    System.out.println("Price :" + market.cart.get(i).productPrice + " tk");
                                }
                            }
                        } else if (pick == 3) {
                            System.out.println("Total Amount - " + Product.totalAmount);
                            System.out.print("Enter amount - ");
                            int clearance = input.nextInt();
                            if (clearance > Product.totalAmount) {
                                int calculate = clearance - Product.totalAmount;
                                System.out.println("Here is your " + calculate + " tk.Thank you.");
                            } else if (clearance < Product.totalAmount) {
                                int calculate = Product.totalAmount - clearance;
                                System.out.println("You need to give " + calculate + " tk more.");
                            } else {
                                System.out.println("Thank You !!!");
                            }
                            Product.totalAmount = 0;
                            market.cart.clear();
                        } else {
                            System.out.println("        ...Successfully Logged Out...       ");
                            break;
                        }
                    }
                } else if (y == 2) {   // FOR ADMIN LOGIN
                    System.out.println("Enter your Email - ");
                    System.out.println("i.g. @gmail.com");
                    while (true) {
                        String Email = input.nextLine();
                        boolean check = false;
                        if (Email.equals(admin1.email)) check = true;
                        if (check == true) {  // EMAIL MATCHED PROCCED TO CHECK PASSWORD
                            System.out.println("Enter a password - ");
                            System.out.println("Password must have at least 8 characters/numbers");
                            while (true) {
                                String Password = input.nextLine();
                                boolean passCheck = false;
                                if (Password.equals(admin1.password)) {
                                    System.out.println("    Welcome to "+market.marketName);
                                    passCheck = true;
                                }
                                if (passCheck == true) break;
                                else {
                                    System.out.println("Incorrect Password !!! ");
                                    System.out.println("Enter a correct password -");
                                }
                            } break;
                        } else {
                            System.out.println("Invalid Email !!! User Not Found");
                            System.out.println("Enter a valid email");
                        }
                    }
                    while (true) {
                        System.out.println("Select an option - ");
                        System.out.println("1. See Available Products");
                        System.out.println("2. Add New Products");
                        System.out.println("3. Remove Products");
                        System.out.println("4. Change Product Price");
                        System.out.println("5. Logout");
                        int z = input.nextInt();
                        if ( z == 1 )      market.productList.printDetails();
                        else if (z == 2) System.out.println(market.addProduct());
                        else if (z == 3) System.out.println(market.removeProduct());
                        else if (z == 4) System.out.println(market.changeProductPrice());
                        else break;  // if z is an invalid option
                    }
                }
            }   else break;
        }
    }
}