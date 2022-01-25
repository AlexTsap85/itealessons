package lection4;

public class MainMethod {
    public static void main(String[] args) {
        Student[] student = new Student[10];
        student[0] = new Student(10, "Aleksey0", "Petrenko0", "Math", 10.0, 2019);
        student[1] = new Student(10, "Aleksey1", "Petrenko1", "Math", 10.0, 2019);
        student[2] = new Student(10, "Aleksey2", "Petrenko2", "Math", 10.0, 2019);
        student[3] = new Student(10, "Aleksey3", "Petrenko3", "Math", 10.0, 2019);
        student[4] = new Student(10, "Aleksey4", "Petrenko4", "Math", 10.0, 2019);
        student[5] = new Student(10, "Aleksey5", "Petrenko5", "Math", 10.0, 2019);
        student[6] = new Student(10, "Aleksey6", "Petrenko6", "Math", 10.0, 2019);
        student[7] = new Student(10, "Aleksey7", "Petrenko7", "Math", 10.0, 2019);
        student[8] = new Student(10, "Aleksey8", "Petrenko8", "Math", 10.0, 2019);
        student[9] = new Student(10, "Aleksey9", "Petrenko9", "Math", 10.0, 2019);

        Group groupA = new Group();
        groupA.addStudent(student[0]);
        groupA.addStudent(student[1]);
        groupA.addStudent(student[2]);
        groupA.addStudent(student[3]);
        groupA.addStudent(student[4]);
        groupA.addStudent(student[5]);
        groupA.addStudent(student[6]);
        groupA.addStudent(student[7]);
        groupA.addStudent(student[8]);
        groupA.addStudent(student[9]);

        groupA.delStudent(student[2]);

        groupA.addStudent(student[8]);

        System.out.println(groupA.toString());
        System.out.println();

        System.out.println("Search student: " +groupA.search("Petrenko9"));

    }
}
