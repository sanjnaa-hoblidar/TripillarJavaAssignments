package javaassignmodule7;

public class BinarySearch {
        public static void main(String[] args) {

            int[] arr = {1,3,4,5,6};
            int target = 4;

            int left = 0, right = arr.length-1;

            while(left <= right){
                int mid = (left+right)/2;

                if(arr[mid] == target){
                    System.out.println("Found at " + mid);
                    return;
                }

                if(arr[mid] < target)
                    left = mid+1;
                else
                    right = mid-1;
            }
        }
    }
