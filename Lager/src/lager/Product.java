package lager;

public class Product {

    private int quantity;
    private String productName;
    private double buyValue;
    private double sellValue;
    private String articleNumber;
    private ProductGroup productGroup;


    public Product(){

    }

    public Product(ProductGroup group) {
        this.productGroup = group;
    }

    public Product(int quantity, String productName, double buyValue, double sellValue, String articleNumber){
        this.quantity = quantity;
        this.productName = productName;
        this.buyValue = buyValue;
        this.sellValue = sellValue;
        this.articleNumber = articleNumber;
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

    public String getArticleNumber() {
        return articleNumber;
    }
}
