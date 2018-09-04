package test;

import app.Member;

public class MemberTest {

    public static void main(String[] args) {
        Member robin = new Member("Robin");
        Member max = new Member("Max", "max__________AT_______lol.com");
        Member jv = new Member("Jonathan", "jv@lol.com");

        System.out.println(robin);
        System.out.println(max);
        System.out.println(jv);


        if (!jv.getEmail().toLowerCase().equals("jv@lol.com")) {
            System.out.println("Jvs email " + jv.getEmail() + ") is faulty: ");
        }
        if (max.getEmail() != null) {
            System.out.println("max email is faulty. Current value: \" " + max.getEmail() + "Should be null");

        } else {
            System.out.println("max email is null");

        }
        if(robin.getEmail() != null){
            System.out.println("Robins email is faulty: ");
        }
    }
}

