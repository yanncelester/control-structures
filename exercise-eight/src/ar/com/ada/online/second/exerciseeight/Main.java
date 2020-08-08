package ar.com.ada.online.second.exercisethree;

import java.util.Scanner;

/* Cierta empresa proporciona un bono mensual a sus trabajadores, el cual puede ser por
su antigüedad o bien por el monto de su sueldo (el que sea mayor), de la siguiente
forma:
Cuando la antigüedad es mayor a 2 años pero menor a 5, se otorga 20 % de su sueldo;
cuando es de 5 años o más, 30 %. Ahora bien, el bono por concepto de sueldo, si éste es
menor a $1000, se da 25 % de éste, cuando éste es mayor a $1000, pero menor o igual a
$3500, se otorga 15% de su sueldo, para más de $3500. 10%. Realice el algoritmo
correspondiente para calcular lo dos tipos de bono, asignando el mayor. */

public class Main {
    public static void main(String[] args) {
        System.out.println("Programa para calcular bonos y asignarlos");
        int seniority;
        String seniorityInitial = "Por su antigüedad, no aplica a este bono";
        double salary, seniorityMax = 0, seniorityMin = 0;
        final double BONUSMAXSEN = 0.2, BONUSMINSEN = 0.3;
        double bonusFinalSeniority = 0, bonusFinalSalary = 0;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese su antigüedad laboral: ");
        seniority = keyboard.nextInt();
        System.out.print("Ingrese su salario actual: ");
        salary = keyboard.nextDouble();

        //Calculo bono por antigüedad

        if (seniority < 2) {
            System.out.println(seniorityInitial);
        } else if (seniority < 5) {
            bonusFinalSeniority = salary * BONUSMINSEN;
            System.out.println("El bono que aplica por su antigüedad es de: " + bonusFinalSeniority);
        } else if (seniority >= 5) {
            bonusFinalSeniority = salary * BONUSMAXSEN;
            System.out.println("El bono que aplica por su antigüedad es de: " + bonusFinalSeniority);
        }

        if (salary < 1000) {
            bonusFinalSalary = salary * 0.25;
            System.out.println("El bono que aplica por su sueldo es de: " + bonusFinalSalary);
        } else if (salary <= 3500) {
            bonusFinalSalary = salary * 0.15;
            System.out.println("El bono que aplica por su sueldo es de: " + bonusFinalSalary);
        } else if (salary > 3500) {
            bonusFinalSalary = salary * 0.1;
            System.out.println("El bono que aplica por su sueldo es de: " + bonusFinalSalary);
        }

        if (bonusFinalSalary > bonusFinalSeniority) {
            System.out.println("El bono que le corresponde finalmente es: " + bonusFinalSalary);
        } else {
            System.out.println("El bono que le corresponde finalmente es: " + bonusFinalSeniority);
        }


    }

}