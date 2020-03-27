package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//не доконца понял зачем это обьявлять?
        System.out.println("Whats your name?");
        String name = scanner.nextLine();
        System.out.println("Where are you live, " + name + "?");
        String spc = scanner.nextLine();
        System.out.println("Name:" + name + ". Adress:"+ spc);
    }
}
// проверял push
