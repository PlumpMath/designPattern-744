package compositePattern;

/**
 * Created with IntelliJ IDEA.
 * User: kalkin2
 * Date: 2013. 12. 19.
 * Time: 오전 12:11
 * 컴포지트 패턴을 설명하기 위해 스타크래프트의 유닛객체와(개별객체) 단축키로 그룹지정(복합객체)으로 설명한다
 */
public class Main {


    public static void main(String[] args) {

        Marine marine = new Marine();//leaf1
        marine.selectUnit();
        FireBat fireBat =new FireBat();//leaf2
        Medic medic = new Medic();//leaf3


        System.out.println("================================");
        ShortCut shortcut1 = new ShortCut();
        shortcut1.add(marine);
        shortcut1.add(fireBat);
        shortcut1.selectUnit();

        System.out.println("================================");

        ShortCut shortcut2 = new ShortCut();
        shortcut2.add(fireBat);
        shortcut2.add(marine);
        shortcut2.selectUnit();
    }


}
