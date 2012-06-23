package lang.generics;

public class NonGenDemo
{
  public static void main(String[] args)
  {
    NonGen iOb;   
    
    // Create NonGen Object and store 
    // an Integer in it. Autoboxing still occurs. 
    iOb = new NonGen(88);  
  
    // Show the type of data used by iOb. 
    iOb.showType(); 
 
    // Get the value of iOb. 
    // This time, a cast is necessary. 
    int v = (Integer) iOb.getob();  
    System.out.println("value: " + v);  
  
    System.out.println();  
  
    // Create another NonGen object and  
    // store a String in it. 
    NonGen strOb = new NonGen("Non-Generics Test");  
  
    // Show the type of data used by strOb. 
    strOb.showType(); 
 
    // Get the value of strOb. 
    // Again, notice that a cast is necessary.  
    String str = (String) strOb.getob();  
    System.out.println("value: " + str);  
 
    // This compiles, but is conceptually wrong! 
    iOb = strOb; 
    v = (Integer) iOb.getob(); // run-time error! 
  }
}
