package lection5;

public class PolishHen extends Hen {

    @Override
    public int getCountOfEggsPerMonth() {
        return 25;
    }
    public String getDescription(){
        return super.getDescription() + " Моя страна - "+ Country.POLAND+". Я несу "+getCountOfEggsPerMonth() +" яиц в месяц.";
    }
}