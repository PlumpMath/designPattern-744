package templatePattern;

/**
 * Created with IntelliJ IDEA.
 * User: kalkin2
 * Date: 2013. 12. 10.
 * Time: 오후 9:36
 * To change this template use File | Settings | File Templates.
 */
public class Main {

    public static void main(String[] args) {

        CSVDataParser csvDataParser=new CSVDataParser();
        csvDataParser.parseDataAndGenerateOutput();

        System.out.println("--------------------------------------");
        DatabaseDataParser databaseDataParser=new DatabaseDataParser();
        databaseDataParser.parseDataAndGenerateOutput();

    }


}
