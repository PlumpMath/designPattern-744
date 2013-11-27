package decoration_pattern;

/**
* Created with IntelliJ IDEA.
* User: kalkin2
* Date: 2013. 11. 6.
* Time: 오후 10:43
* 촛불 클래스  , decorator 클래스 상속
*/
public class CandleLight extends Decorator {

    Pizza pizza;

    public CandleLight(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription()+"촛불";  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public int cost() {
        return pizza.cost()+999;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
