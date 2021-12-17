package algs4_practices.models;

import static java.lang.System.out;

public class Person
{
    public Person() { }

    public Person(final String name) {
      this.Name = name;
    }

    public String Name;

    public void talk(final String[] args)
    {
        out.println("My name is " + this.Name);
        System.out.println("Hello world");
    }
}
