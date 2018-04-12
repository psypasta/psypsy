import java.util.Scanner;

public class LagerSystemRun {

    static private int q;
    static private String p;
    static private double b;
    static private double s;
    static private long bN;

    public static void main(String[] args){


        PrintOut();






    }

    public static void PrintOut(){


        Scanner sc = new Scanner(System.in);
        Product product = new Product();
        System.out.println("Create you product page " +  "\n");

        System.out.println("Enter quantity: ");
        q = Integer.parseInt(sc.nextLine());
        System.out.println("Enter Product name: ");
        p = sc.nextLine();
        System.out.println("Enter product buy Value: ");
        b = sc.nextDouble();
        System.out.println("Enter sell value: ");
        s = sc.nextDouble();
        System.out.println("Enter bar Number: ");
        bN = sc.nextLong();


        product.createProduct(q, p, b, s, bN);



        System.out.println(product.getQuantity() + " " + product.getProductName() + " " + product.getBuyValue()
                + " " + product.getSellValue() + " " + product.getBarNumber());
    }
}
