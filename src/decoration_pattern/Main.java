package decoration_pattern;

/**
 * Created with IntelliJ IDEA.
 * User: kalkin2
 * Date: 2013. 11. 6.
 * Time: 오후 4:52
 * To change this template use File | Settings | File Templates.
 */
public class Main {

    public static void main(String[] args) {

        Pizza pizza = new CheesePizza();
        pizza = new CheeseToping(pizza);
        pizza = new BooolGogiToping(pizza);
        System.out.println(pizza.getDescription()+"가격은 : "+ pizza.cost()+" 원" );

        pizza.setSize(PizzaSize.TALL);
        //추가 요청이들어옴
        //피자에 촛불을 추가해 달라!


        System.out.println("===========================데코레이션 추가 =================================================");
        pizza = new CandleLight(pizza);
        System.out.println(pizza.getDescription()+"가격은 : "+pizza.cost()+ " 원"   );



        System.out.println("===========================기능 추가  추가 : size개념  =================================================");
        //사이즈 개념 추가
        Pizza pizza2 = new CheesePizza();
        pizza2.setSize(PizzaSize.SMALL);
        pizza2 = new BooolGogiToping(pizza2);
        System.out.println(pizza2.getDescription()+"가격은 : "+pizza2.cost()+ " 원"   );

        //사이즈 개념 추가
        Pizza pizza3 = new CheesePizza();
        pizza3.setSize(PizzaSize.LARGE);
        pizza3 = new BooolGogiToping(pizza3);
        System.out.println(pizza2.getDescription()+"가격은 : "+pizza3.cost()+ " 원"   );

        //사이즈 개념 추가
        Pizza pizza4 = new CheesePizza();
        pizza4.setSize(PizzaSize.TALL);
        pizza4 = new BooolGogiToping(pizza4);
        System.out.println(pizza2.getDescription()+"가격은 : "+pizza4.cost()+ " 원"   );
    }

}
