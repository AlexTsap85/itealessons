package lection4;

public class Human {
    private String firstName;
    private String lastName;
    private int age;
    private int height;
    private int weight;

    public Human(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Human(String firstName, String lastName, int age, int height, int weight){
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }
    public Human(){
        super();
    }
    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(){
        this.firstName = firstName;
    }
    public String getLastNameName(){

        return lastName;
    }
    public void setLastName(){

        this.lastName = lastName;
    }
    public int getAge(){
        return age;
    }
    public void setAge(){
        this.age = age;
    }
    public int getHeight(){
        return height;
    }
    public void setHeight(){
        this.height = height;
    }
    public int getWeight(){
        return weight;
    }
    public void setWeight(){
        this.weight = weight;
    }

    @Override
    public String toString(){
        return "Human [First name: " +firstName+ ", Last name: " +lastName+
                ", Age: " +age+ ", Height: " +height+ "Weight: " +weight+"].";
    }
}
