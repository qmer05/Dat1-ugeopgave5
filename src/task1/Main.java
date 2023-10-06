package task1;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Customer customer1 = new Customer("Ømer", "Øcalan", "qmer05", 2143);
        Customer customer2 = new Customer("Lars", "Larsen", "Lassie196", 1343);

        ArrayList<Customer> customers = new ArrayList();

        customers.add(customer1);
        customers.add(customer2);
        // alternativt istantiere og tilføje på samme tid:
        // customers.add(new Customer("Ømer", "Øcalan", "qmer05", 2143));

        printCustomers(customers);
    }

    public static void printCustomers(ArrayList<Customer> listToPrint) {
        for (Customer c : listToPrint) {
            System.out.println(c);
        }
    }
}
