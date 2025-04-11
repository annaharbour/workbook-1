package com.pluralsight;

import java.math.BigDecimal;
import java.util.ArrayList;

public class VariableDeclarations {
    private static String printType(Object o) {
        return o.getClass().getSimpleName();
    }

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
        String phoneNumber = "15555555555";
//        9 digits, within scope of int
        long socialSecurityNumber = 555_55_5555L;
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
            System.out.printf(dataType[0] + " : " + dataType[1] + " : " + printType(dataType[1]) + "%n");
        }
    }
};