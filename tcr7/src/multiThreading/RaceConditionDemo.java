package multiThreading;

public class RaceConditionDemo
{
  public static void main(String args[])
  {
    Q q = new Q();
    new Producer(q);
    new Consumer(q);

    System.out.println("Press Control-C to stop.");
  }

  static class Consumer implements Runnable
  {
    Q q;

    Consumer(Q q)
    {
      this.q = q;
      new Thread(this, "Consumer").start();
    }

    public void run()
    {
      int i = 0;
      int last = -1;
      while (i < 10 && last != i)
      {
        i = q.get();
        last = i;
      }
    }
  }

  static class Producer implements Runnable
  {
    Q q;

    Producer(Q q)
    {
      this.q = q;
      new Thread(this, "Producer").start();
    }

    public void run()
    {
      int i = 0;

      while (i < 10)
      {
        q.put(i++);
      }
    }
  }

  static class Q
  {
    int n;

    synchronized int get()
    {
      System.out.println("Got: " + n);
      return n;
    }

    synchronized void put(int n)
    {
      this.n = n;
      System.out.println("Put: " + n);
    }
  }
}
