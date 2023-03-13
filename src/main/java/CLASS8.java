class CLASS8 {
    public static void main(String[] args) {
        duck 청둥오리 = new duck();
        청둥오리.fly();
        고무오리 흰고무오리 = new 고무오리();
        흰고무오리.fly();
    }
}

class duck {
    void fly() {
        System.out.println("푸드득 날아가요");
    }
    void 울음소리(){
        System.out.println("꽥꽥울어요ㅠ");
    }
}

class 청둥오리 extends duck {
    void 특징() {
        System.out.println("청둥오리의 특징");
    }
}

class 고무오리 extends duck {
    void fly() {
        System.out.println("고무오리는 날 수 없어요 ㅠ");
    }
}

class 흰고무오리 extends 고무오리 {
    void 특징() {
        System.out.println("고무오리의 특징");
    }
}