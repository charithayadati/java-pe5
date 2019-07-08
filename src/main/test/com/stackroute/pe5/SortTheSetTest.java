package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.SortedSet;

import static org.junit.Assert.*;

public class SortTheSetTest {
    SortTheSet sortTheSet;
    @Before
    public void setUp(){
        System.out.println(" Before");
       sortTheSet= new SortTheSet();
    }
    @After
    public void tearDown(){
        System.out.println("After");
        sortTheSet=null;

    }

    @Test
    public void givenStringShouldReturnSortedset(){
        String result=sortTheSet.sort("Harry Alice Olive Bluto Eugene");
        assertEquals("[Alice, Bluto, Eugene, Harry, Olive]",result);
    }
    @Test
    public void givenStringShouldReturnSortedStrings(){
        String result=sortTheSet.sort("stack route books test java");
        assertEquals("[books, java, route, stack, test]",result);
    }
    @Test
    public void givenStringShouldReturnNull(){
        String result=sortTheSet.sort(null);
        assertEquals(null ,result);
    }

}