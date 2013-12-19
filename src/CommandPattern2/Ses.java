package CommandPattern2;

/**
 * Created with IntelliJ IDEA.
 * User: guemseok.ju
 * Date: 13. 11. 28
 * Time: 오후 3:51
 * To change this template use File | Settings | File Templates.
 */
public class Ses implements Play {

    String desc = "SES" ;

    public String desc(){
        return desc;
    }

    public void playMusic() {
        System.out.println(desc+"플레이중..........");
    }


    public void stopMusic() {
        System.out.println(desc+ "플레이 중단...........");
    }
}
