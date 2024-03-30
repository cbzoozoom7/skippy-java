import java.util.*;
import java.io.*;
public class Skippy {
	public static void main(String[] args) throws IOException {
		Scanner myScanner = new Scanner (new File("Skippy.dat"));
		int numberOfLines = myScanner.nextInt();
		int multiple;
		String output = "";
		for (int a = 0; a<numberOfLines; a++) {
			multiple = myScanner.nextInt();
			for (int b = 1; b<13; b++) {
				output = output + (b*multiple) + " ";
			}
			System.out.println(output);
			output = "";
		}
	}
}