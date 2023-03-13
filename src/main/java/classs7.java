class classs7 {
    public static void main(String[] args) {
        duck p1 = new duck();
        p1.fly();
        duck 청둥오리 = new duck();
        청둥오리.fly();
        duck 고무오리 = new duck();
        고무오리.fly();
        duck 흰고무오리 = new duck();
        흰고무오리.fly();

    }
}

class duck {
    void fly() {
        System.out.println("오리 푸드덕 날다");
    }

    void 울음소리() {
        System.out.println("꽥꽥 울어요");
    }
}

class 청둥오리 extends duck {
    void fly() {
        System.out.println("청둥오리는 날 수 있나?");
    }
}

class 고무오리 extends duck {
    void fly() {
        System.out.println("고무오리는 날 수 없다. ");
    }
}

class 흰고무오리 extends 고무오리 {
    void fly() {
        System.out.println("저는 날 수 없어요 ㅠㅠ");
    }
}
