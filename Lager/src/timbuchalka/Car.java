package timbuchalka;
import java.awt.*;
import java.net.*;

public class Car {

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;


    public void setModel(String model){
        String validateModel = model.toLowerCase();
        if(validateModel.equals("carrera") || validateModel.equals("commadore")){
            this.model = model;
        }else{
            System.out.println("Not a carrera");
            this.model = "Unknown";
        }

    }
    public String getModel(){
        return this.model;
    }

// ...

}

