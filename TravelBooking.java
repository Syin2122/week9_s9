  import java.util.Scanner;

abstract class Travel {
double distance;
static final double BOOKING_FEE = 50;

```
Travel(double distance) {
    this.distance = distance;
}

abstract double calculateFare();

double getTotal() {
    return calculateFare() + BOOKING_FEE;
}
```

}

class Bus extends Travel {
Bus(double distance) {
super(distance);
}

```
double calculateFare() {
    return distance * 2;
}
```

}

class Train extends Travel {
Train(double distance) {
super(distance);
}

```
double calculateFare() {
    return distance * 1.5;
}
```

}

class Flight extends Travel {
Flight(double distance) {
super(distance);
}

```
double calculateFare() {
    return 2500 + distance * 4;
}
```

}

public class TravelBooking {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
Travel[] bookings = new Travel[n];

```
    for (int i = 0; i < n; i++) {
        String mode = sc.next().toUpperCase();
        double distance = sc.nextDouble();

        switch (mode) {
            case "BUS":
                bookings[i] = new Bus(distance);
                break;
            case "TRAIN":
                bookings[i] = new Train(distance);
                break;
            case "FLIGHT":
                bookings[i] = new Flight(distance);
                break;
        }
    }

    for (Travel t : bookings) {
        System.out.printf("%s: %.2f%n",
                          t.getClass().getSimpleName().toUpperCase(),
                          t.getTotal());
    }

    sc.close();
}
```

}
