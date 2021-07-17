/*8. Create a class 'Student' with three data members which are name, age and address. 
The constructor of the class assigns default values to name as "unknown", age as '0' 
and address as "not available". It has two functions with the same name 'setInfo'. 
First function has two parameters for name and age and assigns the same whereas the 
second function takes has three parameters which are assigned to name, age and address
 respectively. Print the name, age and address of 10 students.
Hint - Use array of objects
*/

import java.util.*;
class Student1{
             String name; String address;
             int age,roll;
              /*Student1(){
              System.out.print("Name : Unkonwn  ");  
              System.out.print("Age : 0  ");
              System.out.println("Address : Not available");
             }*/
             void setInfo(String name,int age){

              System.out.println("Name : "+name+"      Age : "+age);
             }
             void setInfo(String name,int age,String address){

              System.out.println("Name : "+name+"    Age : "+age+" Address : "+address);
             } 
             void setData(){
                          Scanner sc = new Scanner(System.in);
                          System.out.print("Enter name of Student : ");
                          name = sc.nextLine();
                          System.out.print("Enter Address of Student : ");
                          address = sc.nextLine();
                          System.out.print("Enter age of Student : ");
                          age = sc.nextInt();

             }
             void printData(){
                          System.out.println("Name : "+name+"    Age : "+age+" Address : "+address);
             }
  public static void main(String []args){
             Student1  [] stud = new Student1[10];

             //Student1 s = new Student1();
             for(int i=0;i<stud.length;i++){
                 stud[i] = new Student1();
              }
             for(int i=0;i<stud.length;i++){
                  stud[i].setData(); 
             }
             //stud[0].setInfo("Tom",20);
             //stud[1].setInfo("Jerry",21,"USA"); 
             for(int i=0;i<stud.length;i++){
                  stud[i].printData();         
             }
}


} 