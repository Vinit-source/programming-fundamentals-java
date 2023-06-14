package day14;

public class StringBuilderDemo {

	public static void main(String[] args) {
    
        String firstName = "John";
        String lastName = "Doe";
        
        StringBuffer fullName = new StringBuffer();
        fullName.append(firstName).append(" ").append(lastName);
        
        System.out.println(fullName);
	}

}
