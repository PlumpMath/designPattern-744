package decoration_pattern;

/**
 * Created with IntelliJ IDEA.
 * User: kalkin2
 * Date: 2013. 11. 6.
 * Time: 오후 4:53
 * To change this template use File | Settings | File Templates.
 */
public abstract class Pizza {


    String description="";

    //제품명
    public String getDescription(){
        return description;
    }

    //가격구현은 이메서드를 구현하는클래스에서 결정한다.
    abstract int cost();


    //size개념 추가 getter,setter
    PizzaSize size;
    public PizzaSize getSize()
    {
        return this.size;
    }

    public void setSize(PizzaSize pizzasize)
    {
        this.size = pizzasize;
    }

}
