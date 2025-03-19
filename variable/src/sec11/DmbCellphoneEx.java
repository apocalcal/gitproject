package sec11;

public class DmbCellphoneEx {
    public static void main(String[] args) {
        DmbCellphone dmbCellphone = new DmbCellphone("자바몬", "검정", 10);
        // Cellphone으로부터 상속받은 멤버
        System.out.println("모델 : " + dmbCellphone.model);
        System.out.println("색상 = " + dmbCellphone.color);
        // DmbCellphone 필드
        System.out.println("채널 = " + dmbCellphone.channel);
        //Cellphone에게 상속받은 메소드 호출
        dmbCellphone.powerOn();
        dmbCellphone.bell();
        dmbCellphone.sendVoice("여보세요.");
        dmbCellphone.receiveVoice("안녕하세요. 저는 김태리입니다.");
        dmbCellphone.sendVoice("반갑습니다.");
        dmbCellphone.hangup();

        dmbCellphone.turnOnDmb();
        dmbCellphone.changeChannelDmb(6);
        dmbCellphone.turnOffDmb();
    }
}
