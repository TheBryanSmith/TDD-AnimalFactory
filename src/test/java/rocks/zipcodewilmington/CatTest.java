package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`


    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void testSetName(){
        Cat cat = new Cat();
        cat.setName("Garfield");
        String actual ="Garfield";
        String expected = cat.getName();
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void testSpeak(){
        Cat cat = new Cat();
        cat.speak();
        String actual ="meow!";
        String expected = cat.speak();
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void testEat(){
        Cat cat = new Cat();
        cat.eat(new Food("Fancy Feast"));

        Integer expected = 1;
        Assert.assertEquals(expected,cat.getNumberOfMealsEaten());
    }

    @Test
    public void testGetID(){
        Cat cat = new Cat();
        Integer expected = 0;
        Integer actual = cat.getId();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void inheritanceCheckAnimales(){
        Cat cat = new Cat();
    Assert.assertTrue(cat instanceof Animal);
    }

    @Test
    public void inheritanceCheckMammal(){
        Cat cat = new Cat();
    Assert.assertTrue(cat instanceof Mammal);
    }



}
