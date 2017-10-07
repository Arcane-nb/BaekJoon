/*
 * Copyright: Copyright © 2017, Arcane_nb <arcane.nb@gmail.com>
 * Copyright (c) 2017.
 */

import java.util.Arrays;
import java.util.Scanner;

public class p_1037 {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt(); //약수의 개수
        int[] arr = new int[count];
        for(int i = 0; i < count; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(arr[0] * arr[count-1]);

    }
}
