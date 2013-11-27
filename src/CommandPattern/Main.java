package CommandPattern;

import java.rmi.Remote;

/**
 * Created with IntelliJ IDEA.
 * User: kalkin2
 * Date: 2013. 11. 26.
 * Time: 오후 9:40
 * To change this template use File | Settings | File Templates.
 */
public class Main {


    public static void main(String[] args) {

         //커맨트 패턴
         //구현 : 스마트폰


        Phone phone = new Phone();


        //앱
        NaverMusic naverMusic = new NaverMusic();
        DaumMap daumMap = new DaumMap();

        //command객체
        NaverMusic_MyMusicPlayCommand mymusicPlay = new NaverMusic_MyMusicPlayCommand(naverMusic);
        //NaverMusic_Top100PlayCommand top100Play = new NaverMusic_MyMusicPlayCommand(naverMusic);

        phone.choiceApplication(mymusicPlay);
        phone.runApplication();

        //NaverMusic_Top100PlayCommand top100Play = new NaverMusic_Top100PlayCommand (naverMusic);
       // phone.choiceApplication(top100Play);



    }


    private static class Phone {
        Command command ;

        public void choiceApplication(Command Command) {
            command = Command;

        }

        public void runApplication() {
            command.excute();

        }
    }

    private static class NaverMusic {

        public void MyMusicPlay(){
            System.out.print("나의 리스트 재생");
        };
        public void top100MusicPlay(){
            System.out.print("상위 100 리스트  재생...");
        };
        public void radioPlay(){

            System.out.print("라디오 재생 ...");
        };

    }

    private static class DaumMap {
    }

    private static class NaverMusic_MyMusicPlayCommand implements Command{

        NaverMusic  NaverMusic;
        public NaverMusic_MyMusicPlayCommand(NaverMusic naverMusic) {
            NaverMusic = naverMusic;

        }

        @Override
        public void excute() {
            NaverMusic.MyMusicPlay();
        }
    }
}
