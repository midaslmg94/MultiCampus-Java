package inheritance.student;

public class StudentExample {
    public static void main(String[] args) {
        Student s = new Student("홍길동","123-567",7777);
        System.out.println("이름"+s.getName());
        System.out.println("주민번호"+s.getSsn());
        System.out.println("학번"+s.studentNo);
    }
}
