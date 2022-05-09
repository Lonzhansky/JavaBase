package com.hillel.lonzhansky.lessons.lesson12;

public class HM11 {

    public static void main(String[] args) {
//        Burgers burger1 = new Burgers(true, 1, true, false);
//        Burgers burger2 = new Burgers(true, 1, true, false, "Майонез");

        Client client = new Client("Denis", "0934035220", "29, 07, 1994", "lonzhansky@gmail.com", "Lonzhansky", 75, 1994);
        client.printAccountInfo();
        Client client2 = client;

        client2.printAccountInfo();

        client2.surname = "";
        client.printAccountInfo();
        client2.printAccountInfo();

        System.out.println(client.getName());
        client.getBurgers().setBun(false);

        String str = "44.4";
        System.out.println(Double.parseDouble(str));

    }

}
