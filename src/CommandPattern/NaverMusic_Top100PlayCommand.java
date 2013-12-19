package CommandPattern;

/**
 * Created with IntelliJ IDEA.
 * User: guemseok.ju
 * Date: 13. 11. 28
 * Time: 오전 9:11
 * To change this template use File | Settings | File Templates.
 */
public class NaverMusic_Top100PlayCommand implements Command{

    NaverMusic  NaverMusic;
    public NaverMusic_Top100PlayCommand(NaverMusic naverMusic) {
        NaverMusic = naverMusic;
    }
    @Override
    public void excute() {
        NaverMusic.top100MusicPlay();
    }

}
