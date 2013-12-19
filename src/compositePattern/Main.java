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

        //마린, 파이어팻, 메딕을 각각 컨트롤 한다. (개별로 컨트롤)
        Marine marine = new Marine();//leaf1
        marine.selectUnit();
        FireBat fireBat =new FireBat();//leaf2
        fireBat.selectUnit();
        Medic medic = new Medic();//leaf3
        medic.selectUnit();


        System.out.println("==========복합객체(composite)로 컨트롤1==============");
        ShortCut shortcut1 = new ShortCut();
        shortcut1.add(marine);
        shortcut1.add(medic);
        shortcut1.selectUnit();

        System.out.println("==========복합객체(composite)로 컨트롤2==============");

        ShortCut shortcut2 = new ShortCut();
        shortcut2.add(fireBat);
        shortcut2.add(medic);
        shortcut2.selectUnit();
    }


}
