package decoration_pattern;

/**
* Created with IntelliJ IDEA.
* User: kalkin2
* Date: 2013. 11. 6.
* Time: 오후 5:50
* 일반적인 상속의  개념을 이용하여 Pizza 추상 클래스를 구현해준다.
*/
class CheesePizza extends Pizza {

    String desc ="치즈피자";
    int cost = 10000;

    public CheesePizza() {
        //To change body of created methods use File | Settings | File Templates.
        description = desc;
    }

    public int cost() {
            return  cost;
    }

}
