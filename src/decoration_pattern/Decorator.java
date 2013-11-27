package decoration_pattern;

/**
 * Created with IntelliJ IDEA.
 * User: kalkin2
 * Date: 2013. 11. 6.
 * Time: 오후 5:53
 * 상속의  개념을 이용하여 추상메서드로 바꾸어준다. 이 메서드를 상속받는 데코레이터는 getDescription()을 구현해줘야한다
 */
public abstract  class Decorator extends Pizza {

    public abstract  String getDescription();
}
