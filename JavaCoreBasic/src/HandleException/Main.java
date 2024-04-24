package HandleException;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// custom exception
class ValidateAgeException extends RuntimeException {
    public ValidateAgeException (String message) {
        super(message);
    }
}
public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.validateAge(20,"Hello");
        try {
            main.testThrows("data.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
//        main.testThrows(); phải xử lý ngoại lệ

        try (FileInputStream fis = new FileInputStream("file.txt")) {
            int data = fis.read();
            while(data != -1) {
                System.out.print((char) data);
                data = fis.read();
            }
        } catch (IOException e) {
            System.out.println("Error reading from file.");
        } catch (NullPointerException npe) {
            System.out.println("Error null from string.");
        }

    }

    public void testThrows(String fileName) throws FileNotFoundException {
        readFile(fileName);
    }
    //throws Checked
    public static void readFile(String fileName)
            throws FileNotFoundException {
        FileReader fileReader = new FileReader(fileName);
    }

    //throws unChecked
    public void  validateAge(int age, String ms)
            throws NullPointerException, ValidateAgeException {
        if (ms == null) {
            //ném ra lỗi
            throw new NullPointerException("Chuỗi không được null");
        }
        if (age < 18) {
            throw new ValidateAgeException("Tuối lớn hơn 18");
        }
    }
}
