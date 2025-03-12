package sec09.exam02;

public class PersonEx {
    public static void main(String[] args) {
        Person p1 = new Person("999999", "홍길동");

        System.out.println(p1.nation);
        System.out.println(p1.ssn);
        System.out.println(p1.name);

        // p1.nation = "USA"; 변경 불가
        p1.name = "임꺽정"; // final이 아니기 떄문에 변경 가능

    }
}
