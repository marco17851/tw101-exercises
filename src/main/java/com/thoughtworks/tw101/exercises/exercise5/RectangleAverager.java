package com.thoughtworks.tw101.exercises.exercise5;

public class RectangleAverager {

    /**
     * Averages the area of all VALID given rectangles
     * @param rectangles - array of Rectangle objects
     * @return - average area of all rectangles
     */
    public float averageArea(Rectangle[] rectangles) {
        int sum_areas = 0;
        int num_rectangles = rectangles.length;

        // Only averages area of rectangles with positive areas
        for (Rectangle rectangle: rectangles){
            if (rectangle.area() == -1){
                num_rectangles -= 1;
                continue;
            }
            sum_areas += rectangle.area();
        }

        return sum_areas/num_rectangles;
    }
}
