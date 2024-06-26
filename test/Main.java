class Weather {
    int humidity;
}

class Rainy extends Weather {
    int humidity = 0;

    void changeHumidity() {
        humidity = 10;
        System.out.println(this.humidity + " = " + super.humidity);
    }
}

public class Main {
    public static void main(String[] args) {
        new Rainy().changeHumidity();
        System.out.println(new Weather().humidity);
    }
}