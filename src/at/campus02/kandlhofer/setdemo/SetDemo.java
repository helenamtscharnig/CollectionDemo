package at.campus02.kandlhofer.setdemo;

import at.campus02.kandlhofer.Person;

import java.util.HashSet;

public class SetDemo {

    public static void main(String[] args) {
        HashSet<Integer> mySet = new HashSet<>();
        mySet.add(1);
        mySet.add(2);
        mySet.add(1);

        for (Integer number : mySet) {
            System.out.println("number = " + number);
        }

        HashSet<Person> personsSet = new HashSet<>();
        Person person1 = new Person("Max", "Mustermann");
        Person person2 = new Person("Max", "Mustermann");
        personsSet.add(person1);
        personsSet.add(person2);

        for (Person person : personsSet) {
            System.out.println("person = " + person.getLastName());
        }
    }
}
