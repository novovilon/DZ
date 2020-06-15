package firstTask;


import firstTask.Methods.MethodIncreasesDecreases;


public class Main {
    public static void main(String[] args) {
        int min = 0;
        int max = 10;

        int a = min + (int) (Math.random() * max);
        int b = min + (int) (Math.random() * max);



        System.out.printf ("Даны два целых числа: %nA = %d B = %d%n", a, b);

        MethodIncreasesDecreases method = new MethodIncreasesDecreases();

        if (a < b) {
            System.out.println ("возрастания");
            method.increases(a, b);
        }
        if (a > b){
            System.out.println ("убывания");
            method.Decreases (a, b);
        }
        if (a == b){
            System.out.println ("упс");
        }
    }
}
