package CommandPattern;

/**
* Created with IntelliJ IDEA.
* User: guemseok.ju
* Date: 13. 11. 28
* Time: 오전 9:18
* To change this template use File | Settings | File Templates.
*/
class NaverMusic_MyMusicPlayCommand implements Command{

    NaverMusic  NaverMusic;
    Command undoCommand;

    public NaverMusic_MyMusicPlayCommand(NaverMusic naverMusic) {
        NaverMusic = naverMusic;

    }

    @Override
    public void excute() {
        NaverMusic.myMusicList();
    }





}
