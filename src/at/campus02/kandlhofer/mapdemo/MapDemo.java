package at.campus02.kandlhofer.mapdemo;

import java.util.HashMap; // in der Main HashMap() schreiben und Tab, dann wird das hier oben automatisch reingeschrieben.
import java.util.Map;
import java.util.Set; //dasselbe hier wie oben, nur dass ich unten Set reingeschrieben habe

public class MapDemo {

    public static void main(String[] args) {
        HashMap<String, Integer> gradeOfStudents = new HashMap<>(        );
        gradeOfStudents.put("Mustermann", 1);
        gradeOfStudents.put("Musterfrau", 3);
        System.out.println("gradeofstudents" + gradeOfStudents);

        gradeOfStudents.put("Mustermann", 2);
        System.out.println("gradeofstudents" + gradeOfStudents);

        Set<String> students = gradeOfStudents.keySet();
        for (String student : students){
            Integer grade = gradeOfStudents.get(student);
            System.out.println("Student " + student + " hat die Note" + grade );
        }

        //Gib mir die Note von Mustermann
        Integer gradeofMustermann = gradeOfStudents.get("Mustermann");
        System.out.println("gradeOfMustermann = " + gradeofMustermann);

        //2. Möglichkeit Schlüssel und Werte zu bekommen
        Set<Map.Entry<String, Integer>> entries = gradeOfStudents.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {              // iter + tab ist der Shortcut für For-Schleifen
            System.out.println("Student " + entry.getKey() + " hat die Note " + entry.getValue());
        }
    }




}
