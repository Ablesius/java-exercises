public class App {

    public static void main(String[] args) {

        Machine mach1 = new Machine();
        mach1.start();
        mach1.stop();

        System.out.println();

        Car1 car1 = new Car1("Corsa");
        car1.start();
        car1.stop();

        System.out.println();

        Car car2 = new Car();
        car2.setName("Astra");
        car2.show_info();
        car2.start();
        car2.wipe_windshield();
        car2.stop();

    }
}
