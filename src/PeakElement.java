import java.util.Scanner;

// The class name MUST match the filename PeakElement.java
public class PeakElement {

    /**
     * Finds the index of the first peak element.
     * Aligns with CO2: Developing programs using arrays[cite: 7].
     */
    public int findPeak(int n, int[] arr) {
        if (n <= 0) return -1;
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
            // Check middle elements
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
            
            // FIX: Changed 'Main' to 'PeakElement' to match the class name
            PeakElement solver = new PeakElement();
            System.out.println(solver.findPeak(n, arr));
        }
        sc.close();
    }
}
