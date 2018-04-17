package timbuchalka;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Run {
   //
     Scanner sc = new Scanner(System.in);
     List<Account> accountList = new ArrayList<>();
    int id;


    double balance;

    public void createAccount(){


        accountList.add();
        id = accountList.get(0).getAccountNumber();



    }
    public Run(){

        createAccount();

        while(true) {
            selectionScreen();
            select(Integer.parseInt(sc.nextLine()));
        }
    }

    public static void main(String[] args){
            new Run();


    }

    public void selectionScreen(){



        System.out.println("1. Deposit");
        System.out.println("2. Withdrawal");
        System.out.println("3. current balance: ");


    }
    public int deposit(double deposit){
        if (deposit <= 0) {
            System.out.println("No amount or negative amount tried to be deposited");



            return -1;

        } else if(deposit > 0) {
            accountList.get(id).setBalance(deposit);

            System.out.println("This amount was deposited " + deposit);
            System.out.println("Current blanace: " + accountList.get(id).getBalance());


        }

        return 0;

    }
    public void withdrawal(double withdrawal){
        if(withdrawal > accountList.get(id).getBalance() || withdrawal < 0){
            System.out.println("Insufficent amount tried to be withdrawl");
        }else{
            double temp = accountList.get(id).getBalance();
            temp -= withdrawal;
            accountList.get(id).setBalance(temp);
            System.out.println("This amount was withdrawn " + withdrawal);
            System.out.println("Current blanace: " + accountList.get(id).getBalance());
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
