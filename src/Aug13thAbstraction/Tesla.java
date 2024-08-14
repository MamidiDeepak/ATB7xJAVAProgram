package Aug13thAbstraction;

public class car extends engine{

    @Override
    void start() {
        System.out.println("Car getting started");
    }

    @Override
    void stop() {
        System.out.println("Car getting stopped");
    }

    @Override
    void gearsSwitch() {
        System.out.println("Car has gears to switch");
    }

    @Override
    void keys() {
        System.out.println("Car keys to start");
    }
}
