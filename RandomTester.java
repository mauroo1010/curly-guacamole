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

    public int lanzarDado() {
        return random.nextInt(6) + 1;
    }

    public String getRespuesta() {
        int a = random.nextInt(3);
        if (a == 0) {
            return("Si");
        } 
        else if(a == 1) {
            return("no");
        } 
        else{
            return("Quizás");
        }
    }
}
