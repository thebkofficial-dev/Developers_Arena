package Grade_management_project;
//package Developers_arena;

import java.util.Scanner;

public class Grade_management {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Number of students: ");
        int students = sc.nextInt();
        System.out.print("Number of subjects: ");
        int subjects = sc.nextInt();

        int[] totalMarks = new int[students];

        for (int i = 0; i < students; i++) {
            int sum = 0;
            System.out.println("Enter marks for student " + (i + 1));
            for (int j = 0; j < subjects; j++) {
                sum += sc.nextInt();
            }
            totalMarks[i] = sum;
        }

        for (int i = 0; i < students; i++) {
            double avg = (double) totalMarks[i] / subjects;
            char grade;
            if (avg >= 90) grade = 'A';
            else if (avg >= 80) grade = 'B';
            else if (avg >= 70) grade = 'C';
            else if (avg >= 60) grade = 'D';
            else grade = 'F';

            System.out.println("Student " + (i + 1) + ": Average = " + avg + ", Grade = " + grade);
        }

        sc.close();
    }
}
