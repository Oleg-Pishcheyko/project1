import cars.Car;

public class newClass {
    public static void main(String[] args) {

        Car car1 = new Car();
        Car car2 = new Car();

        car1.setColor("red");
        car1.setMarka("ford");
        car1.setSpeed(45);
       // car1.HOT_HJ = 25;

        car2.setColor("black");
        car2.setMarka("opell");
        car2.setSpeed(56);
       // car2.HOT_HJ = 27;

        System.out.println(car2.retur());
        System.out.println(Car.HOT_HJ);

        System.out.println(car1.toString());
        System.out.println(car2);


    }
}
