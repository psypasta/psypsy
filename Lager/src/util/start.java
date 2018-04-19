package util;

import lager.Product;

import java.util.List;

public class start {

    public static void ProductArrayList(List<Product> product){
        System.out.println("Your products: ");
        for(int i = 0; i < product.size(); i++){

            System.out.println(product.get(i).getProductName() + " " + product.get(i).getArticleNumber() + " " + product.get(i).getQuantity());





        }

    }
        public static void main(String[] args) throws Exception {
            FileGetSql dao = new FileGetSql();
            //dao.readDataBase();
            ProductArrayList(dao.readSelectedSqlColumn());


        }




}

