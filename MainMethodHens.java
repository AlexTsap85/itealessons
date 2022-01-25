package lection5;

public class MainMethodHens {
    public static void main(String[] args){
        Hen hen = HenFactory.getHen("Украина");
        Hen hen1 = HenFactory.getHen("Польша");
        Hen hen2 = HenFactory.getHen("Молдова");
        Hen hen3 = HenFactory.getHen("Беларусь");
        System.out.println(hen.getDescription() +"\n"+ hen1.getDescription()
                +"\n"+ hen2.getDescription() +"\n"+ hen3.getDescription());
    }
    public class HenFactory{
        static Hen getHen(String country) {
            Hen hen = null;
            if (country.equals(Country.UKRAINE)) {
                hen = new UkrainianHen();
            }
            if (country.equals(Country.POLAND)) {
                hen = new PolishHen();
            }
            if (country.equals(Country.MOLDOVA)) {
                hen =new MoldovanHen();
            }
            if (country.equals(Country.BELARUS)) {
                hen = new BelarusianHen();
            }return hen;
        }

    }
}
