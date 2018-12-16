package com.company;
import java.util.HashSet;

// Target: find two neighbour cows within a given range of position
// And report the biggest number on the body of those paired-cows

public class cow {

    static int crowded_cows(int[] cow_list, int k){

        // 1. set is faster than queue or other linear structures in this question
        // 2. set needs less memory space than HashMap

        HashSet<Integer> hash = new HashSet<>();
        int max = -1;  // as stated in the question

        // Step1:
        // add first kth number into the map and record the maximum repeated number
        // k is determined to be less than len(cow_list), as stated in the question

        for(int i = 0; i <= k; i++){
            if(hash.contains(cow_list[i]))
                max = max > cow_list[i] ? max : cow_list[i];
            else
                hash.add(cow_list[i]);
        }

        // Step2:
        // For the (k+1)th number, it should not be compared with the 0th
        // Therefore we should move the 0th out of the map and add the (k+1), if not repeated.

        for(int j = k+1; j < cow_list.length; j++){

            if (hash.contains(cow_list[j-k-1])) {
                hash.remove(cow_list[j-k-1]);
            } else {
                continue;
            }

            // We use cow_list to recall the 1 to kth value that we tried to add to the set.
            // However, it is possible that the number is not in the set, because:
            // 1) it didn't enter into the set because it is repeated.
            // 2) it has been removed since there is the same number before within k range in cow_list.
            // (Then it should already tried to replace 'max' in the first step.)

            // It doesn't matter because we have save the 'max' value, no matter whether 'max'=cow_list(j-k-1)
            // Just pretend that we have removed the 'head' number based on the time sequence.

            if(hash.contains(cow_list[j]))
                max = max > cow_list[j] ? max : cow_list[j];
            else
                hash.add(cow_list[j]);
        }

        return max;
    }
}
