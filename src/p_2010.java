/*
 * Copyright: Copyright © 2017, Arcane_nb <arcane.nb@gmail.com>
 * Copyright (c) 2017.
 */

import java.util.Scanner;

public class p_2010 {

    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int hap = 1;

        for(int i = 0; i < count; i++) {
            hap += scanner.nextInt()-1;
        }

        System.out.println(hap);

    }
}
