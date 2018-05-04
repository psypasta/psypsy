package util;

import lager.Product;

import java.util.List;

public class start {

    public static void ProductArrayList(List<Product> product){
        System.out.println("Your product article number: ");
        for(int i = 0; i < product.size(); i++){
            if(product.get(i).getMaterialGrupp().equals("00DEC")){
                System.out.println(product.get(i).getArtikelNummer());
                System.out.println(product.get(i).getProductName());
                System.out.println(product.get(i).getEnhet());

            }


           // System.out.println(product.get(i).getProductName() + " " + product.get(i).getArticleNumber() + " " + product.get(i).getQuantity());




        }

    }
        public static void main(String[] args) throws Exception {
            FileGetSql dao = new FileGetSql();
            //dao.readDataBase();

            ProductArrayList(dao.readSelectedSqlColumn());
        }
}

