package ar.com.ada.online.second.exercisesix;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double itemPrice, itemCost, itemDiscount;
        final double discountOne = 0.15, discountTwo = 0.12, discountThree = 0.10;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Ingrese el precio del producto:");
        itemPrice = keyboard.nextInt();

        if (itemPrice < 100) {
            itemDiscount = itemPrice * discountThree;
        } else {
            if (itemPrice < 200) {
                itemDiscount = itemPrice * discountTwo;
            } else {
                itemDiscount = itemPrice * discountOne;
            }

            itemCost = itemPrice - itemDiscount;

            System.out.print("El descuento del producto según el precio es: " + itemDiscount);

            System.out.print("El costo del producto sin el descuento es de  " + itemCost);
        }
    }
}