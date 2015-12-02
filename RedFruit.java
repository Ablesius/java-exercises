class Person {
    String name;
    int age;
    boolean isTimeLord = false;
    }

public class RedFruit {

    // this is a subroutine:
    /* only needed for the first class in the programme */

	public static void main (String args[]) {

    Person Tom = new Person();
    Tom.name = "John Smith";
    Tom.age = 903;
    Tom.isTimeLord = true;

    Person Sarah = new Person();
    Sarah.name = "Sarah Jane Smith";
    Sarah.age = 54;

    System.out.println(
        "Person '" + Tom.name + "' is " + Tom.age + " years old."
    );
    if (Tom.isTimeLord) {
        System.out.println(Tom.name + " is a Time Lord.");
    }
    else {
        System.out.println(Tom.name + " unfortunately is not a Time Lord.");
        }

    System.out.println(
        "Person '" + Sarah.name + "' is " + Sarah.age + " years old."
    );
    if (Sarah.isTimeLord) {
        System.out.println(Sarah.name + " is a Time Lord.");
    }
    else {
        System.out.println(Sarah.name + " unfortunately is not a Time Lord.");
        System.out.println("She is not a Time Lady, either!");
	}
}

}
