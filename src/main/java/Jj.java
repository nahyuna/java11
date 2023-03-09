class Ji {
    public static void main(String[] args) {
        int age = 16; // 이 값을 바꿔가면서 실행해보세요.

//v1
        if (age <= 19 && age >= 60) {
            System.out.println("할인대상입니다.");
        } else {
            System.out.println("할인대상이 아닙니다.");
        }

//v2
        if (age > 20 || age < 60) {
            System.out.println("할인대상이 아닙니다.");
        } else {
            System.out.println("할인대상입니다.");
        }

//v3
        if (age > 20) {
            if (age < 60) {
                System.out.println("할인대상이 아닙니다.");
            }
        }
        if (age <= 19) {
            if (age <= 60) {
                System.out.println("할인대상입니다.");
            }
        }

//v4
        if (age <= 19) {
            System.out.println("할인대상입니다.");
        } else if (age >= 60) {
            System.out.println("할인대상입니다.");
        } else {
            System.out.println("할인대상이 아닙니다.");
        }
        // 구현시작

        // 출력 => 할인대상입니다. 또는 할인 대상이 아닙니다.
    }
}