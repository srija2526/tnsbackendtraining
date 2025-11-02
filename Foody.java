class Food {
    String fruits;
    String shakes;
    String sweets;

    void taste() {
        System.out.println("Amazing taste");
    }
}
//executor class for foodclass.
public class Foody {
    public static void main(String[] args) {
        Food f = new Food();
        f.fruits = "Apple";
        f.shakes = "Thick shake";
        f.sweets = "Gulab Jamun";

        f.taste();

        System.out.println("Fruit: " + f.fruits);
        System.out.println("Shake: " + f.shakes);
        System.out.println("Sweet: " + f.sweets);
    }
}
