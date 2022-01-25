package lection4;

import java.util.Arrays;

public class Group {
    private Student [] students = new Student[10];
    public Group(){
        super();
    }
    public void addStudent(Student student){
        for (int i = 0;; i++){
            try{
                if (i > students.length){
                    throw new MyException();
                }
                if (students[i] == null){
                    addSt(student, i);
                    break;
                }
            } catch (MyException e){
                break;
            }
        }
    }

    private void addSt (Student student, int i) throws MyException{
        students[i] = student;
    }
    public void delStudent(Student student){
        for (int i = 0; i < students.length; i++){
            try{
                if ((this.students[i].getLastNameName()).equals(student.getLastNameName())){
                    students[i] = null;
                    break;
                }
            } catch (NullPointerException e){
                continue;
            }
        }
    }
    public Student search (String lastName){
        for (int i = 0; i < students.length; i++){
            try{
                if ((this.students[i].getLastNameName()).equals(lastName)){
                    return this.students[i];
                }
            } catch (NullPointerException e) {
                continue;
            }
        }
        return null;
    }
    public Student[] getStudents(){
        return students;
    }
    public void setStudents(Student[] students){
        this.students = students;
    }
    @Override
    public String toString(){
        return "Group " +Arrays.toString(students) + ".";
    }
}
