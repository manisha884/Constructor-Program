/*9. Create a class 'Degree' having a function 'getDegree' that prints "I got a degree". It has two 
subclasses namely 'Undergraduate' and 'Postgraduate' each having a function with the same name 
that prints "I am an Undergraduate" and "I am a Postgraduate" respectively. Call the function by 
creating an object of each of the three classes.
*/

class Degree{
           Degree(){
           System.out.println("I got a degree");
       }
 public static class Undergraduate extends Degree{
           void degree(){
                System.out.println("I am an Undergraduate");
           }
}
  public static class Postgraduate extends Degree{
           void degree(){
                System.out.println("I am an Postgraduate");
           }

   }
public static void main(String []args){


          Undergraduate ug = new Undergraduate();
          Postgraduate pg = new Postgraduate();
           ug.degree();
           pg.degree();          
   }
} 