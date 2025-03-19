package sec11_2.exam01.exam02;

public class SmartPhone extends Phone{
    public SmartPhone(String owner) {
        super(owner);
    }

    public void internetSearch() {
        System.out.println("인터넷 검색을 시작합니다.");
    }
}
