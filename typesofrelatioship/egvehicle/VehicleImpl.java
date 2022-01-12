package typesofrelatioship.egvehicle;

public class VehicleImpl {
    public static void main(String[] args) {
        Car car =new Car();
        car.setColor("White");
        car.setModel(45);
        car.setName("Volvo");
        car.setPower(125);
        car.setSpeed(200);
        car.setMileage(18);
        Engine engine =new Engine();
        engine.setPower(244);
        car.setEngine(engine);
        MPlayer mPlayer = new MPlayer();
        mPlayer.setName("VLC");
        mPlayer.setVolume(10);
        car.setmPlayer(mPlayer);
    }
}
