package lang.generics;

public class TwoGenDemo
{
  public static void main(String[] args)
  {
    TwoGen<Integer, String> tgObj = new TwoGen<Integer, String>(88, "Generics");

    // Show the types.
    tgObj.showTypes();

    // Obtain and show values.
    int v = tgObj.getob1();
    System.out.println("value: " + v);

    String str = tgObj.getob2();
    System.out.println("value: " + str);
  }
}
