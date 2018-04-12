import java.util.Scanner;

public class LagerSystemRun {

    private int quantity;
    private String productName;
    private double buyValue;
    private double sellValue;
    private long barNumber;
    private String productGroupTemp;
    private ProductGroup productGroup;



    static Scanner sc = new Scanner(System.in);

    public LagerSystemRun(){
        MenuPrint();
        int choice = Integer.parseInt(sc.nextLine());
        if(choice == 1){
            CreateProduct();
        }

    }

    public static void main(String[] args){
        new LagerSystemRun();
    }

    public void MenuPrint() {

        System.out.println("1. Create product");
        System.out.println("2. Remove product");
        System.out.println("3. Change productGroup");

    }
    public void CreateProduct(){




        System.out.println("Create you product page " +  "\n");
        System.out.println("Enter quantity: ");
        this.quantity = Integer.parseInt(sc.nextLine());
        System.out.println("Enter Product name: ");
        this.productName = sc.nextLine();
        System.out.println("Enter product buy Value: ");
        this.buyValue = Double.parseDouble(sc.nextLine());
        System.out.println("Enter sell value: ");
        this.sellValue = Double.parseDouble(sc.nextLine());
        System.out.println("Enter bar Number: ");
        this.barNumber = Long.parseLong(sc.nextLine());
        System.out.println("Enter productGroup");
        this.productGroupTemp = sc.nextLine();

        if(productGroupTemp.toUpperCase().equals("OTHER")){
            productGroup = ProductGroup.OTHER;
        }
        else if(productGroupTemp.toUpperCase().equals("BELYSNING")) {
            productGroup = ProductGroup.BELYSNING;
        }
        else if(productGroupTemp.toUpperCase().equals("ELMATERIAL")){
            productGroup = ProductGroup.ELMATERIAL;
        }else if(productGroupTemp.toUpperCase().equals("HEMBYGG")){
            productGroup = ProductGroup.HEMBYGG;
        }


        Product product = new Product(quantity, productName, buyValue, sellValue, barNumber, productGroup);


        //ProductGroup productGroup;








        System.out.println(product.getQuantity() + " " + product.getProductName() + " " + product.getBuyValue()
                + " " + product.getSellValue() + " " + product.getBarNumber() + " " + product.getProductGroup());
    }
}
