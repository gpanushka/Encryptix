import java.util.*;

public class gradeCalci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int english, maths, physics, chemistry, biology;
        String grade = "F";
        System.out.println("Enter your marks in English:");
        english = sc.nextInt();
        System.out.println("Enter your marks in Maths:");
        maths = sc.nextInt();
        System.out.println("Enter your marks in Physics:");
        physics = sc.nextInt();
        System.out.println("Enter your marks in Chemistry:");
        chemistry = sc.nextInt();
        System.out.println("Enter your marks in Biology:");
        biology = sc.nextInt();

        int totalMarks = english + maths + physics + chemistry + biology;

        double average = (english + maths + physics + chemistry + biology) / 5;


            if(average >= 90) {
                grade = "O";
            }
            else if(average < 90 && average >= 80) {
                grade = "A";
            }
            else if(average < 80 && average >= 70) {
                grade = "B";
            }
            else if(average < 70 && average >= 60) {
                grade = "C";
            }
            else if(average < 60 && average >= 40) {
                grade = "D";
            }
            
            

        System.out.println("\n\nYour marksheet:");
        System.out.println("\nEnglish = " + english + "\nMaths = " + maths + "\nPhysics = " + physics + "\nChemistry = " + chemistry + "\nBiology = " + biology);
        System.out.println("Total Marks : " + totalMarks);
        System.out.println("Average Percentage : " + average);
        System.out.println("Grade : " + grade);

        sc.close();
    }
}
