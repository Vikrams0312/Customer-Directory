package org.example;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CustomerDirectory {
    public static void main(String[] args) {

        ArrayList<Customer> customers = new ArrayList<>();

         customers.add(new Customer(1,"vikram","vikram@gmail.com", true));
         customers.add(new Customer(2,"sujith","suji@gmail.com",false));
         customers.add(new Customer(3,"Praveen","pra@gmail.com",true));
         customers.add(new Customer(4,"shek","shek@gmail.com",false));
         customers.add(new Customer(5,"tamil","tamil@gmail.com",false));

        List<Customer> activeCustomers =  customers.stream().filter(Customer::isActive).toList();
        System.out.println("Active Customers:");
        activeCustomers.forEach(System.out::println);

        String name ="vikram";
        System.out.println("\nSearch result for name: " + name);
        customers.stream().filter(c -> c.getName().equalsIgnoreCase(name)).forEach(System.out::println);

        System.out.println("\nCustomers sorted by name:");
        customers.stream().sorted(Comparator.comparing(Customer::getName)).forEach(System.out::println);

    }
}