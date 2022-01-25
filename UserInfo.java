package lection7;

public class UserInfo {
    private String name;
    private String password;

    public UserInfo (String name, String password){
        this.name = name;
        this.password = password;
    }
    public UserInfo() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User: " +name+ ", password " +password+ ".";
    }
    @Override
    public boolean equals(Object o){
        if (this == o){
            return true;
        }
        if (o == null || getClass() != o.getClass()){
            return false;
        }
        UserInfo userInfo = (UserInfo) o;
        return name == userInfo.name &&
                password == userInfo.password;
    }
    public static void Login(UserInfo a, UserInfo b) {
        if (a.equals(b)){
            System.out.println("имя пользователя и пароль совпадают");
        } else System.out.println("имя пользователя или пароль НЕ совпадают");
    }


    public static void main(String[] args) {
        UserInfo first = new UserInfo("First", "password1");
        UserInfo second = new UserInfo("First", "password1");
        UserInfo third = new UserInfo("Third", "password3");

        Login(first, second);
        Login(first, third);
        }
    }
