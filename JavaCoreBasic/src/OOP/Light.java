package OOP;

//abstract class triển khai một interface
abstract class Light implements Switchable{
    private String name;
    private double price;

    public Light() {
    }

    public Light(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public void turnOn() {
        System.out.println("Light is turned on");
    }

    public void turnOff() {
        System.out.println("Light is turned off");
    }

    public abstract void work();

    public void broken() {
        System.out.println("Light is broken");
    }
}
