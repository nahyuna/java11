class class4 {
    public static void main(String[] args) {

        캐릭터 person = new 캐릭터();
        person.name = "hyun";
        person.age = 28;
        person.height = 158;
        person.자기소개();

        캐릭터 person2 = new 캐릭터();
        person2.name = "nana";
        person2.age = 32;
        person2.height = 160;
        person2.자기소개();
    }
}

class 캐릭터 {
    int age;
    int height;
    String name;

    void 자기소개() {
        System.out.println("hi. 저는 " + this.name + " 입니다. 그리고 제 나이는 "+ this.age+"이고, 저의 키는 " + this.height+ "입니다.");

    }
}