package firstTask.Methods;

public class MethodIncreasesDecreases {

    public void increases(int a, int b) {
        if (a == b )
            return;
        System.out.print (" " + a);

        increases(a + 1, b);

    }

    public void Decreases(int a, int b) {
        if (a == b )
            return;
        System.out.print (" " + a);
        Decreases(a - 1, b);
    }

}
