package ar.com.ada.online.second.exerciseelevena;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Programa para asignar bono por años de antigüedad");
        int seniority, bonusSeniority;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese su antigüedad en años: ");
        seniority = keyboard.nextInt();

        if (seniority < 1) {
            System.out.println("Por su antigüedad no aplica al bono");
            System.exit(0);
        }
        switch (seniority) {
            case (1):
                bonusSeniority = 100;
                break;
            case (2):
                bonusSeniority = 200;
                break;
            case (3):
                bonusSeniority = 300;
                break;
            case (4):
                bonusSeniority = 400;
                break;
            case (5):
                bonusSeniority = 500;
                break;
            default:
                bonusSeniority = 1000;
        }

        System.out.println("El bono que aplica por su antigüedad es $" + bonusSeniority);

    }
}
