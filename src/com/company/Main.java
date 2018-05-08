package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("First steps in Java");
        int liczba = 10;
        System.out.println(liczba);

        String name = "Cat";
        String surname = "Puszek";
        String sound = "-- meaow !!!";
        System.out.println(name + " " + surname + " " + "sounds" + " " + sound);

        int length = 45;
        System.out.println(length);

        //we hidden cash info
        double salary = 2500.22;
        System.out.println("your payment equals" + " " + salary);

        //this code show alert massage window
        JOptionPane.showMessageDialog(null, "Show me a window");
    }

}

    /// try to make switch
    /*    int answer = 5;
        switch(answer){

        case 1:
            System.out.println("answer is true");
            break;

        case 2:
            System.out.println("you grow be hero");
            break;

        default:
            System.out.println("nice job, good luck");
            break;
    }
*/



