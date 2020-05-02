package algs4Practices.Models;

public class Person
{
    public Person() { }

    public Person(final String name) {
      this.Name = name;
    }

    public String Name;

    public void talk(final String[] args)
    {
        System.out.println("My name is " + this.Name);
        System.out.println("Hello world");
    }
}
