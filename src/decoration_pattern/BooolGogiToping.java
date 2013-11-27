package decoration_pattern;

/**
* Created with IntelliJ IDEA.
* User: kalkin2
* Date: 2013. 11. 6.
* Time: 오후 6:20
* 불고기 토핑 클래스 , decorator
*/
class BooolGogiToping extends Decorator {

    Pizza pizza;
    //생성자
    public BooolGogiToping(Pizza pizza) {
      this. pizza = pizza;
    }

    //Decorator 추상클래스  구현
    public String getDescription(){
        return pizza.getDescription()+"불고기토핑";
    }


    //고객 요청으로  사이즈 개념 추가
    @Override
    public PizzaSize getSize() {
        return pizza.getSize();
    }
    //고객 요청으로  사이즈 개념 추가
    @Override
    int cost() {
        int cost =pizza.cost();
        if(getSize()==PizzaSize.SMALL){
            return pizza.cost()+1000;  //To change body of implemented methods use File | Settings | File Templates
        }else if(getSize()==PizzaSize.LARGE){
            return pizza.cost()+2000;  //To change body of implemented methods use File | Settings | File Templates
        } else if(getSize()==PizzaSize.TALL){
            return pizza.cost()+4000;  //To change body of implemented methods use File | Settings | File Templates
        }

        return cost ;

    }



}
