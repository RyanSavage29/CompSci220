/********************************************************************************************************************
* Class Dog that stores an age and a name
* Includes methods to get name and age, set name and age, a toString, and to calculate the dog's age in person years
********************************************************************************************************************/

public class Dog
{
    private String name;
    private int age;
	private int person;

    //implement the following constructor
    public Dog(String a, int b)
	{
		this.name = a;
		this.age = b;
    }

    //implement the following getter
    public String getName()
	{
		return name;
    }

    //implement the following getter
    public int getAge()
	{
		return age;
    }

    //implement the following setter
    public void setName(String newName)
	{
		name = newName;
		return;
    }

    //implement the following setter
    public void setAge(int newAge)
	{
		age = newAge;
		return;
    }
	
	// method to return the age of the dog in person years
	public int personYears()
	{
		person = age * 7;
		return person;
	}
	
	// returns a string statement containing the name, age, and number of person years for an object
	public String toString()
	{
		personYears();
		return name + " is " + age + " years old. " + name + " is " + person + " in person years.";
	}
}