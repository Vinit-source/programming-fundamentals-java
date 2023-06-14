package day12;

public class StringBuilderDemo {

	public static void main(String[] args) {
    
        String firstName = "Surya";
        String lastName = "Umapathy";
        
        StringBuffer fullName = new StringBuffer();
        fullName.append(firstName).append(" ").append(lastName);
        
        System.out.println(fullName);
	}

}
