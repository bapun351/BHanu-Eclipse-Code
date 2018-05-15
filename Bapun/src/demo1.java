import java.util.Date;

abstract class watch {
	void showDate() {
		Date d = new Date();
		System.out.println("Date is " + d);
	}

	abstract void showWeather();
}

class rolex extends watch {
	void showWeather() {
		System.out.println("weather is rainy");
	}
}

class smartwatch extends watch {
	void showWeather() {
		System.out.println("weather is foggy");
	}
}

class fastrack extends watch {
	void showWeather() {
		System.out.println("weather is sunny");
	}
}

class Display {
	void show(watch w) {
		w.showDate();
		w.showWeather();
	}
}

public class demo1 {
	public static void main(String[] args) {
		Display d = new Display();
		d.show(new rolex());
		d.show(new fastrack());
		d.show(new smartwatch());
	}
}