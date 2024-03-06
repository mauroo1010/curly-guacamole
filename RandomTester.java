import java.util.Random;
public class RandomTester {
    private Random random;

    public RandomTester() {
        random = new Random();
    }

    public void printOneRandom() {
        System.out.println(random.nextInt());
    }

    public void printMultiRandom(int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(random.nextInt());
        }
    }
}
