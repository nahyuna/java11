class class6 {
    public static void main(String[] args) {
        blackcat ablackcat = new blackcat();
        ablackcat.숨쉬다();
        blackcat bblackcat = new blackcat();
        ablackcat.높이뛰다();

    }
}


    class cat {
        void 숨쉬다() {
            System.out.println("숨쉬다");
        }

        void 달리다() {
            System.out.println("달리다");
        }

        void 높이뛰다() {
            System.out.println("높이뛰다");
        }
    }

    class blackcat extends cat {
        void 검은털() {
            System.out.println("검은털");
        }
    }

    class whitecat extends cat {
        void 흰색털() {
            System.out.println("흰색털");
        }
    }
