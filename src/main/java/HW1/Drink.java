package HW1;

public abstract class Drink {
    private String type;
    private int volume;

    public Drink(String type, int volume) {
        this.type = type;
        this.volume = volume;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
