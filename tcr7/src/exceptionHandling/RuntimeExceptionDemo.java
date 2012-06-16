package exceptionHandling;

import java.io.IOException;

public class RuntimeExceptionDemo
{
  //Will throw an exception
  static int calculatePrice() throws RuntimeException
  {
    int d = 0;
    int a = 42 / d;
    return a;
  }

  static void readFile() throws IOException
  {
    throw new IOException();
  }
  
  public static void main(String args[])
  {
    System.out.println("Starting ...");
    
    System.out.println("Price : " + calculatePrice());
    
    try
    {
      readFile();
    }
    catch (IOException e)
    {
      e.printStackTrace();
    }
    
    System.out.println("Exiting ...");
  }
}
