package Pizzas;

import java.util.Scanner;

public class Waiter {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the dough: ");
        String dough = sc.nextLine();
        System.out.println("Enter the sauce: ");
        String sauce = sc.nextLine();
        System.out.println("Enter the topping: ");
        String topping = sc.nextLine();

        Pizza pizza = new PizzaBuilder().setDough(dough).setSauce(sauce).setTopping(topping).build();

        System.out.println(pizza);

        sc.close();

    }
}
