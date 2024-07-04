package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`

    @Test
    public void testAddCat(){
        Cat cat =  new Cat();
        CatHouse.add(cat);

        Integer expected = 1;

        Integer actual = CatHouse.getNumberOfCats();

        Assert.assertEquals(actual,expected);
    }
    // TODO - Create tests for `void remove(Integer id)`

    @Test
    public void addTest(){
        Cat cat = new Cat();

        CatHouse.add(cat);

        Integer expected = 1;
        Integer actual = CatHouse.getNumberOfCats();


        Assert.assertEquals(actual,expected);
    }
    // TODO - Create tests for `void remove(Cat cat)`

    @Test
    public void removeTest(){
        Cat cat = new Cat();

        CatHouse.add(cat);
        CatHouse.remove(cat);

        Integer expected = 0;

        Assert.assertEquals(expected,CatHouse.getNumberOfCats());
    }
    // TODO - Create tests for `Cat getCatById(Integer id)`
    @Test
    public void getByIdTest(){
        Cat cat = new Cat(10);

        CatHouse.add(cat);

        Integer expected = 10;

        Assert.assertEquals(expected,cat.getId());


    }
    // TODO - Create tests for `Integer getNumberOfCats()`
    @Test
    public void getNumberOfCats(){
        Cat cat = new Cat();

        CatHouse.add(cat);

        Integer expected = 1;

        Assert.assertEquals(expected,CatHouse.getNumberOfCats());
    }
}
