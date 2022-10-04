public class Car {
    int cadence;
    int speed;
    int gear;

    void changeCadence(int cadence) {
        this.cadence = cadence;
    }

    void speedUp(int speed) {
        this.speed = speed;
    }

    void changeGear(int gear) {
        this.gear = gear;
    }

    void printInfo() {
        System.out.println("Car");
        System.out.println("Candence : " + this.cadence);
        System.out.println("Speed    : " + this.speed);
        System.out.println("Gear     : " + this.gear);
    }
}