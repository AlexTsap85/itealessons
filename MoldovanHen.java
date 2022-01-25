package lection5;

public class MoldovanHen extends Hen {

    @Override
    public int getCountOfEggsPerMonth() {
        return 20;
    }
    public String getDescription(){
        return super.getDescription() + " Моя страна - "+ Country.MOLDOVA+". Я несу "+getCountOfEggsPerMonth() +" яиц в месяц.";
    }
}
