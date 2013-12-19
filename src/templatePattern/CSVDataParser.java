package templatePattern;

/**
 * Created with IntelliJ IDEA.
 * User: kalkin2
 * Date: 2013. 12. 10.
 * Time: 오후 9:38
 * To change this template use File | Settings | File Templates.
 */
public class CSVDataParser extends BasicParser{
    @Override
    protected void readData() {
        System.out.println("csv 파일로 부터 데이터를 읽습니다......");
    }

    @Override
   protected void processData() {
        System.out.println("csv파일을 가공합니다....");
    }
}
