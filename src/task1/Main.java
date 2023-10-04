package task1;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Customer> customers = new ArrayList();
        Customer customer1 = new Customer("Ømer", "Øcalan", "qmer05");
        Customer customer2 = new Customer("Lars", "Larsen", "Lassie1980");
        customers.add(customer1);
        customers.add(customer2);

        printCustomers(customers);
    }

    public static void printCustomers(ArrayList<Customer> listOfCustomers) {
        for (Customer i : listOfCustomers) {
            System.out.println(i);
        }
    }
}
