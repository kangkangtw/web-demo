package guava;


public class LabelTest {

    public static void main(String[] args) {
        System.out.println("break");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 10; j++) {
                if (j == 5) {
                    break;
                }
                System.out.println(i + ":" + j);
            }
            System.out.println("outer");
        }
        System.out.println("continue");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 10; j++) {
                if (j == 5) {
                    continue;
                }
                System.out.println(i + ":" + j);
            }
            System.out.println("outer");
        }
        System.out.println("breakLabel");
        breakLabel:
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 10; j++) {
                if (j == 5) {
                    break breakLabel;
                }
                System.out.println(i + ":" + j);
            }
            System.out.println("outer");
        }
        System.out.println("continueLabel");
        continueLabel:
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 10; j++) {
                if (j == 5) {
                    continue continueLabel;
                }
                System.out.println(i + ":" + j);
            }
            System.out.println("outer");
        }
    }

}
