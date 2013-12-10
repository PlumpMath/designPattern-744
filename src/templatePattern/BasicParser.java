package templatePattern;

/**
* Created with IntelliJ IDEA.
* User: kalkin2
* Date: 2013. 12. 10.
* Time: 오후 9:40
* To change this template use File | Settings | File Templates.
*/
abstract class BasicParser {

    //템플릿 메소드
    //이 메소드는 파싱하기 위한 일반적은 알고리즘을 제공하한다.
    public void parseDataAndGenerateOutput()
    {
        readData();
        processData();
        writeToExcelData();
    }
    //This methods will be implemented by its subclass
    //아래 메소드는 자유롭게 구현할수 있도록 추상메소드를 사용.
    abstract void readData();
    abstract void processData();

    //모든 서브 클래스에서는 출력은 csv로 한다.
    public void writeToExcelData()
    {
        System.out.println("엑셀 파일이 생성 되었습니다.");
    }

 }
