package Homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    Main main;
     @BeforeEach
    public void init (){
         main= new Main();
    }
    @Test
    public void testing_map_oneElementA(){
        Map<String,String>actual = new HashMap<>();
        actual.put("a","Hi");
        Map<String,String>expected = new HashMap<>();
        expected.put("a","Hi");
         assertEquals(expected,main.map(actual));
    }
    @Test
    public void testing_map_oneElementB(){
        Map<String,String>actual = new HashMap<>();
        actual.put("b","There");
        Map<String,String>expected = new HashMap<>();
        expected.put("b","There");
        assertEquals(expected,main.map(actual));
    }
    @Test
    public void testing_map_twoElements(){
        Map<String,String>actual = new HashMap<>();
        actual.put("a","Hi");
        actual.put("b","There");
        Map<String,String>expected = new HashMap<>();
        expected.put("a","Hi");
        expected.put("ab","HiThere");
        expected.put("b","There");
        assertEquals(expected,main.map(actual));
    }
    @Test
    public void testing_map_emptyMap(){
        Map<String,String>actual = new HashMap<>();
        Map<String,String>expected = new HashMap<>();
        assertEquals(expected,main.map(actual));
    }

    //_______________________________________________________________________________________________________________

    @Test
    public void testing_word_multiple(){
        String[]actual={"a","b","a","b","c"};
        Map<String,Boolean>expected=new HashMap<>();
        expected.put("a",true);
        expected.put("b",true);
        expected.put("c",false);

        assertEquals(expected,main.wordMultiple(actual));

    }
    @Test
    public void testing_word_multipleAllFalse(){
        String[]actual={"a","b","c"};
        Map<String,Boolean>expected=new HashMap<>();
        expected.put("a",false);
        expected.put("b",false);
        expected.put("c",false);

        assertEquals(expected,main.wordMultiple(actual));

    }
    @Test
    public void testing_word_multipleAllTrue(){
        String[]actual={"c","c","c","c","c"};
        Map<String,Boolean>expected=new HashMap<>();
        expected.put("c",true);

        assertEquals(expected,main.wordMultiple(actual));

    }
    @Test
    public void testing_word_multipleEmptyArray(){
        String[]actual={};
        Map<String,Boolean>expected=new HashMap<>();

        assertEquals(expected,main.wordMultiple(actual));

    }

    //__________________________________________________________________________________________________________________

    @Test
    public void testing_nameToNumberOccurence_Jack(){
        List<String> actual= Arrays.asList("John","John","Jack","Jack","Jack");
        int expected= 3;

        assertEquals(expected,main.nameToNumberOccurence(actual,"Jack"));
    }
    @Test
    public void testing_nameToNumberOccurence_John(){
        List<String> actual= Arrays.asList("John","John","Jack","Jack","Jack");
        int expected= 2;

        assertEquals(expected,main.nameToNumberOccurence(actual,"John"));
    }
    @Test
    public void testing_nameToNumberOccurenceEmptyList(){
        List<String> actual= Arrays.asList();
        int expected= 0;

        assertEquals(expected,main.nameToNumberOccurence(actual,"Jack"));
    }









}