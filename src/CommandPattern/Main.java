package CommandPattern;

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
         //구현 : 뮤직앱

        //1.invoker 역할
        Phone phone = new Phone();

        //2.reciver 객체
        NaverMusic naverMusic = new NaverMusic();

        //3.커맨드 객체를 생성. 이때 리시버를 전달.
        NaverMusic_MyMusicPlayCommand mymusicPlay = new NaverMusic_MyMusicPlayCommand(naverMusic);

        //4.커맨드 객체를 인보커한테 전달
        phone.choiceApplication(mymusicPlay);
        phone.runApplication();

        //3.커맨드 객체를 생성. 이때 리시버를 전달.
        NaverMusic_Top100PlayCommand top100Play = new NaverMusic_Top100PlayCommand (naverMusic);

        //4.커맨드 객체를 인보커한테 전달
        phone.choiceApplication(top100Play);
        phone.runApplication();








    }

}
