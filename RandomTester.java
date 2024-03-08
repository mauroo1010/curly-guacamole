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
        String respuesta = "";
        if (a == 0) {
            respuesta = "si";
        } 
        else if(a == 1) {
            respuesta = "no";
        } 
        else{
            respuesta = "quizás";
        }
        return respuesta;
    }
     public int getNumeroEntre1Y(int max) {
        return random.nextInt(max) + 1;
    }

    public int getNumeroEntre(int min, int max) {
        return random.nextInt(max + 1 -min) + min;
    }
}
