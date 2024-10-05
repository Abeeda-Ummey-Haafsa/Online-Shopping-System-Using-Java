package pkg23549009002;
public class Toiletries extends Product{
    public Toiletries(String productName,int productPrice,int availableProducts,String measurementType) {
        super(productName, productPrice, availableProducts,measurementType);
    }
    @Override
    void setPrice(int price){ this.productPrice = price; }  
}
