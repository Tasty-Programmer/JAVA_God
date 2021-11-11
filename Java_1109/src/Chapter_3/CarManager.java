package Chapter_3;

public class CarManager {
    public static void main(String[] args) {
        // 이곳에 코드 입력


        Car dogCar = new Car();
        dogCar.speedUP();
        dogCar.speedUP();

        System.out.println(dogCar.getCurrentspeed());
        dogCar.breakDown();
        System.out.println(dogCar.getCurrentspeed());


        Car cowCar = new Car();
        cowCar.speedUP();
    }
}
