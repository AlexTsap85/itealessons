package lection4;

public class Student extends Human {
    private int id;
    private String faculty;
    private double rating;
    private int yearEntrance;

    public Student(int id, String firstName, String lastName, String faculty, double rating, int yearEntrance) {
        super(firstName, lastName);
        this.id = id;
        this.faculty = faculty;
        this.rating = rating;
        this.yearEntrance = yearEntrance;
    }

    public Student(){
        super();
    }

    public int getId() {
        return id;
    }

    public void setId() {
        this.id = id;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty() {
        this.faculty = faculty;
    }

    public double getRating() {
        return rating;
    }

    public void setRating() {
        this.rating = rating;
    }

    public int getYearEntrance() {
        return yearEntrance;
    }

    public void setYearEntrance(){
        this.yearEntrance = yearEntrance;
    }

    @Override
    public String toString() {
        return "\n Student " + getFirstName()+ " " +getLastNameName()+ ", rating - " +rating+ ".";
    }
}