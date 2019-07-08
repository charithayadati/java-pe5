package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CountOccurancesOfStringTest {
        CountOccurancesOfString countOccurences;
    @Before
    public void setUp(){
        System.out.println(" Before");
        countOccurences= new CountOccurancesOfString();
    }
    @After
    public void tearDown(){
        System.out.println("After");
        countOccurences=null;

    }

    @Test
    public void givenStringShouldReturnCountOfOccurancesOfAllElements(){
        String result=countOccurences.count("one one -one___two,,three,one @three*one?two");
        assertEquals("one:5 two:2 three:2",result);
    }
    @Test
    public void givenStringShouldReturnCountOfOccurences(){
        String result=countOccurences.count("string , string@is?is-string");
        assertEquals("string:3 is:2",result);
    }
    @Test
    public void givenStringShouldReturnNull(){
        String result=countOccurences.count(null);
        assertEquals(null ,result);
    }
}