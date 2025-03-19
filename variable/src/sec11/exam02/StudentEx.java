package sec11.exam02;

public class StudentEx {
    public static void main(String[] args) {
        Student student = new Student("홍길동", "123456-1234567", 1);
        System.out.println("student.name = " + student.name);
        System.out.println("student.ssn = " + student.ssn);
        System.out.println("student.studentNo = " + student.studentNo);

    }
}
