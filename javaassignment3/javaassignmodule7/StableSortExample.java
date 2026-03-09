package javaassignmodule7;

    class Student {
        int marks;
        String name;

        Student(int marks, String name) {
            this.marks = marks;
            this.name = name;
        }
    }

    public class StableSortExample {
        public static void main(String[] args) {

            Student[] arr = {
                    new Student(90,"A"),
                    new Student(80,"B"),
                    new Student(90,"C")
            };

            for(int i=0;i<arr.length;i++){
                for(int j=0;j<arr.length-i-1;j++){

                    if(arr[j].marks > arr[j+1].marks){

                        Student temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                }
            }

            for(Student s : arr){
                System.out.println(s.marks + " " + s.name);
            }
        }
    }

