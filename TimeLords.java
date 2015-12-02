class Person {

    // instance variables
    String name;
    int age;
    boolean isTimeLord = false;

    //instance methods
    void speak() {
        System.out.println("I am " + name + ". I am " + age + " years old.");
        if (isTimeLord){
            System.out.println("I am a Time Lord. Any questions? ");
        }
    }


    /* TODO:
    *   create a test for which doctor it is, and let him say his
    *    typical catch phrase
    */

    // use this as base for a real test of which doctor we have
    //void say_phrase(int regeneration) {
        //if (isTimeLord){
            //int regeneration;
            //System.out.println(phrase);
        //}
    //}

}

public class TimeLords {

    // this is a subroutine:
    // only needed for the first class in the programme
	public static void main (String args[]) {

    Person Ten = new Person();
    Ten.name = "John Smith";
    Ten.age = 903;
    Ten.isTimeLord = true;
    // Ten.regeneration = 10;
    Ten.speak();

    Person Sarah = new Person();
    Sarah.name = "Sarah Jane Smith";
    Sarah.age = 54;

    System.out.println(
        "Person '" + Ten.name + "' is " + Ten.age + " years old."
    );
    if (Ten.isTimeLord) {
        System.out.println(Ten.name + " is a Time Lord.");
    }
    else {
        System.out.println(Ten.name + " unfortunately is not a Time Lord.");
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
