package javaassignmodule7;

public class FirstLastOccurence {


        public static void main(String[] args){

            int[] arr = {1,2,1,2,3,1};
            int key = 1;

            int first=-1,last=-1;

            for(int i=0;i<arr.length;i++){
                if(arr[i]==key){
                    if(first==-1)
                        first=i;
                    last=i;
                }
            }

            System.out.println("First: "+first);
            System.out.println("Last: "+last);
        }
    }

