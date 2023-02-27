package org.example;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        Logger logger=Logger.getLogger("com.api.jar");
        logger.log(Level.INFO, () ->"Enter the student name :");
        Scanner in =new Scanner(System.in);
        String name=in.next();
        logger.log(Level.INFO, () ->"Enter students grade :");
        char grade=in.next().charAt(0);
        logger.log(Level.INFO, () ->"Enter your previous gpa");
        float gpa=in.nextFloat();
        Student ob=new Student(name,grade,gpa);
        logger.log(Level.INFO, () ->"Enter your current Grade :");
        String cgrade=in.next();
        logger.log(Level.INFO, () ->ob.msg(name, ob.ugpa(cgrade)));
    }
}