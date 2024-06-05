/* (C)2024 */
package org.fooparameterization;

public class FooParameterization {
    public double calculateVolumeOfSphere(double radius) {
        // Check if the radius is non-negative
        if (radius < 0) {
            throw new IllegalArgumentException("Radius cannot be negative.");
        }

        // Check if the radius is within a reasonable range
        if (radius > 1e100) {
            throw new IllegalArgumentException("Radius is too large.");
        }

        // Calculate the volume of the sphere using the formula: (4/3) * π * r^3
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

        return volume;
    }
}
