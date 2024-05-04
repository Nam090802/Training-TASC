package utils;

import models.Customer;

import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;

public class Validator {
    static Scanner scanner = new Scanner(System.in);
    public static final String PATTERN_PHONENUMBER = "^\\d{10}$";
    public static final String PATTERN_EMAIL = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
    public static final String PATTERN_STRING = "^[a-zA-Z]+$";

    public static boolean isNullOrEmpty(String s) {
        return s == null || s.isEmpty();
    }

    public static boolean isPhoneNumber(String s) {
        return s.matches(PATTERN_PHONENUMBER);
    }

    public static boolean isEmail(String s) {
        return s.matches(PATTERN_EMAIL);
    }

    public static boolean isString(String s) {
        return s.matches(PATTERN_STRING);
    }

    public static String validateName() {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        while (!Validator.isString(name)){
            System.out.println("Invalid name!");
            System.out.print("Enter name: ");
            name = scanner.nextLine();
        }
        return name;
    }

    public static String validateEmail() {
        System.out.print("Enter email: ");
        String email = scanner.nextLine();
        while (!Validator.isEmail(email)){
            System.out.println("Invalid email!");
            System.out.print("Enter email: ");
            email = scanner.nextLine();
        }
        return email;
    }

    public static String validatePhoneNumber(Map<String, Customer> chm) {
        System.out.print("Enter phone number: ");
        String phone = scanner.nextLine();

        while (!isPhoneNumber(phone)) {
            System.out.println("Invalid phone number!");
            System.out.print("Enter phone number: ");
            phone = scanner.nextLine();
        }
        while (chm.containsKey(phone)) {
            System.out.println("Phone number already exists");
            System.out.print("Enter phone number: ");
            phone = scanner.nextLine();
        }
        return phone;

    }

    public static String validateFindCustomer(Map<String, Customer> chm) {
        System.out.print("Enter phone number: ");
        String phone = scanner.nextLine();

        while (!Validator.isPhoneNumber(phone)) {
            System.out.println("Invalid phone number!");
            System.out.print("Enter phone number: ");
            phone = scanner.nextLine();

            while (!chm.containsKey(phone)) {
                System.out.println("Can not have customer!");
                System.out.print("Enter phone number: ");
                phone = scanner.nextLine();
            }
        }
        return phone;
    }
}
