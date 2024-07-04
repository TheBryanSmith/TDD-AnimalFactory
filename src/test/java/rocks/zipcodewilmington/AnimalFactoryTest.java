package rocks.zipcodewilmington;

import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;

import static org.junit.Assert.assertEquals;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    @Test
    public void createDogTest(){

    AnimalFactory animalFactory = new AnimalFactory();
    Dog dog = new Dog();
    Date birthday = new Date();
    String name = "Will";

    Dog Will = animalFactory.createDog(name, birthday);

    assertEquals(name, Will.getName());
    assertEquals(birthday, Will.getBirthDate());
}

    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`
    @Test
    public void createCatTest(){

        AnimalFactory animalFactory = new AnimalFactory();
        Cat cat = new Cat();
        Date birthday = new Date();
        String name = "Johnathan";

        Cat jon = animalFactory.createCat(name, birthday);

        assertEquals(name, jon.getName());
        assertEquals(birthday, jon.getBirthDate());
    }
}
