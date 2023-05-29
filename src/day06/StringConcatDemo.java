package day06;

public class StringConcatDemo {

        public static void main(String[] args) {

                // input
                String firstName = "John";
                String lastName = "Doe";

                // business logic
                String fullName1 = firstName + " " + lastName;
                String fullName2 = firstName.concat(" ").concat(lastName); // using concat method

                // output
                System.out.println(fullName1);

                System.out.println(fullName2);
        }

}
