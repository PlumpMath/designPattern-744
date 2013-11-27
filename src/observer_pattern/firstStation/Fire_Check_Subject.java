package observer_pattern.firstStation;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: guemseok.ju
 * Date: 13. 10. 31
 * Time: 오전 9:19
 * To change this template use File | Settings | File Templates.
 */
public class Fire_Check_Subject extends Fire_Station_Subject{

    //옵저버 객체 생성
    java.util.List<Team_Master_Object> observers = new ArrayList<Team_Master_Object>();

    public void addObserver(Team_Master_Object observer) {
        observers.add(observer);
        System.out.println("새로운 팀이 추가  되었습니다. (옵저버 갯수 =" +observers.size()+")");
    }


    public void removeObserver(Team_Master_Object observer) {
        observers.remove(observer);
        System.out.println(observer+"가 팀에서 삭제 되었습니다.  (옵저버 갯수 ="+observers.size()+")");
    }

    public void notifyToObserver() {
        System.out.println("각 팀들에게 화재가 발생했다고 알림() : (옵저버의 doAction호출)");
        for(Team_Master_Object ob: observers){
            ob.doAction();
        }
    }


}
