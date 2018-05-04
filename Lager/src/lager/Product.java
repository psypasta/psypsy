package lager;

public class Product {

    //ny sql
    private int artikelnummer;
    private String benamning;
    private String enhet;
    private String materialgrupp;
    private String gnpris;
    private int prisdatum;
    private String alekod;
    private String lagerford;
    private String status;

    public Product(int artikel, String benamning, String enhet, String materialgrupp, String gnpris){
        this.benamning = benamning;
        this.enhet = enhet;
        this.materialgrupp = materialgrupp;
        this.gnpris = gnpris;
        this.artikelnummer = artikel;

    }


    public Product(){

    }

    public void updateProduct(){

    }


    public String getEnhet() {
        return enhet;
    }

    public String getMaterialGrupp() {
        return materialgrupp;
    }

    public String getGnpris() {
        return gnpris;
    }

    public int getPrisdatum() {
        return prisdatum;
    }

    public String getAlekod() {
        return alekod;
    }

    public String getLagerford() {
        return lagerford;
    }

    public String getStatus() {
        return status;
    }
    public String getProductName() {
        return this.benamning;
    }



    public int getArtikelNummer(){
        return this.artikelnummer;
    }
}
