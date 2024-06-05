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

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Sphere sphere = new Sphere();
        double radius = 20;
        double example = sphere.calculateVolume(radius);
        System.out.println("Sphere of size " + radius + " is " + example);
        Scanner scanner = new Scanner(System.in);
        boolean continueCalculation = true;

        while (continueCalculation) {
            System.out.print("Enter the radius of the sphere (or type 'quit' to exit): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("quit")) {
                continueCalculation = false;
            } else {
                try {
                    double userRadius = Double.parseDouble(input);
                    double volume = sphere.calculateVolume(userRadius);
                    System.out.println("The volume of the sphere is: " + volume);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a valid number.");
                }
            }
        }

        scanner.close();
    }
}
