package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class UpdateArrayElementTest {
    UpdateArrayElement updateArrayElement;
    @Before
    public void setUp(){
        updateArrayElement =new UpdateArrayElement();

    }
    @After
    public void tearDown()
    {
        updateArrayElement =null;
    }
    @Test
    public void givenIndexAndReplaceElementShouldReturnReplacedArray()
    { List<String> result=new ArrayList<>();
        List<String> actual= updateArrayElement.replaceElement("stack",3);
        assertEquals(result,actual);

    }
    @Test
    public void givenIndexAndReplacelementShouldReturnReplacedAndClearedArray()
    { List<String> result=new ArrayList<>();
        List<String> actual= updateArrayElement.replaceElement(null,2);
        assertEquals(result,actual);

    }
    @Test
    public void givenIndexAReplacelementShouldReturnNull()
    { List<String> result=new ArrayList<>();
        List<String> actual= updateArrayElement.replaceElement("route",-3);
        assertNull("index cannot be negative",actual);

    }

}