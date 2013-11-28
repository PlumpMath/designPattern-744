package CommandPattern;

/**
* Created with IntelliJ IDEA.
* User: guemseok.ju
* Date: 13. 11. 28
* Time: 오전 9:17
* Desc : invoker class
*/
class NaverMusic {

    public void myMusicList(){
        System.out.print("나의 리스트 재생\n");
    };
    public void top100MusicPlay(){
        System.out.print("상위 100 리스트  재생...\n");
    };
    public void radioPlay(){
        System.out.print("라디오 재생 ...\n");
    };
}
