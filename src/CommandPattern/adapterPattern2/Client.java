package CommandPattern.adapterPattern2;

/**
 * Created with IntelliJ IDEA.
 * User: guemseok.ju
 * Date: 13. 12. 5
 * Time: 오후 3:40
 * 클라이언트 객체
 */
public class Client {
    public static void main(String[] args) {

        //USB마우스소켓을 PS2소켓으로 변경
        PS2Plug ps2Plug = new PS2Plug();//어뎁티
        USBToPS2Adaptor adaptor = new USBToPS2Adaptor(ps2Plug);//어뎁터에 어뎁티 셋팅
        USBSocket socket = new USBSocket();//USB마우스소켓

        String adaptorOutput = adaptor.getAdapterOutput(socket.getOutput());//어뎁터에 USB객체를 넣어준다

        if(adaptorOutput.equals(ps2Plug.getInput())) {   //USB포트와 어뎁터의 출력이 같으면 변환 되었다고 출력함
            System.out.println("Sucessfull transformation of USB to PS2");
        }
    }

}
