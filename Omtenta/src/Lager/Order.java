package Lager;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private String id;
    private List<Product> productList = new ArrayList<Product>();


    public Order(String id){
        this.id = id;
    }
    public void addProduct(Product product){

        this.productList.add(product);


    }

    public void removeProduct(Product product){

        this.productList.remove(product);

    }


}
