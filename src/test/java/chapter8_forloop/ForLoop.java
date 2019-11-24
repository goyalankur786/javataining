package chapter8_forloop;

public class ForLoop {
    public static void main(String[] args) {
        ForLoop obj = new ForLoop();
        obj.iterateProgram();

    }

    private void iterateProgram() {

        for (int i = 0; i<5; i++)
        {
            System.out.println("QaRobo-->" + i);
        }
    }
}