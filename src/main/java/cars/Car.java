package cars;

import static java.lang.Math.*;

public class Car {
    private int speed;
    private String color;
    private String marka;
    public static int HOT_HJ=2;

    double x = PI;
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }
    public static double retur(){
        return HOT_HJ*Const.PI;
    }

    @Override
    public String toString() {
        return "Car{" +
                "speed=" + speed +
                ", color='" + color + '\'' +
                ", marka='" + marka + '\'' +
                ", HOT_HJ='" + HOT_HJ + '\'' +
                '}';
    }
}
