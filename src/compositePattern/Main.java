package compositePattern;

/**
 * Created with IntelliJ IDEA.
 * User: kalkin2
 * Date: 2013. 12. 19.
 * Time: 오전 12:11
 * To change this template use File | Settings | File Templates.
 */
public class Main {


    public static void main(String[] args) {

        Marine marine = new Marine();//leaf1
        marine.selectUnit();
        FireBat fireBat =new FireBat();//leaf2
        // Medic medic = new Medic();//leaf3


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
