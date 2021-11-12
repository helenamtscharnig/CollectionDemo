package at.campus02.kandlhofer.setdemo;

import java.util.HashSet;

public class StudentSetDemo {

    public static void main(String[] args) {
        // neues Set deklarieren
        HashSet<String> students = new HashSet<>();

        // Studenten (vor und nachname) hinzufügen
        students.add("Max Mustermann");

        // Übergabe der Variable susi an das Set
        String susi = "Susi Sorglos";
        students.add(susi);

        System.out.println("students = " + students);

        students.add(susi);
        System.out.println("students = " + students);

        // student entfernen
        students.remove(susi);
        System.out.println("students = " + students);

        // student enthalten
        boolean isSusiInSet = students.contains(susi);
        boolean isMaxInSet = students.contains("Max Mustermann"); // STRG + ALT + V -> variable erzeugen lassen
        System.out.println("isSusiInSet = " + isSusiInSet);
        System.out.println("isMaxInSet = " + isMaxInSet);

        // susi nochmals hinzufügen
        students.add(susi);

        // Jeden Studenten im Set ausgeben
        for (String student : students) { // für jeden Studenten in students
            System.out.println("student = " + student);
        }


    }
}
