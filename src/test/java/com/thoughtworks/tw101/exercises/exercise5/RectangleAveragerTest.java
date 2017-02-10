package com.thoughtworks.tw101.exercises.exercise5;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Marco on 2/10/2017.
 */
public class RectangleAveragerTest {
    public double DELTA = Double.MIN_VALUE;

    @Test
    public void averageAreaOf2DifferentAreaRectangles() throws Exception {
        Rectangle[] rectangles = {
                new Rectangle(6, 9),
                new Rectangle(7, 8)
        };
        RectangleAverager averager = new RectangleAverager();

        assertEquals(55, averager.averageArea(rectangles), DELTA);
    }

    @Test
    public void averageAreaOf5DifferentAreaRectangles() throws Exception {
        Rectangle[] rectangles = {
                new Rectangle(2, 3),
                new Rectangle(3, 4),
                new Rectangle(4, 5),
                new Rectangle(5, 6),
                new Rectangle(6, 7)
        };
        RectangleAverager averager = new RectangleAverager();

        assertEquals(22, averager.averageArea(rectangles), DELTA);
    }

    @Test
    public void averageAreaOf3SameAreaRectangles() throws Exception {
        Rectangle[] rectangles = {
                new Rectangle(1, 12),
                new Rectangle(6, 2),
                new Rectangle(3, 4)
        };
        RectangleAverager averager = new RectangleAverager();

        assertEquals(12, averager.averageArea(rectangles), DELTA);
    }

    @Test
    public void averageAreaOf2ValidRectangles() throws Exception {
        Rectangle[] rectangles = {
                new Rectangle(1, 12),
                new Rectangle(2, 4),
                new Rectangle(-3, -4)
        };
        RectangleAverager averager = new RectangleAverager();

        assertEquals(10, averager.averageArea(rectangles), DELTA);
    }

}