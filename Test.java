class InnerSample {
    static void sample() {
        System.out.println("hello");
    }

}

public class Test {
    public static void main(String[] args) {
        Sample sample = new Sample();
        System.out.println("start");
        sample.testing("charan");
        InnerSample.sample();

    }
}
