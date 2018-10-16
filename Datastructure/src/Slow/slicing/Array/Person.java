package Slow.slicing.Array;

public class Person {
    private String lastName;
    private String firstName;
    private int age;

    public Person(String lastName, String firstName, int age) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
    }

    public String getLastName() {
        return lastName;
    }

    public void display(){
        System.out.println("LastName : "+lastName);
        System.out.println("FirstName : "+firstName);
        System.out.println("Age : "+age);
    }
}
