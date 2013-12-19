package CommandPattern2;

/**
 * Created with IntelliJ IDEA.
 * User: guemseok.ju
 * Date: 13. 11. 28
 * Time: 오후 2:44
 * To change this template use File | Settings | File Templates.
 */
public class Main {


    public static void main(String[] args) {
        //command 객체 setting.


        //서태지 -> 지오디 --> ses  --> hot

      //  invoker.undo(); //
      //  invoker.undo();




        MusicApp app = new MusicApp();//1.remote
        Seotaji seotaji= new Seotaji();
        God god = new God();
        Ses ses = new Ses();

        playMusicCommand play = new playMusicCommand(seotaji);

        app.choiceMusic(play);
        app.playMusic();


        play = new playMusicCommand(god);
        app.choiceMusic(play);
        app.playMusic();

        play = new playMusicCommand(ses);
        app.choiceMusic(play);
        app.playMusic();


       // app.undo();
       // 서태지 - > ses - > hot  - > god
       // MusicApp.back(2); // undo ....     ses play중......
       //            */
    }






}
