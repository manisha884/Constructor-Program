/*Write a program to print the names of students by creating a Student class. 
If no name is passed while creating an object of the Student class, then the name should be "Unknown", 
otherwise the name should be equal to the String value passed while creating the object of the Student class.*/

class Student{
       String name;
       Student(){
            System.out.println("Unknown"); 
       }
       Student(String s){
            name = s;
            System.out.println(name);
       } 
    public static void main(String []args){
            Student sn1 = new Student();
            Student sn2 = new Student("Manoj");

   }
} 