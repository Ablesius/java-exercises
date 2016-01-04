public class Car1 extends Machine {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Car1() {
        setName("Car1");
    }

    public Car1(String name) {
        setName(name);
    }

    public void start() {
        System.out.printf("%s started\n", name);
    }

    public void stop() {
        System.out.printf("%s stopped\n", name);
    }
}
