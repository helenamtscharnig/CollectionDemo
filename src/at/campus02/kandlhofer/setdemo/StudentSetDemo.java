package at.campus02.kandlhofer.setdemo;

import java.util.HashSet;

public class StudentSetDemo {

    public static void main(String[] args) {
        // neues Set deklarieren
        HashSet<String> students = new HashSet<>();

        // Studenten (vor und nachname) hinzufügen
        students.add("Max Mustermann");
        String susi = "Susi Sorglos";
        students.add(susi);

        System.out.println("students = " + students);

        students.add(susi);
        System.out.println("students = " + students);

        // student entfernen
        students.remove(susi);
        System.out.println("students = " + students);
    }
}
