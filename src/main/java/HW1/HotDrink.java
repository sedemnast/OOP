package HW1;

public class HotDrink extends Drink {
    private int temperature;

    public HotDrink(String type, int volume, int temperature) {
        super(type, volume);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %s", getType(), getVolume(), getTemperature());
    }
}
