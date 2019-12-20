import java.security.SecureRandom;

//Орёл или решка
public class HeadsOrTails {
    public static void main(String[] args) {
        int heads = 0;
        int tails = 0;
        for (int i = 0; i < 1000; i++) {
            SecureRandom rand = new SecureRandom();
            int a = rand.nextInt(2);
            if (a == 0) {
                heads++;
            } else {
                tails++;
            }
        }
        System.out.println(String.format("Орел выпал %d раз, решка выпала %d раз", heads, tails));
    }
}
