import java.util.Scanner;

public class findInArr {
    public static void main(String[] args) {
        String[] student = {"Christian","Michael","Camila","Siana","Tanya","Connor","Zachariah","Mallory", "Zoe", "Emily"};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter name's student: ");
        String input_name = scanner.nextLine();

        boolean isExit = false;
        for (int i = 0; i < student.length; i++) {
            if (student[i].equals(input_name)){
                System.out.println("Position of "+input_name+ " is " +(i+1));
                isExit = true;
            }
        }
        if (!isExit) {
            System.out.println("No find "+input_name+ " in arr student");
        }
    }
}
