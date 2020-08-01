package ar.com.ada.online.second.exercisefour;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Programa para calcular estadía en un estacionamiento");
        // Declaro las variables y permito ingreso por teclado
        int stay, stayCost;
        Scanner keyboard = new Scanner(System.in);

        //Ingreso datos
        //Ingreso datos
        System.out.print("Ingresar tiempo de la estadía: ");
        stay = keyboard.nextInt();

        if (stay <= 2) {
            stayCost = stay * 5;
        } else {
            //Caso falso
            if (stay <= 5) {
                //Caso verdadero
                stayCost = (stay - 2) * 4 + 10;
            } else {
                // Caso Falso
                if (stay <= 10) {
                    //Caso verdadero
                    stayCost = (stay - 5 * 3 + 22);
                } else {
                    //Caso Falso
                    stayCost = (stay - 10) * 2 + 37;
                }
            }
        }
        System.out.println("El costo de la estadía es: " + stayCost);
    }
}
