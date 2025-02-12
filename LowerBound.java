import java.util.*;
public class LowerBound {

        public static int lowerBound(int[] arr, int target) {
            int start = 0, end = arr.length;
    
            while (start < end) {
                int mid = start + (end - start) / 2;
    
                if (arr[mid] > target) {
                    end = mid; 
                } else {
                    start = mid + 1; 
                }
            }
    
            return start; 
        }
    
        public static void main(String[] args) {
            int[] arr = {1, 3, 5, 7, 9, 11, 12}; // Sorted array
            int target = 9; // Target value to find the lower bound for
    
            int result = lowerBound(arr, target);
            System.out.println(result);  // Output: 4 (index of target 9)
        }
    }
    