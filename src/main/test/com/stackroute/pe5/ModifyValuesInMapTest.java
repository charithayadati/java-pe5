package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Map;
import java.util.TreeMap;

import static org.junit.Assert.*;

public class ModifyValuesInMapTest {

    ModifyValuesInMap modifyValuesInMap;
    @Before
    public void setUp(){
        System.out.println(" Before");
        modifyValuesInMap= new ModifyValuesInMap();
    }
    @After
    public void tearDown(){
        System.out.println("After");
        modifyValuesInMap=null;

    }

    @Test
    public void givenMapShouldReturnMapWithReplacedValues(){
        Map<String,String> input=new TreeMap<String, String>();
        input.put("val1","Java");
        input.put("val2","C++");
        Map<String,String> expected=new TreeMap<String, String>();
        expected.put("val1"," ");
        expected.put("val2","Java");
        Map<String,String> result=modifyValuesInMap.replacevalue(input);
        assertEquals(expected,result);
    }
    @Test
    public void givenStringShouldReturnRestrictedMapSize(){
        Map<String,String> input=new TreeMap<String, String>();
        input.put("val1","Java");
        input.put("val2","C++");
        input.put("val3"," ");
        Map<String,String> result=modifyValuesInMap.replacevalue(input);
        assertNull("Map Size is More than 2",result);
    }
    @Test
    public void givenSShouldReturnEmptyValueNotAccepted(){
        Map<String,String> input=new TreeMap<String, String>();
        input.put("val1","");
        input.put("val2","java");
        Map<String,String> result=modifyValuesInMap.replacevalue(input);
        assertNull("Val1 is Empty",result);
    }
}

