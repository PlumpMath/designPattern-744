package decoration_pattern;

/**
* Created with IntelliJ IDEA.
* User: kalkin2
* Date: 2013. 11. 6.
* Time: 오후 6:19
* 치즈 토핑   , decorator
*/

class CheeseToping extends Decorator {

    Pizza pizza;

    public CheeseToping(Pizza pizza) {
        this.pizza = pizza;
    }

    public String getDescription(){
        return pizza.getDescription()+"+치즈토핑";
    }

    public int cost(){
        return pizza.cost()+500;
    }

}
