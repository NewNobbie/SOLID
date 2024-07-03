package Orders;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class orderMenu {

    public static void main(String[] args) {

        Scanner objScanner = new Scanner(System.in);
        List<String> items = new ArrayList<>();
        int option = 0;




        System.out.println("Bienvenido a la toma de ordenes!");
        System.out.println("Tomaremos las ordenes que desee...");
        System.out.println("Al terminar ingrese la palabra (salir))");

        while (true) {
            System.out.println("Ingrese un item: ");
            String input = objScanner.nextLine();

            if (input.equalsIgnoreCase("salir")){
                break;
            }
            items.add(input);

        }

        objScanner.close();


        Order order = new Order(items);

    }
}
