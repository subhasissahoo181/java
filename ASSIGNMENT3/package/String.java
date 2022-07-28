//Q-2



import java.io.*;
import java.io.IOException;

 class String {
	public static void main(String args[]) throws IOException {
		String name[];
		String temp;
		int i, size, j;
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);
		System.out.print("\n HOW MANY NAMES DO YOU WANT TO SORT : ");
		size = Integer.parseInt(br.readLine());
		name = new String[size];
		System.out.println("\n ENTER THE NAMES : ");
		for (i = 0; i < size; i++) {
			name[i] = br.readLine();
		}
		for (i = 0; i < size; i++) {
			for (j = 1; j < size; j++) {
				if (name[j - 1].compareTo(name[j]) > 0) {
					temp = name[j - 1];
					name[j - 1] = name[j];
					name[j] = temp;
				}
			}
		}
		System.out.println("\n THYE SORTED NAMES ARE : ");
		for (i = 0; i < size; i++) {
			System.out.println(name[i]);
		}
	}

}
