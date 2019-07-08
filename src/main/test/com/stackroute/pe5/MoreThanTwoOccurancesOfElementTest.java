package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MoreThanTwoOccurancesOfElementTest {
    MoreThanTwoOccurancesOfElement moreThanTwo;
    @Before
    public void setUp(){
        System.out.println(" Before");
        moreThanTwo= new MoreThanTwoOccurancesOfElement();
    }
    @After
    public void tearDown(){
        System.out.println("After");
        moreThanTwo=null;

    }

    @Test
    public void givenStringShouldReturnTrueOrFalseBasedOnCount(){
        String result=moreThanTwo.findIfMoreThanTwo("a,b,c,d,a,c,c");
        assertEquals("a:true b:false c:true d:false",result);
    }
   @Test
    public void givenStringShouldReturnTrue(){
        String result=moreThanTwo.findIfMoreThanTwo("string,string,is,is,string");
        assertEquals("string:true is:true",result);
    }
    @Test
    public void givenStringShouldReturnNull(){
        String result=moreThanTwo.findIfMoreThanTwo(null);
        assertEquals(null ,result);
    }
}