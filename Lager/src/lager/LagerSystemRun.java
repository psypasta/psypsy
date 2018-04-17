package lager;

import util.FileGetSql;

import java.util.Scanner;

public class LagerSystemRun {

    private int quantity;
    private String productName;
    private double buyValue;
    private double sellValue;
    private String barNumber;
    private String productGroupTemp;
    private ProductGroup productGroup;

    FileGetSql file = new FileGetSql();
    private Product product = new Product();


    static Scanner sc = new Scanner(System.in);

    public LagerSystemRun() throws Exception{
        MenuPrint();
        int choice = Integer.parseInt(sc.nextLine());
        if(choice == 1){
            CreateProduct();


        }

        file.readDataBase();

    }

    public static void main(String[] args) throws Exception{
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
<<<<<<< HEAD:Lager/src/Lager/LagerSystemRun.java
        System.out.println("Enter Lager.Product name: ");
        product.set() = sc.nextLine();
=======
        System.out.println("Enter lager.Product name: ");
        this.productName = sc.nextLine();
>>>>>>> 31bdaadffe91c3f3cdae112ba3ef818c45127a8f:Lager/src/lager/LagerSystemRun.java
        System.out.println("Enter product buy Value: ");
        this.buyValue = Double.parseDouble(sc.nextLine());
        System.out.println("Enter sell value: ");
        this.sellValue = Double.parseDouble(sc.nextLine());
        System.out.println("Enter bar Number: ");
        this.barNumber = sc.nextLine();
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


        product = new Product(quantity, productName, buyValue, sellValue, barNumber, productGroup);


        //lager.ProductGroup productGroup;








        System.out.println(product.getQuantity() + " " + product.getProductName() + " " + product.getBuyValue()
                + " " + product.getSellValue() + " " + product.getArticleNumber() + " " + product.getProductGroup());
    }

}
