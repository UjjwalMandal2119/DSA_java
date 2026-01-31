package Array;

public class repeatedElements {
    public static void main(String args[]){
       int[] arr = {1, 2, 3, 2, 4, 1};

        System.out.print("Repeated elements: ");
        for (int i = 0; i < arr.length; i++) {
            boolean printed = false;

            // check if already printed before
            for (int k = 0; k < i; k++) {
                if (arr[i] == arr[k]) {
                    printed = true;
                    break;
                }
            }

            if (printed) continue;

            // check if it repeats later
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[i] + " ");
                    break;
                }
            }
        }
    }
}
