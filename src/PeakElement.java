
    
import java.util.Scanner;

public class PeakElement {

    /**
     * findPeakIndex() iterates through the array to find the first peak.
     * A peak is an element not smaller than its neighbors.
     */
    public int findPeakIndex(int[] arr, int n) {
        if (n <= 0) return -1;
        if (n == 1) return 0; // Single element is always a peak

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
            
            PeakFinder solver = new PeakFinder();
            System.out.println(solver.findPeakIndex(arr, n));
        }
        sc.close();
    }
}
