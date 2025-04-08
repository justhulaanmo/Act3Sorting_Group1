import java.util.Scanner;

class Student {
    String name;
    double grade;

    public Student(String name, double grade) {
        this.name = name;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return name + ": " + grade;
    }
}

public class StudentSort {

    public static void bubbleSort(Student[] students) {

        for (int i = 0; i < students.length - 1; i++) {

            for (int j = 0; j < students.length - i - 1; j++) {
                
                if (students[j].grade > students[j + 1].grade) {
                    
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        scanner.nextLine(); 
        
        Student[] students = new Student[numStudents];
        
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter name of student " + (i + 1) + ": ");
            String name = scanner.nextLine();
            System.out.print("Enter grade of student " + (i + 1) + ": ");
            double grade = scanner.nextDouble();
            scanner.nextLine(); 
            
            students[i] = new Student(name, grade);
        }
        
        bubbleSort(students);
        
        System.out.println("Sorted list of students by grade:");
        for (Student student : students) {
            System.out.println(student);
        }

        scanner.close();
    }
}
