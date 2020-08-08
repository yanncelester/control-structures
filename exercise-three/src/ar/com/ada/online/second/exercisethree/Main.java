package ar.com.ada.online.second.exercisethree;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Programa para definir regalo según presupuesto");
        double budgetGift;
        String card = "Tarjeta", sweet = "Chocolates", flowers = "Flores", ring = "Anillo";
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese el monto de dinero con el que cuenta para el regalo: ");
        budgetGift = keyboard.nextDouble();

        if (budgetGift <= 10.00) {
            System.out.print("Se sugiere regalar: " + card);
        } else if (budgetGift <= 100.00) {
            System.out.print("Se sugiere regalar: " + sweet);
        } else if (budgetGift <= 250.00) {
            System.out.print("Se sugiere regalar: " + flowers);
        } else if (budgetGift >= 251.00) {
            System.out.println("Se sugiere regalar: " + ring);
        }
        System.out.println(". Que pase un lindo día :)");

    }
}


