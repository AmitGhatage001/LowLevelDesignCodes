package sample;

public class forLoop {
    public static void main(String[] args) {
        // note - you can initialize different variables in for loop at same time
        for (int i = 0, j = 0; i < 10; i++) {
            System.out.println(i + " " + j++);
        }
    }
}
