package lang;

public class EqualsDemo
{
  static class Employee
  {
    String name;
    
    Employee(String n)
    {
      name = n;
    }
  }

  static class Department
  {
    String name;
    
    Department(String n)
    {
      name = n;
    }
    
    public boolean equals(Object o)
    {
      if(o == null)
      {
        return false;
      }
      
      if(!(o instanceof Department))
      {
        return false;
      }
      
      Department that = (Department)o;
      return that.name.equals(name);
    }

    @Override
    public int hashCode()
    {
      return name.hashCode();
    }
    
    
  }
  
  public static void main(String[] args)
  {
    Employee e = new Employee("Bob");
    Department d = new Department("Accounting");

    Object key = null;
    //key = "Something";
    //key = new Employee("Bob");
    key = new Department("Accounting");
    
    System.out.println("Employee: Is Object same : " + e.equals(key));
    System.out.println("Department: Is Object same : " + d.equals(key));
  }

}
