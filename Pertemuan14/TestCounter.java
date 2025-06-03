package Pertemuan14;

public class TestCounter {
     public static void main(String[] args) {
        new Counter();
        new Counter();
        new Counter();

        System.out.println("Total Counter objects: " + Counter.getInstanceCount());
    }
}
