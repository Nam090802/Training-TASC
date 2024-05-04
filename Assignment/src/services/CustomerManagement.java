package services;

import models.Customer;
import utils.Management;
import utils.Validator;

import java.io.*;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;

public class CustomerManagement implements Management {
    Scanner scanner = new Scanner(System.in);
    Map<String,Customer> map = new ConcurrentHashMap<>();
    @Override
    public void view() {
        readFile();
        System.out.printf("%-20s %-20s %-20s %n", "Name", "Email", "Phone Number");
        System.out.println("===========================================================");
        map.forEach((key, value) ->
                System.out.printf("%-20s %-20s %-20s %n", value.getName(), value.getEmail(), value.getPhoneNumber()
                ));
    }

    @Override
    public void add() {
        int n;
        System.out.print("Enter the number of customers: ");
        while (!scanner.hasNextInt()) {
            scanner.nextLine();
            System.out.println("That's not a number!");
            System.out.print("Enter the number of customers: ");
        }
        n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            Customer customer = new Customer();

            if (n > 1){
                System.out.printf("Enter information customer %d\n", (i+1));
            } else {
                System.out.println("Enter information customer");
            }

            String name = Validator.validateName();
            customer.setName(name);

            String email = Validator.validateEmail();
            customer.setEmail(email);

            String phone = Validator.validatePhoneNumber(map);
            customer.setPhoneNumber(phone);
            map.put(customer.getPhoneNumber(), customer);

        }
        writeFile();
    }

    @Override
    public void update() {
        String phone = Validator.validateFindCustomer(map);
        Customer customer = map.get(phone);

        String name = Validator.validateName();
        customer.setName(name);

        String email = Validator.validateEmail();
        customer.setEmail(email);

        writeFile();
    }

    @Override
    public void delete() {
        String phone = Validator.validateFindCustomer(map);
        map.remove(phone);

        System.out.print("Enter file name you want save: ");
        String fileName = scanner.nextLine();

        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(fileName))) {
            objectOutputStream.writeObject(map);
            System.out.println("Save the file successfully!");
        } catch (FileNotFoundException e) {
            System.out.println("Cannot read file: " + fileName);
        } catch (IOException e) {
            System.out.println("There was an error when saving the file: " + fileName);
            e.printStackTrace();
        }
    }

    @Override
    public void find() {
        String phone = Validator.validateFindCustomer(map);
        Customer customer = map.get(phone);
        System.out.printf("%-20s %-20s %-20s %n", "Name", "Email", "Phone Number");
        System.out.println("===========================================================");
        System.out.printf("%-20s %-20s %-20s %n", customer.getName(), customer.getEmail(), customer.getPhoneNumber());

    }

    @Override
    public void readFile() {
        System.out.print("Enter the file name you want to read: ");
        String fileName = scanner.nextLine();

        try(ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(fileName))) {
            Object object = objectInputStream.readObject();
            if (object instanceof ConcurrentHashMap) {
                map = (ConcurrentHashMap<String, Customer>) object;
            } else {
                System.out.println("The data in the file is not customer information.");
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Cannot read file: " + fileName);
            e.printStackTrace();
        }
    }

    @Override
    public void writeFile() {
        System.out.print("Enter file name you want save: ");
        String fileName = scanner.nextLine();

        if (map.isEmpty()) {
            System.out.println("The list is empty, nothing to save!");
            return;
        }

        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(fileName))) {
            objectOutputStream.writeObject(map);
            System.out.println("Save the file successfully!");
        } catch (FileNotFoundException e) {
            System.out.println("Cannot read file: " + fileName);
        } catch (IOException e) {
            System.out.println("There was an error when saving the file: " + fileName);
            e.printStackTrace();
        }
    }
}
