package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }

        @Test
        public void testBirthDate(){
        Dog dog = new Dog();
        Date expected = new Date();
            dog.setBirthDate(expected);

        Date actual = dog.getBirthDate();
        Assert.assertEquals(actual,expected);
        }

        @Test
    public void testIntegerId(){
        Dog dog = new Dog();
        Integer expected = 0;
        Integer actual = dog.getId();

        Assert.assertEquals(expected,actual);


        }

    @Test
    public void testSpeak(){
        Dog dog = new Dog();
        dog.speak();
        String actual ="bark!";
        String expected = dog.speak();
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void testEat(){
        Dog dog = new Dog();
        dog.eat(new Food("T-Bone steak"));

        Integer expected = 1;
        Assert.assertEquals(expected,dog.getNumberOfMealsEaten());
    }

    @Test
    public void testGetID(){
        Dog dog = new Dog();
        Integer expected = 0;
        Integer actual = dog.getId();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void inheritanceCheckAnimales(){
        Dog dog = new Dog();
        Assert.assertTrue(dog instanceof Animal);
    }

    @Test
    public void inheritanceCheckMammal(){
        Cat dog = new Cat();
        Assert.assertTrue(dog instanceof Mammal);
    }

}
