/*2.Create a class named 'Rectangle' with two data members- length and breadth and a function to
calculate the area which is 'length*breadth'. The class has three constructors which are :
1 - having no parameter - values of both length and breadth are assigned zero.
2 - having two numbers as parameters - the two numbers are assigned as length and breadth respectively.
3 - having one number as parameter - both length and breadth are assigned that number.
Now, create objects of the 'Rectangle' class having none, one and two parameters and print their areas.
*/
class Rectangle{
        double length , breadth;
        public void rectArea(){
         System.out.println("Area is : "+length * breadth);
        }
         Rectangle(){
          length = 0;
          breadth = 0;
        }
         Rectangle(double a,double b){
          length = a;
          breadth = b;
        }
         Rectangle(double a){
          length = a;
          breadth = a;
        }
   public static void main(String []args){
          Rectangle re1 = new Rectangle();
          re1.rectArea();
          Rectangle re2 = new Rectangle(10,10);
          re2.rectArea();
          Rectangle re3 = new Rectangle(20);
          re3.rectArea();
       }
} 