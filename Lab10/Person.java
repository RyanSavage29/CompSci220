 /*********************************************************************************************************
 * Class Person is a superclass to Teacher and Student that stores a name and an address
 * Includes methods to get name, get address, set an address, and a toString to print out name and address
 *********************************************************************************************************/
 
 public class Person
 {
	 private String name, address;
	 
	 // constructor
	 public Person(String name, String address)
	 {
		this.name = name;
		this.address = address;
	 }
	 
	 // getter for name
	 public String getName()
	 {
		 return name;
	 }
	 
	 // getter for address
	 public String getAddress()
	 {
		 return address;
	 }
	 
	 // setter for adderess
	 public void setAddress(String address)
	 {
		 this.address = address;
		 return;
	 }
	 
	 // string representation of name and address
	 public String toString()
	 {
		 return name + " lives at " + address + ".";
	 }
 }