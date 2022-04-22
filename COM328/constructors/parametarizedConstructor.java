import java.io.*;

class Student {
    String Name;
    int ID;

    // constructor
    Student(String Name, int ID){
        this.Name = Name;
        this.ID = ID;
    }
}

class StudentDetails {
    public static void main(String[] argd){
        Student student1 = new Student("Gift", 37855942);
        System.out.println("Student Name: "+student1.Name+
                            " Student ID: "+student1.ID);
    }
}
