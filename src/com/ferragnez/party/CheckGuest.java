package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] guests = {
                "Dua Lipa",
                "Paris Hilton",
                "Manuel Agnelli",
                "J-Ax",
                "Francesco Totti",
                "Ilary Blasi",
                " Bebe Vio",
                "Luis",
                "Pardis Zarei",
                "Martina Maccherone",
                "Rachel Zeilic"
        };

        System.out.println("What's your name?");
        String guestName = scanner.nextLine();

        boolean accepted = false;

        for (int i = 0; i < guests.length && !accepted ; i++) {

            if (guestName.equals(guests[i])){
                accepted=true;
                break;
            }
        }
        if (accepted){
            System.out.println("Welcome");
        }else {
            System.out.println("Sorry, you are not on the list");
        }

        scanner.close();
    }
}
