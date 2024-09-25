class Car{
    String name;
    String color;
    int year;
    float speed;
    int price;
}

//public static class Car{
//    Car(int speed){
//        this.name = "Avante";
//        this.speed = speed;
//    }
//    String name;
//    String color;
//    int year;
//    float speed;
//    int price;
//}

public class Main {
    public static void main(String[] args) {
        Car car_00 = new Car();
        car_00.name = "Avante";
        car_00.speed =0;
        System.out.println(car_00);
    }
}
