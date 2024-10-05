package pkg23549009002;
public class Vegetables extends Product{
    public Vegetables(String productName,int productPrice,int availableProducts,String measurementType) {
        super(productName,productPrice,availableProducts,measurementType);
    }
    @Override
    void setPrice(int price){ this.productPrice = price; }  
}
