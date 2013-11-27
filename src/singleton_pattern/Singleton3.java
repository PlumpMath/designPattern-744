package singleton_pattern;

/**
 바깥쪽 if(single == null) 가 없다면, 성능 저하가 발생합니다.
 매번 synchronized 블럭 안으로 들어가니까요.
 두번째 방법과 같다고 보시면 됩니다.
 안쪽의 if(single == null) 가 없다면, singleton이 보장되지 않습니다.
 */
public class Singleton3 {
    private volatile static Singleton3 single;
    public static Singleton3 getInstance(){
        if (single == null) {
            synchronized(Singleton3.class) {
                if (single == null) {
                    single = new Singleton3();
                }
            }
        }
        return single;
    }
    private Singleton3(){
    }
}
