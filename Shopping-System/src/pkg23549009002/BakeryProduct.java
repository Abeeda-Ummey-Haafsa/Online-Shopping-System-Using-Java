package pkg23549009002;
public class BakeryProduct extends Product{
    public BakeryProduct(String productName,int productPrice,int availableProducts,String measurementType) {
        super(productName,productPrice,availableProducts,measurementType);
    }
    @Override
    void setPrice(int price){ this.productPrice = price; }    
}
