package ar.com.ada.online.second.exercisefive;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String nameOne, nameTwo, nameThree;
        int ageOne, ageTwo, ageThree, ageMinor;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Ingrese nombre de la primer persona: ");
        nameOne = keyboard.next();
        System.out.println("Ingrese nombre de la segunda persona: ");
        nameTwo = keyboard.next();
        System.out.println("Ingrese nombre de la tercera persona: ");
        nameThree = keyboard.next();

        System.out.println("Ingrese edad de la primer persona: ");
        ageOne = keyboard.nextInt();
        System.out.println("Ingrese edad de la segunda persona: ");
        ageTwo = keyboard.nextInt();
        System.out.println("Ingrese edad de la tercera persona: ");
        ageThree = keyboard.nextInt();

        if (ageOne < ageTwo && ageOne < ageThree) {
            System.out.print("La persona menor es: " + nameOne + " con la edad de " + ageOne);
        } else if (ageTwo < ageOne && ageTwo < ageThree) {
            System.out.print("La persona menor es: " + nameTwo + " con la edad de " + ageTwo);
        } else if (ageThree < ageOne && ageThree < ageTwo) {
            System.out.print("La persona menor es: " + nameThree + " con la edad de " + ageThree);
        }
    }
}


