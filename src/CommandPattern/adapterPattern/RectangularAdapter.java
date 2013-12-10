package CommandPattern.adapterPattern;

/**
* Created with IntelliJ IDEA.
* User: guemseok.ju
* Date: 13. 12. 2
* Time: 오전 10:17
 * adapter calss  : RectangularAdapter has   CylindricalSocket  : di 사용(의존성 주입)
*/
public class RectangularAdapter extends CylindricalSocket {
    private CylindricalSocket socket; //어뎁티(둥근 소켓을 파람으로 받는다)

    public String adapt(String rectaStem1, String rectaStem2) {
        //some conversion logic
        socket = new CylindricalSocket();
        String cylinStem1 = rectaStem1; //사각형 =>원형 입력
        String cylinStem2 = rectaStem2; //사각형 =>원형 입력
        return socket.supply(cylinStem1, cylinStem2);  //소켓에서 받는 타입을 파람으로 던져줌
    }
}
