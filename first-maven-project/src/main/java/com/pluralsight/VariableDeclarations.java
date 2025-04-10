package com.pluralsight;

import java.util.ArrayList;

public class VariableDeclarations {

    public static void main(String[] args) {
        String vehicleIdentificationNumber = "1F6A1234567890123";
        String vehicleMakeModel = "Ford Explorer";
        String vehicleColor = "red";
        boolean hasTowingPackage = true;
        float odometerReading = 999999.9f;
        //                doubles more precise than floats
        double price = 25000.00;
        char qualityRating = 'A';
//        could also use a string
        long phoneNumber = 15555555555L;
//        9 digits, within scope of int
        int socialSecurityNumber = 555555555;
        int zipCode = 28226;


        Object[][] dataTypes = {
                {"a vehicle identification number in the range 1000000 - 9999999", vehicleIdentificationNumber},
                {"a vehicle make / model(i.e.Ford Explorer)", vehicleMakeModel},
                {"a vehicle color", vehicleColor},
                {"whether the vehicle has a towing package", hasTowingPackage},
                {"an odometer reading", odometerReading},
                {"a price", price},
                {"a quality rating(A, B, or C)", qualityRating},
                {"a phone number", phoneNumber},
                {"a social security number", socialSecurityNumber},
                {"a zip code", zipCode}
        };

        System.out.println("Data Types");
        System.out.println("----------------");
        for (Object[] dataType : dataTypes) {
            System.out.printf("%-40s %s%n", dataType[0], dataType[1]);
        }
    }
}
;