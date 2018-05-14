public class WaterBottle {

    private int vol;
    private int drinkVolume;

    public WaterBottle( int vol, int drinkVolume){
        this.vol = vol;
        this.drinkVolume = drinkVolume;
    }

    public int drink() {
        return this.vol - this.drinkVolume;
    }

    public int empty() {
        return this.vol - 100;
    }

    public int fill() {
        return this.vol = 100;
    }
}