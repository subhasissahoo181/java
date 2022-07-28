/*ASSIGNMENT-3
Q-4 Define a class Time having data members hour, minute and second. The class
should have a parameterized constructor to initialize its data members. It should also have
methods displayTime() to display the time in HH:MM:SS format and addTime() to add
two time objects. Define a driver class and 
*/

import java.util.Scanner;

class Time {
	int Hour, Min, Sec;

	Time() {
		Hour = 0;
		Min = 0;
		Sec = 0;
	}

	Time(int hour, int min, int sec) {
		this.Hour = hour;
		this.Min = min;
		this.Sec = sec;
	}

	void display(Time t1) {
		System.out.println("Time is " + Hour + "hr." + Min + "m." + Sec + "s.");
	}

	void addTime(Time t1, Time t2) {
		Sec = t1.Sec + t2.Sec;
		if (Sec >= 60) {
			Sec = Sec - 60;
			Min = t1.Min + t2.Min + 1;
		} else {
			Min = t1.Min + t2.Min;
		}
		if (Min >= 60) {
			Min = Min - 60;
			Hour = t1.Hour + t2.Hour + 1;
		} else {
			Hour = t1.Hour + t2.Hour;
		}
		System.out.println("The sum of the two times is : " + Hour + ":" + Min + ":" + Sec);

	}
}

public class TimeDriver {
	public static void main(String args[]) {
		Scanner Sc = new Scanner(System.in);
		int hour, min, sec;
		System.out.println("Enter the First time in HH:MM:SS order.");
		hour = Sc.nextInt();
		min = Sc.nextInt();
		sec = Sc.nextInt();
		Time t1 = new Time(hour, min, sec);
		t1.display(t1);

		System.out.println("Enter the Second time in HH:MM:SS order.");
		hour = Sc.nextInt();
		min = Sc.nextInt();
		sec = Sc.nextInt();
		Time t2 = new Time(hour, min, sec);
		t2.display(t2);
		t1.addTime(t1, t2);
	}

}
