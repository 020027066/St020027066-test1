import java.util.Arrays;
import java.util.List;

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
        setName(name);
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

    /**
     * Validate the naem entered and set instance name variable
     * @param name
     */
    public void setName(String name) {

        if (name.trim().length() >= 2 )
            this.name = name;
        else
            throw new IllegalArgumentException("The name must be two or more characters.");
    }

    /**
     * Validate type of animal entered and set instance variable type
     * @param type
     */
    public void setType(String type) {

        this.type = type.toLowerCase();

//        List<String> animals = Arrays.asList("dog", "cat", "bird", "reptile", "fish");
//
//        for (String animal : animals)
//        {
//            if ( type.toLowerCase().equals(animal) )
//                this.type = type;
//            else
//                throw new IllegalArgumentException("Valid type must be one of " + animals);
//        }
    }

    /**
     * Validate if age entered is between 0-60 years and set instance variable
     * @param age
     */
    public void setAge(int age) {

        if( age >= 0 && age <= 60)
            this.age = age;
        else
            throw new IllegalArgumentException("Age must be an integer between 0 and 60");
    }



}
