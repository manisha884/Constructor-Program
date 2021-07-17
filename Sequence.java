/*6. Create a class to print an integer and a character using two functions having the 
same name but different sequence of the integer and the character parameters.
For example, if the parameters of the first function are of the form (int n, char c), 
then that of the second function will be of the form (char c, int n).
*/

class Sequence{
      void printData(int n , char c){
          System.out.println("Integer : "+n+" Character : "+c );
      }
      void printData(char c , int n){
          System.out.println("Character : "+c+" Integer : "+n);
      }
    public static void main(String []args){
           Sequence sq = new Sequence();
           sq.printData(10,'M');
           sq.printData('N',20);
   }

} 