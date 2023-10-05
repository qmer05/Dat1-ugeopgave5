package task1;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Customer> customers = new ArrayList();
        Customer customer1 = new Customer("Ømer", "Øcalan", "qmer05", 2143);
        Customer customer2 = new Customer("Lars", "Larsen", "Lassie196", 1343);
        customers.add(customer1);
        customers.add(customer2);

        printCustomers(customers);
    }

    public static void printCustomers (ArrayList<Customer> listToPrint) {
        for (Customer i : listToPrint) {
            System.out.println(i);
        }
    }
}
