public class Helloworld {
    public static class Car {
        Car() {
            this.name = "Avante";
            this.speed = 100.0f;
        }

        Car(int speed) {
            this.name = "Sonata";
            this.speed = speed;
        }

        Car(String name, int speed) {
            this.name = name;
            this.speed = speed;
        }

        String name;
        String color;
        int year;
        float speed;
        int price;

        void print() {
            System.out.println("name: " + name + ",color:" + color + ", year: " + year + ", speed: " + speed + ", price" + price);
        }
    }

    public static void main(String[] args) {
        Car myCar_00 = new Car();
        Car myCar_01 = new Car(100);
        Car myCar_02 = new Car("Grandeur", 110);
        myCar_00.print();
        myCar_01.print();
        myCar_02.print();
    }
}
