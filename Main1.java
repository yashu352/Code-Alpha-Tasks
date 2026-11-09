import java.util.Scanner;
class Student
{
    String name;
    int rollNo;
    double marks;
    Student(String name, int rollNo, double marks)
    {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }
    void display()
    {
        System.out.printf("%-15s %-10d %.2f%n", name, rollNo, marks);
    }
}
public class Main1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();
        Student[] students = new Student[n];
        double total = 0;
        double highest = Double.NEGATIVE_INFINITY;
        double lowest = Double.POSITIVE_INFINITY;
        for (int i = 0; i < n; i++)
        {
            System.out.println("\nStudent " + (i + 1));
            System.out.print("Enter name: ");
            String name = sc.nextLine();
            System.out.print("Enter roll number: ");
            int roll = sc.nextInt();
            System.out.print("Enter marks: ");
            double marks = sc.nextDouble();
            sc.nextLine();
            students[i] = new Student(name, roll, marks);
            total += marks;
            if (marks > highest)
                highest = marks;
            if (marks < lowest)
                lowest = marks;
        }
        System.out.println("\n===== STUDENT GRADE REPORT =====");
        System.out.printf("%-15s %-10s %s%n",
                          "Name", "Roll No", "Marks");
        for (Student s : students)
        {
            s.display();
        }
        System.out.printf("\nAverage Marks: %.2f%n", total / n);
        System.out.printf("Highest Marks: %.2f%n", highest);
        System.out.printf("Lowest Marks: %.2f%n", lowest);
        sc.close();
    }
}
