package at.campus02.kandlhofer.listdemo;

import java.util.ArrayList;

public class StudentListDemo {

    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        students.add("Mustermann");
        students.add(new String("Musterfrau"));

        String studentMax = "Mustermax";
        students.add(studentMax);
        printStudents(students);

        //remove Mustermax
        //students.remove("Mustermax");
        students.remove(studentMax);
        printStudents(students);

        // Enthält die Liste unseren Mustermann?
        String newStudent = "Mustermann";
        boolean inList = isInList(students, newStudent);
        System.out.println("inList = " + inList);
        boolean compareToStudent = isInList2(students, newStudent);
        System.out.println("compareToStudent = " + compareToStudent);
        boolean containsStudent = students.contains(newStudent);
        System.out.println("containsStudent = " + containsStudent);

        students.add(0, "BinErster");
        printStudents(students);
    }

    public static boolean isInList(ArrayList<String> studentList, String student) {
        for (String studentInList : studentList) {
            if (studentInList.equals(student)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isInList2(ArrayList<String> studentList, String student) {
        for (int i = 0; i < studentList.size(); i++) {
            String stud = studentList.get(i);
            if (student.compareTo(stud) == 0) {
                return true;
            }
        }
        return false;
    }

    public static void printStudents(ArrayList<String> studentList) {
        for (String student : studentList) {
            System.out.println("student = " + student);
        }
        System.out.println("-----");
    }

}
