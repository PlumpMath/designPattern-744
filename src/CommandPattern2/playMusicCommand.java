package CommandPattern2;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: guemseok.ju
 * Date: 13. 11. 28
 * Time: 오후 2:54
 * To change this template use File | Settings | File Templates.
 */
public class playMusicCommand implements Command {

    Play play;
    //ArrayList <Command>playList = new ArrayList<Command>();


    public  playMusicCommand(Play play){
        System.out.println(play.desc()+"앨범이 선택 되었습니다.");
        this.play = play;
    }

    @Override
    public void excute() {
        play.playMusic();

    }



}
