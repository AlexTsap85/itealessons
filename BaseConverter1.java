package lection6;

class BaseConverter1 {
    void convert(double a, String what) {
        double kelvin, celsius, fahrenheit;
        switch (what) {
            case "C":
                kelvin = a - 273.15;
                fahrenheit = ((a - 32) / 1.8);
                System.out.println(a + " градусов по Целисию равно: " + kelvin + " градусов по Кельвину "
                        + "или " + fahrenheit + " градусов по Фаренгейту");
                break;
            case "K":
                celsius = a + 273.15;
                fahrenheit = ((a + 459.67) / 1.8);
                System.out.println(a + " градусов по Кельвину равно: " + celsius + " градусов по Целисию "
                        + "или " + fahrenheit + " градусов по Фаренгейту");
                break;
            case "F":
                kelvin = a * 1.8 - 459.67;
                celsius = a * 1.8 + 32;
                System.out.println(a + " градусов по Фаренгейту равно: " + celsius + " градусов по Целисию "
                        + "или " + kelvin + " градусов по Кельвину");
                break;
        }
    }
}
class BaseConverter2{
    public static void main(String[] args) {
        BaseConverter1 conv = new BaseConverter1();
        conv.convert(100, "C");
        conv.convert(-173.14999999999998, "K");
        conv.convert(37.77777777777778,"F");
    }
}