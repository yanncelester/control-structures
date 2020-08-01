package ar.com.ada.online.second.exercisetwo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Declaro variables y permito ingreso por teclado
        System.out.println("Programa para calcular paga semanal de un trabajador");
        int hoursWorked;
        double hourlyPay, salary;
        Scanner keyboard = new Scanner(System.in);

        //Pedimos ingreso de datos
        System.out.print("Ingrese horas trabajadas: ");
        hoursWorked = keyboard.nextInt();
        System.out.print("Pago por hora: ");
        hourlyPay = keyboard.nextDouble();

        //Estructura if
        if (hoursWorked < 40) {
            salary = hoursWorked * hourlyPay;

        } else {
            salary = (40 * hourlyPay) + ((hoursWorked - 40) * (hourlyPay * 2));
        }

        //Muestro por pantalla
        System.out.print("El sueldo semanal del trabajador es: " + salary);

        /*Realice un algoritmo para determinar el sueldo semanal de un trabajador con base en
las horas trabajadas y el pago por hora, considerando que después de las 40 horas cada
hora se considera como excedente y se paga el doble.  */


    }
}
