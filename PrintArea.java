/*7. Create a class to print the area of a square and a rectangle. The class has two functions with the 
same name but different number of parameters. The function for printing the area of rectangle has two 
parameters which are its length and breadth respectively while the other function for printing the area 
of square has one parameter which is the side of the square.
*/


class PrintArea{
         int length , breadth , side;
         void area(int l,int b){
               length = l;
               breadth = b;
               System.out.println("Area of Rectangle is : "+length*breadth);
         }
          void area(int s){
               side = s;
               System.out.println("Area of Square is : "+side*side);
         }
     public static void main(String []args){
              PrintArea pa = new PrintArea();
              pa.area(10,10);
              pa.area(20);
   }
}