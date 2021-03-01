package binocla;

import java.util.ArrayList;
import java.util.Scanner;

public class MyTestClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        int cnt = 0;
            for (int i = 2; i < Integer.MAX_VALUE; i++) {
                boolean prime = true;
                if (i != 2 && i != 3) {
                    for (int j = 2; j <= Math.sqrt(i) + 1; j++) {
                        if (i % j == 0) {
                            prime = false;
                            break;
                        }
                    }
                }
                if (prime) {
                    a.add(i);
                    cnt++;
                }
                if (cnt == n) {
                    break;
                }
            }
        for (Integer item: a) {
            System.out.print(item + " ");
            }
        }
    }