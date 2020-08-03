package CodeVitaPrep;

import java.util.Scanner;

class Car {
    private int x;
    private int y;
    private int speed;
    private int time;

    public Car(int x, int y, int speed) {
        this.x = x;
        this.y = y;
        this.speed = speed;
        this.time =  (int) MathUtility.distanceBWPointFromOrigin(x,y)/speed;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Car{" +
                "x=" + x +
                ", y=" + y +
                ", speed=" + speed +
                ", distanceFromOrigin=" + time +
                '}';
    }

}

public class CollisionCourse {

    public static int numberOfCollision(Car[] c) {
        int count = 0;
        for(int i=0;i<c.length;i++){
            for (int j = i+1; j < c.length; j++) {
                if(c[i].getTime() == c[j].getTime()) count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Car[] c = new Car[n];
        System.out.println(n);
        for (int i = 0; i < n; i++) {
            c[i] = new Car(sc.nextInt(),sc.nextInt(),sc.nextInt());
        }
        System.out.println(numberOfCollision(c));
    }
}
