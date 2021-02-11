/**
 * W21COMP1008S2 Test 1 - Build a Pet class
 * Student: Mic Riewe #020027066
 */

public class Pet {

    private String name;
    private String type;
    private int age;
    private String colour;

    public Pet(String name, String type, int age, String colour) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.colour = colour;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getAge() {
        return age;
    }

    public String getColour() {
        return colour;
    }
}
