package observer_pattern.firstStation;

public class Main {
    public static void main(String[] args) {

        Fire_Check_Subject subject = new Fire_Check_Subject();
        B_team bTeam = new B_team();
        subject.addObserver(bTeam);
        subject.addObserver(new A_team());

        System.out.println("\n=================== 알림   : 화재 발생!!!! 각팀은 출동준비해주세요====================");
        subject.notifyToObserver();

        //옵저버 삭제
        System.out.println("\n=================== 요청 : B팀은 이제  옵저버에서 해지 시켜주세요====================");
        subject.removeObserver(bTeam);
        //화재발생
        System.out.println("\n=================== 알림   : 화재 발생!!!! 각팀은 출동준비해주세요====================");
        subject.notifyToObserver();

    }
}