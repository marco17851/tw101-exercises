package com.thoughtworks.tw101.exercises.exercise5;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Marco on 2/10/2017.
 */
public class RectangleAveragerTest {
    public double DELTA = Double.MIN_VALUE;
    private RectangleAverager averager;

    @Before
    public void setUp() throws Exception {
        averager = new RectangleAverager();
    }

    @Test
    public void averageAreaOf2DifferentAreaRectanglesShouldBe55() throws Exception {
        Rectangle[] rectangles = {
                new Rectangle(6, 9),
                new Rectangle(7, 8)
        };

        assertEquals(55, averager.averageArea(rectangles), DELTA);
    }

    @Test
    public void averageAreaOf5DifferentAreaRectanglesShouldBe22() throws Exception {
        Rectangle[] rectangles = {
                new Rectangle(2, 3),
                new Rectangle(3, 4),
                new Rectangle(4, 5),
                new Rectangle(5, 6),
                new Rectangle(6, 7)
        };

        assertEquals(22, averager.averageArea(rectangles), DELTA);
    }

    @Test
    public void averageAreaOf3SameAreaRectanglesShouldBe12() throws Exception {
        Rectangle[] rectangles = {
                new Rectangle(1, 12),
                new Rectangle(6, 2),
                new Rectangle(3, 4)
        };

        assertEquals(12, averager.averageArea(rectangles), DELTA);
    }

    @Test
    public void averageAreaOf2ValidRectanglesShouldBe10() throws Exception {
        Rectangle[] rectangles = {
                new Rectangle(1, 12),
                new Rectangle(2, 4),
                new Rectangle(-3, -4)
        };

        assertEquals(10, averager.averageArea(rectangles), DELTA);
    }

}