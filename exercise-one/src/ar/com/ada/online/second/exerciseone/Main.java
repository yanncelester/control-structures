package ar.com.ada.online.second.exerciseone;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int numberOne, numberTwo;
        int mayor;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese el primer numero a evaluar: ");
        numberOne =keyboard.nextInt();
        System.out.print("Ingrese el segundo numero a evaluar: ");
        numberTwo =keyboard.nextInt();

        if (numberOne > numberTwo) {
            //resultado true
            mayor = numberOne;
        } else {
            //resultado false
            mayor = numberTwo;
        }
        System.out.println("El numero mayor es: " + mayor);
    }

}
