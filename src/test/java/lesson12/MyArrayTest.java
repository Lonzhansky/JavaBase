package lesson12;

import com.hillel.lonzhansky.lessons.lesson12.MyArray;
import org.junit.*;

public class MyArrayTest {
    MyArray myArray;

    @Before
    public void setUp() {
        System.out.println("before");
        myArray = new MyArray();
    }

    @Test
    public void testFindElement() {
        System.out.println("testFindElement");
        Assert.assertEquals(-1, myArray.findElement(9));
    }

    @Test
    public void testFindElement2() {
        System.out.println("testFindElement2");
        Assert.assertEquals(-1, myArray.findElement(66));
    }

    @After
    public void after() {
        System.out.println("after");
        myArray = null;
    }

    @Test
    public void testFindElement3() {
        System.out.println("testFindElement3");
        Assert.assertEquals(-1, myArray.findElement(1));
    }

}