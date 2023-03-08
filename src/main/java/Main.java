public class Main {
    public static void main(String[] args) {
        int age = 20;
        System.out.println("당신의 나이 : " + age);

        if (age <= 20 && age <= 34) {
            System.out.println("청년");
        } else if (age <= 18) {
            System.out.println("미성년자");
        }
    }
}
