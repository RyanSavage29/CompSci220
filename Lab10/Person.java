 /*
 * Class Person 
 */
 
 public class Person
 {
	 private String name, address;
	 
	 public Person(String name, String address)
	 {
		this.name = name;
		this.address = address;
	 }
	 
	 public String getName()
	 {
		 return name;
	 }
	 
	 public String getAddress()
	 {
		 return address;
	 }
	 
	 public void setAddress(String address)
	 {
		 this.address = address;
		 return;
	 }
	 
	 public String toString()
	 {
		 return name + " lives at " + address + ".";
	 }
 }