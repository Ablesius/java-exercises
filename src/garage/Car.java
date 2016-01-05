package garage;

public class Car extends Machine {
    // all that is set here overrides the methods and variables of the same name in garage.Machine.java!
    public String name;

    @Override   // "annotation"; checks whether it's a real override
    public void setName(String name) {
        this.name = name;
    }


    @Override
    public void start() {
        super.start();
    }

    @Override
    public void stop() {
        super.stop();
    }

    /*
    public void start() {
        System.out.printf("%s started\n", name);
    }

    public void stop() {
        System.out.printf("%s stopped\n", name);
    }*/

    public void wipe_windshield() {
        System.out.println("Wiping windshield");
    }

    public void show_info() {
        System.out.printf("garage.Car name: %s\n", name);
    }
}
