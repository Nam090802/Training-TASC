package OOP;

public class Lamp extends Light{
    public Lamp() {
    }

    public Lamp(String name, double price) {
        super(name, price);
    }

    //override lại phương thức trừu tượng
    @Override
    public void work() {
        System.out.println("Lamp is work...");
    }
}
