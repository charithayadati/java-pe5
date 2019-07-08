package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SortTest {
    Sort sort;
    @Before
    public void setUp(){
        System.out.println(" Before");
        sort= new Sort();
    }
    @After
    public void tearDown(){
        System.out.println("After");
        sort=null;

    }
    @Test
    public void givenListOfStudentDetailsShouldReturnSortedList(){
        List<Student> students = new ArrayList<>();
        Student s1 = new Student("Route", 21, 36);
        Student s2 = new Student("Stack", 22, 15);
        Student s3 = new Student("Test", 20, 18);
        Student s4 = new Student("Java", 25, 69);
        Student s5 = new Student("Code", 23, 52);
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        List<Student> result= sort.sortstudent(students);
        assertEquals(students,result);
    }
    @Test
    public void givenNoDetailsOfStudentsShouldReturnNull(){
        List<Student> studentList=new ArrayList<>();
        List<Student> result=sort.sortstudent(studentList);
        assertNull("returned null",result);
    }

}