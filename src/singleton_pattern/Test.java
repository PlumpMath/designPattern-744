package singleton_pattern;

/**
 * Created with IntelliJ IDEA.
 * User: guemseok.ju
 * Date: 13. 11. 21
 * Time: 오후 5:59
 * To change this template use File | Settings | File Templates.
 */
public class Test {

    public static void main(String[] args) {
        Test t = new Test();
        t.Amethod();
        t.Bmethod();
    }
    public void Amethod(){
        SingletonCounter sc = SingletonCounter.getInstance();
        System.out.println("Amethod에서 카운터 호출 " + sc.getNextInt() );
    }
    public void Bmethod(){
        SingletonCounter sc = SingletonCounter.getInstance();
        System.out.println("Bmethod에서 카운터 호출 " + sc.getNextInt() );
    }
}
