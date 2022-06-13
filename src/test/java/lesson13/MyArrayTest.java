package lesson13;

import com.hillel.lonzhansky.lessons.lesson13.MyArray;
import org.junit.jupiter.api.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MyArrayTest {

    MyArray myArray = new MyArray();
    int[][] array = new int[][] {{1, 2, 3}, {2, 3, 4}, {1, 4 ,5}};
//    static FileInputStream fileInputStream;

//    @BeforeAll
//    public void setUpAll() {
//        try {
//            fileInputStream = new FileInputStream("dd.txt");
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//    }

    @BeforeEach
    public void setUp() {
        array = new int[][] {{(int) (Math.random() * 10), 2, 3}, {2, 3, 4}, {1, 4 ,5}};
    }


    @Test
    public void average() {
        assertEquals(2.7777777777777777, myArray.getAverage(array));
    }

    @Test
    public void average2() {
        assertEquals(2.7777777777777777, myArray.getAverage(array));
    }

    @Test
    public void isSquare() {
        assertTrue(myArray.isSquare(null));
    }

//    @AfterAll
//    public static void close() {
//        try {
//            fileInputStream.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

}
