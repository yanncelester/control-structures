package ar.com.ada.online.second.exercisefourtheen;

import java.util.Scanner;

public class Main {

    /*Realice un algoritmo que, con base en una calificación proporcionada (0-10), indique con
letra la calificación que le corresponde: 10 es “A”, 9 es “B”, 8 es “C”, 7 y 6 son “D”, y de 5
a 0 son “F”*/

    public static void main(String[] args) {
        System.out.println("Programa para asociar letra a calificación númerica");
        double grade;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese la calificación obtenida en número: ");
        grade = keyboard.nextDouble();

        if (grade > 10 || grade < -1) {
            System.out.println("Número inválido, ingrese número correcto");
            System.exit(0);
        }

        System.out.println("A continuación verá asiganda la nota a una letra");

        if (grade == 10) System.out.println("A 10 le corresponde una nota: A ");
        if (grade == 9) System.out.println("A 9 le corresponde una nota: B ");
        if (grade == 8) System.out.println("A 8 le corresponde una nota: C ");
        if (grade > 6 && grade < 8) {
            System.out.println("Notas entre 8 (sin incluir el 8) y 6 le corresponde una nota: D ");
        } else if (grade <= 5) {
            System.out.println("A notas inferiores o iguales a 5 le corresponde una nota: F");
        }
    }
}
