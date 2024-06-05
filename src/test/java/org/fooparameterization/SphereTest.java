/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.fooparameterization;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class FooParameterizationTest {
    @Test
    void testCalculateVolume() {
        Sphere fooParameterization = new Sphere();

        double radius = 5.0;
        double expectedVolume = 523.59877559829886; // Assuming a spherical volume
        double actualVolume = fooParameterization.calculateVolume(radius);
        assertEquals(expectedVolume, actualVolume, 0.0001);
    }

    @Test
    void testCalculateVolumeWithNegativeRadius() {
        Sphere fooParameterization = new Sphere();
        double negativeRadius = -5.0;

        IllegalArgumentException exception =
                assertThrows(
                        IllegalArgumentException.class,
                        () -> fooParameterization.calculateVolume(negativeRadius));

        assertEquals("Radius cannot be negative.", exception.getMessage());
    }

    @Test
    void testCalculateVolumeWithLargeRadius() {
        Sphere fooParameterization = new Sphere();
        double largeRadius = 1e200;

        IllegalArgumentException exception =
                assertThrows(
                        IllegalArgumentException.class,
                        () -> fooParameterization.calculateVolume(largeRadius));

        assertEquals("Radius is too large.", exception.getMessage());
    }
}
