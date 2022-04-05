package DataTypes;




public class truncateWithCasting{
   
   public static void main (String [] args){
   
   double dbbNum = 1456.6765443;
   
   dbbNum = dbbNum * 100;
   
   System.out.println ("This is number times 100 = " + dbbNum);
      
   int numInt = (int)dbbNum;
   
   //dont use parse here, only for strings//
   
   double finalNum = numInt;
   finalNum = finalNum/ 100;
   
   System.out.println ("Final num " + finalNum);
   











   }
} 