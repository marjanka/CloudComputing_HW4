import acm.program.*;

public class Hanoin extends ConsoleProgram {
public void run() {
	while (true) {
		int h = readInt("Введіть кількість дисків:");
		int n = readInt("Введіть номер голки:");
		if (n == 1)
			return;
		if (n == 2)
		tow(h, 1, 2, 3);	
		if (n == 3)
		tow(h, 1, 3, 2);
	}
	}

public static void tow(int h, int a, int b, int c) {
if (h == 0)
return;
if (h > 0) {
tow(h - 1, a, c, b);
System.out.println("перемістити диск " + h + " з голки " + a
+ " на голку " + b);
tow(h - 1, c, b, a);
}
}

}


