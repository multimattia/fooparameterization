/* (C)2024 */
package org.fooparameterization;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class FooParameterizationTest {
    @Test
    void testCalculateVolume() {
        FooParameterization fooParameterization = new FooParameterization();

        double radius = 5.0;
        double expectedVolume = 523.59877559829886; // Assuming a spherical volume
        double actualVolume = fooParameterization.calculateVolumeOfSphere(radius);
        assertEquals(expectedVolume, actualVolume, 0.0001);
    }

    @Test
    void testCalculateVolumeWithNegativeRadius() {
        FooParameterization fooParameterization = new FooParameterization();
        double negativeRadius = -5.0;

        IllegalArgumentException exception =
                assertThrows(
                        IllegalArgumentException.class,
                        () -> fooParameterization.calculateVolumeOfSphere(negativeRadius));

        assertEquals("Radius cannot be negative.", exception.getMessage());
    }

    @Test
    void testCalculateVolumeWithLargeRadius() {
        FooParameterization fooParameterization = new FooParameterization();
        double largeRadius = 1e200;

        IllegalArgumentException exception =
                assertThrows(
                        IllegalArgumentException.class,
                        () -> fooParameterization.calculateVolumeOfSphere(largeRadius));

        assertEquals("Radius is too large.", exception.getMessage());
    }
}
