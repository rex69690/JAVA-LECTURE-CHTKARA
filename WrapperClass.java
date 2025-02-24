import java.lang.*;
public class WrapperClass {
    public static void main(String args[]) 
 {
   Float f1 = new Float(10.12f);  // boxing
   float f2 = f1.floatValue();      // unboxing
    System.out.println(f1 + "  " + f2); 
  }

}
