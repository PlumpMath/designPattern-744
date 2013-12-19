package CommandPattern;

/**
* Created with IntelliJ IDEA.
* User: guemseok.ju
* Date: 13. 11. 28
* Time: 오전 9:16
* To change this template use File | Settings | File Templates.
*/
class Phone {
    Command command ;

    public void choiceApplication(Command Command) {
        command = Command;

    }

    public void runApplication() {
        command.excute();

    }
}
