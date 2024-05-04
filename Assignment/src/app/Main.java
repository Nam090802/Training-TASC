package app;

import services.CustomerManagement;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CustomerManagement cm = new CustomerManagement();

        while (true) {
            System.out.println("\n\n=========== MENU ===========");
            System.out.println("1. View all customer information.");
            System.out.println("2. Add customer information.");
            System.out.println("3. Search customer information by phone number.");
            System.out.println("4. Update customer information.");
            System.out.println("5. Delete customer information.");
            System.out.println("0. Exit.");
            System.out.println("===============================");
            System.out.print("Please choose (0-5): ");

            int choice;
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                scanner.nextLine();
                System.out.println();
            } else {
                System.out.println("Lựa chọn không hợp lệ. Vui lòng nhập một số.");
                scanner.nextLine();
                continue;
            }

            switch (choice) {
                case 1:
                    cm.view();
                    break;
                case 2:
                    cm.add();
                    break;
                case 3:
                    cm.find();
                    break;
                case 4:
                    cm.update();
                    break;
                case 5:
                    cm.delete();
                    break;
                case 0:
                    System.out.println("Bye!");
                    return;
                default:
                    System.out.println("Invalid selection");
            }
        }
    }
}