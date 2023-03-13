public class class5 {
    public static void main(String[] args) {
        person p1 = new person();
        p1.age = 28;
        p1.자기소개();
        p1.average = 28;
        person p2 = new person();
        p2.age = 32;
        p2.average += 32;
        p2.자기소개();
        person p3 = new person();
        p3.age = 50;
        p3.average += 50;
        p3.자기소개();

        person.인류평균나이소개();
    }
}

class person {
    int age;
    static int average;

    void 자기소개() {
        System.out.println("나이는 " + this.age + " 살 입니다.");
    }

    static void 인류평균나이소개() {
        System.out.println("인류평균나이는 " + average/3 + " 살 입니다.");
    }
}
