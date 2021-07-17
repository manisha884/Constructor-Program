/*5. Create a class named 'PrintNumber' to print various numbers of different datatypes by creating 
different functions with the same name 'printn' having a parameter for each datatype.
*/

class PrintNumber{
         void printn(int a){
              System.out.println(a);
         }
         void printn(float a){
              System.out.println(a);
         }
         void printn(double a){
              System.out.println(a);
         }
         void printn(char a){
              System.out.println(a);
         }
    public static void main(String []argd){
             PrintNumber pn = new PrintNumber();
             pn.printn(12);
             pn.printn('M');
             pn.printn(3.14f);
             pn.printn(201.20);
   }
} 