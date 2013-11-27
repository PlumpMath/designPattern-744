package singleton_pattern;

/**
 * Created with IntelliJ IDEA.
 * User: guemseok.ju
 * Date: 13. 11. 21
 * Time: 오후 5:59
 * To change this template use File | Settings | File Templates.
 */
public class SingletonCounter {
    private static SingletonCounter singleton = new SingletonCounter();
    private int cnt = 0;
    private SingletonCounter(){
    }
    public static SingletonCounter getInstance(){
        return singleton;
    }
    public int getNextInt(){
        return ++cnt;
    }
}
