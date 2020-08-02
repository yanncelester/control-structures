package ar.com.ada.online.second.exerciseseven;

import java.util.Scanner;

/* El presidente de la república ha decidido estimular a todos los estudiantes de una
universidad mediante la asignación de becas mensuales, para esto se tomarán en
consideración los siguientes criterios:
Para alumnos mayores de 18 años con promedio mayor o igual a 9, la beca será de
$2000.00; con promedio mayor o igual a 7.5, de $1000.00; para los promedios menores
de 7.5 pero mayores o iguales a 6.0, de $500.00; a los demás se les enviará una carta de
invitación incitándolos a que estudien más en el próximo ciclo escolar.
A los alumnos de 18 años o menores de esta edad, con promedios mayores o iguales a
9, se les dará $3000; con promedios menores a 9 pero mayores o iguales a 8, $2000;
para los alumnos con promedios menores a 8 pero mayores o iguales a 6, se les dará
$100, y a los alumnos que tengan promedios menores a 6 se les enviará carta de
invitación. */ 

public class Main {

    public static void main(String[] args) {
        // Muestro título del programa, declaro variables, inicializo
        System.out.println("Programa para definir becas");
        int age;
        double average;
        final double averageOnemaxEighteen = 2000;
        final double averageTwomaxEighteen = 1000;
        final double averageThreemaxEighteen = 500;
        String averageMinemaxEighteen = "no aplica a la beca, mandar carta";
        final double averageOneeighteen = 3000;
        final double averageTwoeighteen = 2000;
        final double averageThreeeighteen = 100;
        String averageMineighteen = "no aplica a la beca, mandar carta";

        // Habilito ingreso por teclado
        Scanner keyboard = new Scanner(System.in);

        // Pido ingreso de datos
        System.out.print("Ingrese edad del alumno: ");
        age = keyboard.nextInt();
        System.out.print("Ingrese el promedio del alumno: ");
        average = keyboard.nextDouble();

        // Armo estructura IF

        if (age > 18) {
            if (average >= 9) {
                System.out.print("Corresponde beca: " + averageOnemaxEighteen);
            } else {
                if (average >= 7.5) {
                    System.out.print("Corresponde beca: " + averageTwomaxEighteen);
                } else {
                    if (average >= 6) {
                        System.out.print("Corresponde beca: " + averageThreemaxEighteen);
                    } else {
                        System.out.print("Resultado: " + averageMinemaxEighteen);
                    }
                }

            }
        }
        if (age <= 18) {
            if (average >= 9) {
                System.out.print("Corresponde beca: " + averageOneeighteen);
            } else {
                if (average >= 7.5) {
                    System.out.print("Corresponde beca: " + averageTwoeighteen);
                } else {
                    if (average >= 6) {
                        System.out.print("Corresponde beca: " + averageThreeeighteen);
                    } else {
                        System.out.print("Resultado: " + averageMineighteen);
                    }

                }
            }
        }

    }
}

