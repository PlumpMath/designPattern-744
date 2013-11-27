package observer_pattern.firstStation;

/**
 * Created with IntelliJ IDEA.
 * User: guemseok.ju
 * Date: 13. 10. 31
 * Time: 오전 9:21
 * To change this template use File | Settings | File Templates.
 */
public class B_team implements Team_Master_Object{
    @Override
    public void doAction() {
        //To change body of implemented methods use File | Settings | File Templates.
        System.out.println("b팀 출동");
    }
}
