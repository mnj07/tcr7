package lang.generics;

public interface MinMaxInterface<T extends Comparable<T>>
{
  T min(); 
  T max(); 
}
