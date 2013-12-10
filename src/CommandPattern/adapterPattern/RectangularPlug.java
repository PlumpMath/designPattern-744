package CommandPattern.adapterPattern;

/**
* Created with IntelliJ IDEA.
* User: guemseok.ju
* Date: 13. 12. 2
* Time: 오전 10:18
* To change this template use File | Settings | File Templates.
*/
public class RectangularPlug {
    private String rectaStem1;
    private String rectaStem2;
    public String getPower() {
        RectangularAdapter adapter = new RectangularAdapter();
        String power = adapter.adapt(rectaStem1, rectaStem2);
         return power;
    }



}
