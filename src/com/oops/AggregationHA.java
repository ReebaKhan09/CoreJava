package com.oops;

class Student {
    String Name;

    Student(String Name) {
        this.Name = Name;
    }

    void showStudent() {
        System.out.println("Student Name: " + Name);
    }

    // Inner class
    class Department {
        Student student;

        Department(Student student) {
            this.student = student;
        }

        void showDepartment() {
            System.out.println("Department has a student:");
            student.showStudent();
        }
    }
}

public class AggregationHA {
    public static void main(String[] args) {
        Student s1 = new Student("Reeba Khan");

        // Creating inner class object
        Student.Department d1 = s1.new Department(s1);

        d1.showDepartment();
    }
}


      