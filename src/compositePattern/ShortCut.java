package compositePattern;

import java.util.ArrayList;
import java.util.Iterator;

/**
* Created with IntelliJ IDEA.
* User: kalkin2
* Date: 2013. 12. 19.
* Time: 오전 1:14
* To change this template use File | Settings | File Templates.
*/
class ShortCut extends Unit{
     private ArrayList<Unit> unitList = new ArrayList<Unit>();

    public void add(Unit unit){

        unitList.add(unit);

    }


    @Override
    void selectUnit() {
       Iterator<Unit> s1= unitList.iterator();
        while(s1.hasNext()){

           Unit unit =s1.next();
            unit.selectUnit();
        }
    }
}
