
package com.example;

import java.util.Random;

public class RandomNumber {
    public static int getRandomNumber() {
        Random random = new Random();
        return random.nextInt(100) + 1;  // nextInt(100) returns a number between 0 (inclusive) and 100 (exclusive), so we add 1 to shift the range to 1-100.
    }
}
