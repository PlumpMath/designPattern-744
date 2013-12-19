package CommandPattern.adapterPattern2;

/**
 * Created with IntelliJ IDEA.
 * User: guemseok.ju
 * Date: 13. 12. 5
 * Time: 오후 5:17
 * To change this template use File | Settings | File Templates.
 */
public class USBToPS2Adaptor {

    PS2Plug ps2Plug = null;     //어뎁티의 인스턴스를 갖고있다

    public USBToPS2Adaptor(PS2Plug ps2Plug) {      //생성자에서 어뎁티 객체 생성 (구성활용)
        this.ps2Plug = ps2Plug;
    }

    public String getAdapterOutput(String socketOuput) {  //usb소켓 , 어뎁터 역할 수행
        //만약 같은 포트라면  그냥 리턴 시킴
        if(socketOuput.equals(ps2Plug.getInput())) {
            return socketOuput;
        }else{
            String adapterOutput = ps2Plug.getInput();
            return adapterOutput;
        }
    }
}
