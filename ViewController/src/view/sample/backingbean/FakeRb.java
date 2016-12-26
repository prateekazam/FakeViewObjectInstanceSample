package view.sample.backingbean;

public class FakeRb {
    public FakeRb() {
        super();
        System.err.println("creating instance of fake backing bean!");
    }
    
    public void helloFake() {
        System.err.println("-------------------------------");
        System.err.println("Fake method has been called ");
        System.err.println("-------------------------------");
    }
}
