package singleton_pattern;

/**
 코드가 가장 짧고 쉽습니다. 성능도 다른 방법에 비해 좋습니다.
 */
public class Singleton1 {

        private static Singleton1 single = new Singleton1();//클래스 로드시 new가 실행이 된다(항상 1개의 인스턴스를 가지게 됨)

        public static Singleton1 getInstance(){
            return single;
        }
        private Singleton1(){
        }


}
