package garage;

public class Machine {
    //
    protected String name = "garage.Machine Type 1";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Machine() {
        // setName("garage.Machine");
    }

    public Machine(String name) {
        setName(name);
    }

    public void start() {
        System.out.printf("%s started\n", name);
    }

    public void stop() {
        System.out.printf("%s stopped\n", name);
    }
}
