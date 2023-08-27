package Problem_18;

public class DieSimulator {

    public static void main(String[] args) {
        Die d = new Die(9);
        Die e = new Die(6);

        final int TRIES = 10;
        System.out.println("Die 1 :");
        for (int i = 1 ; i <= TRIES ; i++){
            int n = d.cast();
            System.out.println(n + " ");
        }
        System.out.println();
        for (int i = 1 ; i <= TRIES ; i++){
            int n = e.cast();
            System.out.println(n + " ");
        }
        System.out.println();
    }
}
