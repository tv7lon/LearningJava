package DataTypes;


public class RandomMathFunc{
   
   public static void main (String [] args){
      
      System.out.println ("Generate a secret code");
      System.out.println ("Your code will be 5 letters");
      
      for ( int i = 1; i <= 5; i++)
            {
            
            // between 65 to 90
            int num = (int)(Math.random() *26 + 65);
            System.out.print (" "+ (char) num);
         
            }
    }

}
      
     
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
