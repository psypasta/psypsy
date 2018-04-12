public class Product {

    private int quantity;
    private String productName;
    private double buyValue;
    private double sellValue;
    private long barNumber;
    private ProductType type;
    private ProductGroup productGroup;


    private ProductType b;

    public Product(){

    }
    public Product(ProductGroup group) {
        this.productGroup = group;
    }

    public Product(int quantity, String productName, double buyValue, double sellValue, long barNumber, ProductGroup productGroup){
        this.quantity = quantity;
        this.productName = productName;
        this.buyValue = buyValue;
        this.sellValue = sellValue;
        this.barNumber = barNumber;
        this.productGroup = productGroup;
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

    public ProductGroup getProductGroup() {
        return productGroup;
    }

    public long getBarNumber() {
        return barNumber;
    }
}
