public class Product {

    private int quantity;
    private String productName;
    private double buyValue;
    private double sellValue;
    private long barNumber;


    public Product(){

    }

    public Product(int quantity, String productName, double buyValue, double sellValue, long barNumber){
        this.quantity = quantity;
        this.productName = productName;
        this.buyValue = buyValue;
        this.sellValue = sellValue;
        this.barNumber = barNumber;
    }


    public void createProduct(int quantity, String productName, double buyValue, double sellValue, long barNumber){
        this.quantity = quantity;
        this.productName = productName;
        this.buyValue = buyValue;
        this.sellValue = sellValue;
        this.barNumber = barNumber;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getProductName() {
        return productName;
    }

    public double getBuyValue() {
        return buyValue;
    }

    public double getSellValue() {
        return sellValue;
    }

    public long getBarNumber() {
        return barNumber;
    }
}
