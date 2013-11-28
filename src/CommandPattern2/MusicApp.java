package CommandPattern2;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: guemseok.ju
 * Date: 13. 11. 28
 * Time: 오후 3:02
 * To change this template use File | Settings | File Templates.
 */
public class MusicApp {
    Command slot;


    public void choiceMusic(Command command) {
        this.slot = command;
    }

    public void playMusic(){
        slot.excute();
    }

}
