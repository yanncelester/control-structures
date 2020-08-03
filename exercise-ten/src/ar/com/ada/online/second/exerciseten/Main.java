package ar.com.ada.online.second.exerciseten;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Doy título al programa, ingreso variables y habilito ingreso por teclado
        System.out.println("Programa para determinar lugar de destino");
        double budgetTrip, pricePerKm;
        String destinyOne = "mexico";
        String destinyTwo = "pv";
        String destinyThree = "acapulco";
        String destinyfour = "cancun";
        String destinyFive = "casa";
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese el precio por km: ");
        pricePerKm = keyboard.nextDouble();
        System.out.print("Ingrese el presupuesto para el viaje: ");
        budgetTrip = keyboard.nextDouble();

        if (budgetTrip >= pricePerKm * 750 * 2) {
            System.out.println("El lugar de destino es: " + destinyOne);
        } else if (budgetTrip >= pricePerKm * 800 * 2) {
            System.out.println("El lugar de destino es: " + destinyTwo);
        } else if (budgetTrip >= pricePerKm * 1200 * 2) {
            System.out.println("El lugar de destino es: " + destinyThree);
        } else if (budgetTrip >= pricePerKm * 1800 * 2) {
            System.out.println("El lugar de destino es: " + destinyfour);
        } else {
            System.out.println("El lugar de destino es: " + destinyFive);
        }
    }
}



