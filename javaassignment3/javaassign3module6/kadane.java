package javaassign3module6;

public class kadane {
        public static void main(String[] args) {
            int[] arr = {-2,1,3,4,-11,2,1,-15,4};

            int maxSum = arr[0];
            int current = arr[0];

            for(int i=1;i<arr.length;i++){
                current = Math.max(arr[i], current + arr[i]);
                maxSum = Math.max(maxSum, current);
            }

            System.out.println("Maximum Subarray Sum: " + maxSum);
        }
    }

