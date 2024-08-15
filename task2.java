import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Taking number of subjects as input
        System.out.print("Enter total number of Subjects: ");
        int NumOfSubject = input.nextInt();

        // Taking marks obtained in each subjects
        int[] marks = new int[NumOfSubject]; // list of marks, number of elements would be equal to number of subjects
        int TotalMarks = 0;

        // Storing marks values in list marks[] and calculating Totalmarks
        for (int i=0; i < NumOfSubject; i++) {
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.print("Please enter the marks for " + (i + 1) + " subject: ");
            marks[i] = input.nextInt();
            TotalMarks += marks[i];
        }

        // Calculating Average Percentage
         double AvgPercent = (double) TotalMarks/NumOfSubject;

        // simplifying Grade Category
        int GradeCategory = (int) AvgPercent/10;

        // Calculating Grades Using switch cases

        String Grade;
        switch (GradeCategory) {
            case 10: // this will be skipped and move to case 9 since grade would be same
            case 9:
                Grade = "A+";
                break;

            case 8:
                Grade = "A";
                break;

            case 7:
                Grade = "B";
                break;

            case 6:
                Grade = "C";
                break;

            case 5:
                Grade = "D";
                break;

            case 4:
                Grade = "E";
                break;

            default:
                Grade = "F"; // failed
                break;
        }

        // Display the results
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Number of Subjects: " + NumOfSubject);
        System.out.println("Number of Marks obtained: " + TotalMarks);
        System.out.println("Average Percentage: " + AvgPercent + "%");
        System.out.println("Grade : " + Grade);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

    }
}
