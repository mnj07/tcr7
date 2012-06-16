package exceptionHandling;

public class StackTraceDemo
{
  static void subroutine()
  {
    int d = 0;
    int a = 10 / d;
  }

  public static void main(String args[])
  {
    StackTraceDemo.subroutine();
  }
}
