package util;

import Lager.Product;
import Lager.ProductGroup;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class FileGetSql {


    private int quantity = 3;
    private String productName = "Lampa 230W";
    private double buyValue = 59.99;
    private double sellValue = 159.00;
    private String articleNumber = "61666116";
    private ProductGroup productGroup;

    String temp;
    private String login = "jdbc:mysql://192.168.1.108/bank?";
    private String pass = "user=max&password=max";
    private Connection connect = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;


    public String readSelectedSqlColumn()throws Exception{

        Class.forName("com.mysql.jdbc.Driver");
        connect = DriverManager
                .getConnection( login
                        + pass);

        statement = connect.createStatement();

        resultSet = statement
                .executeQuery("SELECT * FROM product;");
        //resultSet.next();
        System.out.println("PRODUCTNAME" + " " + "QUANTITY" + " " + "INVALUE" + " " + "OUTVALUE" +  " " + "ArticleNumber");
        while(resultSet.next()){



            System.out.println(resultSet.getString("ProductName") + " " +  resultSet.getString("Quantity") + " " + resultSet.getString("ProductValueIN") + " " +
            resultSet.getString("ProductValueOUT") + " " + resultSet.getString("ArticleNumber"));

          //  System.out.println("Table: " + resultSet.getString(i));
        }


        return temp;

    }

    public void readDataBase(Product product) throws Exception {
        try {
            // This will load the MySQL driver, each DB has its own driver
            Class.forName("com.mysql.jdbc.Driver");
            // Setup the connection with the DB
            connect = DriverManager
                    .getConnection( login
                            + pass);

            // Statements allow to issue SQL queries to the database
            statement = connect.createStatement();
            // Result set get the result of the SQL query
            resultSet = statement
                    .executeQuery("SELECT * FROM bank.product;");

            // PreparedStatements can use variables and are more efficient
            preparedStatement = connect
                    .prepareStatement("insert into bank.product values (?, ?, ?, ?, ?)");
            // "myuser, webpage, datum, summary, COMMENTS from feedback.comments");
            // Parameters start with 1
            preparedStatement.setString(1, product.getProductName());
            preparedStatement.setInt(2, quantity);
            preparedStatement.setDouble(3, buyValue);
            preparedStatement.setDouble(4, sellValue);
            preparedStatement.setString(5, articleNumber);
            preparedStatement.executeUpdate();
//aasd

            resultSet = statement
                    .executeQuery("SELECT * FROM product");



            writeMetaData(resultSet);
        } catch (Exception e) {
            throw e;
        } finally {
            close();
        }

    }

    private void writeMetaData(ResultSet resultSet) throws SQLException {
        //  Now get some metadata from the database
        // Result set get the result of the SQL query

        System.out.println("The columns in the table are: ");
        resultSet.next();

        System.out.println("Table: " + resultSet.getString(1));

        for  (int i = 1; i<= resultSet.getMetaData().getColumnCount(); i++){
            System.out.println("Column " +i  + " "+ resultSet.getMetaData().getColumnName(i));
        }
    }


    // You need to close the resultSet
    private void close() {
        try {
            if (resultSet != null) {
                resultSet.close();
            }

            if (statement != null) {
                statement.close();
            }

            if (connect != null) {
                connect.close();
            }
        } catch (Exception e) {

        }
    }

}