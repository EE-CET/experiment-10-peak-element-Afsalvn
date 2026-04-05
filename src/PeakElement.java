

import java.util.Scanner;

public class PeakElement {

    /**
     * Finds the index of the first peak element in an array.
     * This aligns with CO2: Developing Java programs using arrays[cite: 7].
     */
    public int findPeak(int n, int[] arr) {
        // Handle empty array or size 0
        if (n <= 0) return -1;
        
        // Handle single element array (it is always a peak)
        if (n == 1) return 0;

        for (int i = 0; i < n; i++) {
            // Check first element
            if (i == 0) {
                if (arr[i] >= arr[i + 1]) return i;
            } 
            // Check last element
            else if (i == n - 1) {
                if (arr[i] >= arr[i - 1]) return i;
            } 
            // Check middle elements (must be >= both neighbors)
            else {
                if (arr[i] >= arr[i - 1] && arr[i] >= arr[i + 1]) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            
            Main solver = new Main();
            System.out.println(solver.findPeak(n, arr));
        }
        sc.close();
    }
}
