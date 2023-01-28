package search;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split(" ");
        String target = scanner.nextLine();
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(target)) {
                System.out.println(i + 1);
                return;
            }
        }
        System.out.println("Not found");
    }
}
