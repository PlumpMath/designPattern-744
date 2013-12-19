package CommandPattern.adapterPattern;

/**
 * Created with IntelliJ IDEA.
 * User: guemseok.ju
 * Date: 13. 12. 2
 * Time: 오전 10:16
 * To change this template use File | Settings | File Templates.
 */
public class Main {

    public static void main(String[] args) {
        RectangularPlug plug = new RectangularPlug();  //사각형 플러그

        String msg = plug.getPower();//전원연결
        System.out.println("msg==="+msg);

    }
}
