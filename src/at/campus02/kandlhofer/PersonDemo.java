package at.campus02.kandlhofer;

public class PersonDemo {

    public static void main(String[] args) {
        Person person1 = new Person("Max", "Mustermann");
        Person person2 = new Person("Max", "Mustermann");
        System.out.println("1 = " + 1);
        System.out.println("person2 = " + person2);

        boolean isEquals = person1.equals(person2);
        System.out.println("isEquals = " + isEquals);
    }
}
