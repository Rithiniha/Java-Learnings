package getset;
import java.util.*;

class Data{
	private String name;  //private field
	//getter method
	public String getName() {
		return name;
	}
	public void setName(String name) {  //Name is not a keyword
		if(name != null && !name.isEmpty()) {
			this.name=name;
		}else {
			System.out.println("Invalid name!");
		}
	}
}

public class GetSet {
	public static void main(String[] args) {
		Data data = new Data();
		//set the name using the getter
		data.setName("");
		//get the name using the getter
		System.out.println("Student name: " +data.getName());
		
	}

}
