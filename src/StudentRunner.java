import java.util.Scanner;
public class StudentRunner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String firstName;
        String lastName;
        int gradeYear;
        int input = 0;

        System.out.print("Enter student first name: ");
        firstName = scan.nextLine();
        System.out.print("Enter student last name: ");
        lastName= scan.nextLine();
        System.out.print("Enter student grade year: ");
        gradeYear = scan.nextInt();
        scan.nextLine();
        Student student1 = new Student(firstName, lastName, gradeYear);

        while (input != 6) {
            System.out.println("------Main Menu------");
            System.out.println("1. Update graduation year");
            System.out.println("2. Add test score");
            System.out.println("3. View test average");
            System.out.println("4. View highest test score");
            System.out.println("5. View all student info");
            System.out.println("6. Exit");
            System.out.print("Enter selection: ");
            input = scan.nextInt();
            scan.nextLine();
            if (input == 1) {
                System.out.print("Enter new graduation year: ");
                student1.setGradYear(scan.nextInt());
                scan.nextLine();
            }
            if (input == 2) {
                System.out.print("Enter test score: ");
                student1.addTestScore(scan.nextDouble());
                scan.nextLine();
            }
            if (input == 3) {
                System.out.println("The student's test average is " + student1.averageTestScore());
            }
            if (input == 4) {
                System.out.println("The student's highest test score is " + student1.getHighestTestScore());
            }
            if (input == 5) {
                System.out.println("ALL STUDENT INFO");
                student1.printStudentInfo();
            }
            if ((input <= 0) || (input >= 7)) {
                System.out.println("Invalid input! Try again!");
            }
        }
        System.out.println("Have a nice day!");
        scan.close();
    }
}

