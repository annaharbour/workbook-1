package com.pluralsight;

public class MathApplication {
    public static void main(String[] args) {
//        Question 1
        double bobSalary = 50000;
        double garySalary = 60000;
        double highestSalary = Math.max(bobSalary, garySalary);
//Question 2
        double carPrice = 14000.99;
        double truckPrice = 19999.99;
        double cheapestVehicle = Math.min(carPrice, truckPrice);
//Question 3
        double radius = 7.25;
        double area = Math.PI * Math.pow(radius, 2);
//Question 4
        double x = 5.0;
        double squareRoot = Math.sqrt(x);

//Question 5
        int[][] points = {{5, 10}, {85, 50}};
        double distance = Math.sqrt(
                Math.pow(points[0][1] - points[0][0], 2) + Math.pow(points[1][1] - points[1][0], 2));
//Question 6
        double num = -3.8;
        double positiveNum = Math.abs(num);
//Question 7
        int min = 0;
        int max = 1;
//        random double within range of min and max
        double randomD = min + (max - min) * Math.random();


        Object[][] answers = {
                {"1. The highest salary is...", highestSalary},
                {"2. The lowest car price is...", cheapestVehicle},
                {"3. The area of the circle is...", area},
                {"4. The square root is...", squareRoot},
                {"5. The distance is...", distance},
                {"6. The absolute value is...", positiveNum},
                {"7. The random number is...", randomD}
        };

        for (Object[] answer : answers) {
            System.out.printf("%-40s %s%n", answer[0], answer[1]);
        }
    }
}
