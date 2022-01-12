package typesofrelatioship.egvehicle;

public class Car  extends Vehicle{
    private String name;
    private String color;
    private int model;
    private int power;
    private Engine engine; //composition
    private MPlayer mPlayer; //Aggregation

    void run(){
        System.out.println("Run");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public MPlayer getmPlayer() {
        return mPlayer;
    }

    public void setmPlayer(MPlayer mPlayer) {
        this.mPlayer = mPlayer;
    }
}
