package Day9;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class StudentA extends Marks {
    private String subject1;
    private String subject2;
    private String subject3;

    public StudentA(String subject1, String subject2, String subject3) {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
    }

    // utility method to add all String[] into one ArrayList
    public ArrayList<String[]> addValuesToArrayList(){
        ArrayList<String[]> totalValues = new ArrayList<>();
        String[] subject1Values = subject1.split(" ");
        totalValues.add(subject1Values);
        String[] subject2Values = subject2.split(" ");
        totalValues.add(subject2Values);
        String[] subject3Values = subject3.split(" ");
        totalValues.add(subject3Values);
        return totalValues;
    }

    // Get values of all three subjects & percentage to print
    @Override
    public void getPercentage() {
        ArrayList<String[]> totalValues = addValuesToArrayList();
        for (String[] subjectArr : totalValues) {
            System.out.println("Subject: " + subjectArr[0] +
                    ", Percentage: " + subjectArr[1] + "%");
        }
    }

    public static void main(String[] args) {
        // Enter subjects name follow by class score
        // Ex "Science 90"
        StudentA A = new StudentA("Science 90", "Math 93", "English 87");
        A.getPercentage();
    }
}
