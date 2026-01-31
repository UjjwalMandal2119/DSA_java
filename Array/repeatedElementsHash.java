package Array;

import java.util.HashSet;

public class repeatedElementsHash {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 1};

        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicate = new HashSet<>();

        for (int num : arr) {
            if (!seen.add(num)) {
                duplicate.add(num);
            }
        }

        System.out.print("Repeated elements: ");
        for (int num : duplicate) {
            System.out.print(num + " ");
        }
    }
}
