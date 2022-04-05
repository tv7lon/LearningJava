package Gogga;
import it.*;
//class heading 
public class DhiyaStarterJava{


 public static void main (String [] args){
   Gogga bug = new Gogga ();
   bug.setPosition(1,5);
  
  //D
   bug.setDirection(Gogga.UP);
   bug.move();
   bug.move();
   
   bug.setDirection(Gogga.RIGHT);
   bug.move();
   bug.move();
   
   bug.setDirection(Gogga.DOWN);
   bug.move();
   bug.move();
   
   bug.setDirection(Gogga.LEFT);
   bug.move();
   bug.move();
 
 
   bug.setPosition(3,1);
   bug.setDirection(Gogga.DOWN);
   bug.move();
   bug.move();
   
   
   //H
   bug.setPosition(4,1);
   bug.move();
   bug.move();
   bug.move();
   bug.move();

   bug.setPosition(4,3);
   bug.setDirection(Gogga.RIGHT);
   bug.move();
   bug.move();
   
   bug.setDirection(Gogga.DOWN);
   bug.move();
   bug.move();
   
   
   //I
   bug.setPosition(7,3);
   bug.move();
   bug.move();
   
   
   bug.setPosition(7,1);
   bug.move();
   
   //Y
   bug.setPosition(8,3); 
   bug.move();
   bug.move();     
   bug.setDirection(Gogga.RIGHT);   
   bug.move();
   bug.move();   
   bug.setDirection(Gogga.UP);
   bug.move();
   bug.move();      
   
   bug.setPosition(10,5); 
   bug.setDirection(Gogga.DOWN);
   bug.move();
   bug.move();  
   bug.setDirection(Gogga.LEFT);
   bug.move();
   bug.move();  
   
   //A
   bug.setPosition(11,3); 
      bug.setDirection(Gogga.DOWN);
   bug.move();
   bug.move();  
      bug.setDirection(Gogga.RIGHT);
   bug.move();
   bug.move();  
      bug.setDirection(Gogga.UP);
   bug.move();
   bug.move();  
      bug.setDirection(Gogga.LEFT);
   bug.move();
   bug.move();  
     
    bug.setPosition(13,5);  
    bug.setDirection(Gogga.RIGHT);
    bug.move();
    bug.setDirection(Gogga.UP);
    bug.move();
    

  
  
  }
 }