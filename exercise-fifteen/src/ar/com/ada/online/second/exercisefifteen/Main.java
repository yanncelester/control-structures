package ar.com.ada.online.second.exercisefifteen;

import java.util.Scanner;

public class Main {

    /*Realice un algoritmo que, con base en un número proporcionado (1-7), indique el día de
la semana que le corresponde (L-D). */

    public static void main(String[] args) {
        int numberDay;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese el número del día en la semana: ");
        numberDay = keyboard.nextInt();

        switch (numberDay) {
            case (1):
                System.out.println("El día ingresado es el lunes");
                break;
            case (2):
                System.out.println("El día ingresado es el martes");
                break;
            case (3):
                System.out.println("El día ingresado es el miércoles");
                break;
            case (4):
                System.out.println("El día ingresado es el jueves");
                break;
            case (5):
                System.out.println("El día ingresado es el viernes");
                break;
            case (6):
                System.out.println("El día ingresado es el sábado");
                break;
            case (7):
                System.out.println("El día ingresado es el domingo");
                break;
            default:
                System.out.println("Número ingresado no válido, vuelva a completarlo, teniendo en cuenta que la semana tiene 7 días (L-D), muchas gracias");

        }
    }
}
