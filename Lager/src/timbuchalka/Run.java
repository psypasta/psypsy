package timbuchalka;

import java.util.Scanner;

public class Run {
    Account account = new Account();
    Scanner sc = new Scanner(System.in);

    public Run(){
        selectionScreen();
        select(Integer.parseInt(sc.nextLine()));
    }

    public static void main(String[] args){
        new Run();
    }

    public void selectionScreen(){

        System.out.println("1. Deposit");
        System.out.println("2. Withdrawal");


    }
    public void deposit(double deposit){
        if (deposit <= 0) {
            System.out.println("No amount or negative amount tried to be deposited");

            selectionScreen();


        } else if(deposit > 0) {
            account.setBalance(deposit);
            System.out.println("This amount was deposited " + deposit);
            System.out.println("Current blanace: " + account.getBalance());
            selectionScreen();
        }

    }
    public void withdrawal(double withdrawal){
        if(withdrawal > account.getBalance() || withdrawal < 0){
            System.out.println("Insufficent amount tried to be withdrawl");
        }else{
            double temp = account.getBalance();
            temp -= withdrawal;
            account.setBalance(temp);
            System.out.println("This amount was withdrawn " + withdrawal);
            System.out.println("Current blanace: " + account.getBalance());
        }

    }
    public void select(int select){
        int selected = select;
        boolean isProcessOver = false;
        while(!isProcessOver) {
            if (selected == 1 || selected == 2) {
                switch (selected) {
                    case 1:
                        System.out.println("How much do you want to deposit? ");
                        deposit(Double.parseDouble(sc.nextLine()));
                        isProcessOver = true;
                        break;
                    case 2:
                        System.out.println("How much do you want to withdrawal? ");
                        withdrawal(Double.parseDouble(sc.nextLine()));
                        isProcessOver = true;
                        break;
                    default:
                        System.out.println("No option found ");

                }
            }
        }
    }


}
