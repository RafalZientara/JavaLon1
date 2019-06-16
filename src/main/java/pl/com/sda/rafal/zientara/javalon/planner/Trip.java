package pl.com.sda.rafal.zientara.javalon.planner;

public class Trip {
    private final String name;
    private final float time;

    public Trip(String name, float time) {
        this.name = name;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public float getTime() {
        return time;
    }
}
