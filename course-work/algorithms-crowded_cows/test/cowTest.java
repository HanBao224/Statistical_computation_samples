package com.company;
import java.util.HashSet;

import org.junit.Test;
import static org.junit.Assert.*;


// Written with JUnit4

public class cowTest {
    @Test

   public void main() throws Exception {
        cow c = new cow();
       
        // Normal case
        assertEquals(3, c.crowded_cows(new int[]{7, 3, 4, 2, 3, 10, 4}, 3));
        // Null case
        assertEquals(-1, c.crowded_cows(new int[]{7, 3, 1, 0}, 2));
        // Test if it matters if we remove one number from the set and have it again later
        // the number is 3
        assertEquals(3, c.crowded_cows(new int[]{3, 3, 9, 8, 5, 6, 3}, 2));

    }

}
