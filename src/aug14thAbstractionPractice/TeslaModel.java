package aug14thAbstractionPractice;

public class TeslaModel extends  Engine{


    @Override
   public void Start() {
        System.out.println("starts automatically when doors closed");
    }

    @Override
    public void Stop() {
        System.out.println("stops automatically when doors closed");
    }

    @Override
    protected void gearsInCar() {
        System.out.println("Tesla has auto gear System");
    }

    @Override
    public void keys() {
        System.out.println("Tesla does not required keys");
    }
}
