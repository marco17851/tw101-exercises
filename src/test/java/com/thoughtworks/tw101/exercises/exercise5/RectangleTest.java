package com.thoughtworks.tw101.exercises.exercise5;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Marco on 2/10/2017.
 */
public class RectangleTest {
    @Test
    public void areaShouldBe4() throws Exception {
        Rectangle rectangle = new Rectangle(1, 4);
        assertEquals(4, rectangle.area());
    }

    @Test
    public void areaShouldBe6() throws Exception {
        Rectangle rectangle = new Rectangle(3, 2);
        assertEquals(6, rectangle.area());
    }

    @Test
    public void areaShouldBe30() throws Exception {
        Rectangle rectangle = new Rectangle(5, 6);
        assertEquals(30, rectangle.area());
    }

    @Test
    public void areaShouldBeValid() throws Exception{
        Rectangle rectangle = new Rectangle(1, 2);
        assertEquals(2, rectangle.area());
    }

    @Test
    public void areaShouldNotBeValid() throws Exception{
        Rectangle rectangle = new Rectangle(-1, 2);
        assertEquals(-1, rectangle.area());
    }

}