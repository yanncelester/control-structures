package ar.com.ada.online.second.exercisenine;

import java.util.Scanner;

public class Main {

    /*Una compañía de seguros para autos ofrece dos tipos de póliza: cobertura amplia (A) y
daños a terceros (B). Para el plan A, la cuota base es de $1,200, y para el B, de $950. A
ambos planes se les carga 10% del costo si la persona que conduce tiene por hábito
beber alcohol, 5% si utiliza lentes, 5% si padece alguna enfermedad –como de- ficiencia
cardiaca o diabetes–, y si tiene más de 40 años, se le carga 20%, de lo contrario sólo
10%. Todos estos cargos se realizan sobre el costo base. Realice diagrama de flujo que
represente el algoritmo para determinar cuánto le cuesta a una persona contratar una
póliza.*/

    public static void main(String[] args) {
        System.out.println("Programa para definir costo de póliza");
        String policyType;
        double policyInitial = 0, finalPolicy, wage = 0, additionalDrink = 0, additionalGlasses = 0, additionalDisease = 0, additionalAge = 0, additionalNone = 0;
        boolean answer;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese: A si quiere contratar una póliza de $1200, o B si quiere contratar una póliza de $950: ");
        policyType = keyboard.next();

        switch (policyType) {
            case "A":
                policyInitial = 1200;
                break;
            case "B":
                policyInitial = 950;
                break;
            default:
                policyInitial = 0;
                System.out.println("Valor inválido, por favor, ingrese opción A o B");
                System.exit(0);
        }

        finalPolicy = policyInitial;

        System.out.println("Para calcular el valor final de su póliza, le pedimos tenga a bien completar este formulario. Recuerde comntestar con TRUE si su respuesta es SI, y FALSE, si su respuesta es NO");
        System.out.println("¿Bebe alcohol habitualmente? TRUE/FALSE");
        answer = keyboard.nextBoolean();
        if (answer) {
            additionalDrink = finalPolicy * 0.1;
        } else {
            additionalDrink = 0;
        }
        System.out.println("¿Usa lentes? TRUE/FALSE");
        answer = keyboard.nextBoolean();
        if (answer) {
            additionalGlasses = finalPolicy * 0.05;
        } else {
            additionalGlasses = 0;
        }
        System.out.println("¿Tiene alguna enfermedad de base? TRUE/FALSE");
        answer = keyboard.nextBoolean();
        if (answer) {
            additionalDisease = finalPolicy * 0.05;
        } else {
            additionalDisease = 0;
        }
        System.out.println("¿Es mayor de 40 años? TRUE/FALSE");
        answer = keyboard.nextBoolean();
        if (answer) {
            additionalAge = finalPolicy * 0.2;
        } else {
            additionalAge = 0;
        }
        System.out.println("No cumplo ninguna de las anteriores: TRUE/FALSE");
        answer = keyboard.nextBoolean();
        if (answer) {
            additionalNone = finalPolicy * 0.1;
            wage = additionalNone + finalPolicy;
            System.out.println("El costo final de su póliza es de: $" + wage);
        }
        wage = finalPolicy + additionalDrink + additionalGlasses + additionalDisease + additionalAge;
        System.out.println("El costo final de su póliza es de $" + wage);
    }
}

