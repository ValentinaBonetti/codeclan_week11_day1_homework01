public class WaterBottle {

//  Create a water bottle class with a volume property.

    private double volume;
    private double initial_volume = 100.0;

    //    The volume should start at 100.
    public WaterBottle(){
        this.volume = initial_volume;
    }


    public double getVolume(){
        return this.volume;
    }

    //    Add a drink function that takes 10 from the volume each time it is called.
    public void drink(){
        this.volume -= 10.0;
    }

    //    Create an empty function that brings the volume down to 0.
    public void empty(){
        this.volume = 0.0;
    }

    //    Create a fill function that fills the volume back to 100.
    public void fill(){
        this.volume = initial_volume;
    }


}
