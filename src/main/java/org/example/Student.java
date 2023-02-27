package org.example;

class Student {
    String name;
    char grade;
    float gpa;

    Student(String name, char grade, float gpa) {
        this.name = name;
        this.grade = grade;
        this.gpa = gpa;
    }

    float ugpa(String ugrade) {
        if (ugrade.equals("A+")) return 4.3F;
        if (ugrade.equals("A-")) return 3.7F;
        if (ugrade.equals("A")) return 4.0F;
        if (ugrade.equals("B+")) return 3.3F;
        if (ugrade.equals("B-")) return 2.7F;
        if (ugrade.equals("B")) return 3.0F;
        if (ugrade.equals("C+")) return 2.3F;
        if (ugrade.equals("C-")) return 1.7F;
        if (ugrade.equals("C")) return 2.0F;
        if (ugrade.equals("D+")) return 1.3F;
        if (ugrade.equals("D-")) return 0.7F;
        if (ugrade.equals("D")) return 1.0F;
        return 0;
    }

    String msg(String name, float x) {
        return (name + " has a" + x + " gpa");
    }
}
