package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Boolean _ASelected = false;
        Boolean _BSelected = false;
        int counterA = 0;
        int counterB = 0;
        int v = scanner.nextInt();
        String[] myString = new String[v];
        for (int i = 0; i < v; i++) {
            myString[i] = scanner.next();
        }
        // Loop for each String
        for (String tmpString : myString) {
            // Loop for each letter
            counterA = 0;
            counterB = 0;
            for (int i = 0; i < tmpString.length(); i++) {
                // Other normal calcs
                switch (tmpString.charAt(i)) {
                    case 'A':
                        if (_ASelected) {
                            if (i!= 0) counterA++;
                        }
                        _ASelected = true;
                        _BSelected = false;
                        break;
                    case 'B':
                        if (_BSelected) {
                            if (i!= 0) counterB++;
                        }
                        _BSelected = true;
                        _ASelected = false;
                        break;
                }
            }
            System.out.println(counterA + counterB);
        }
    }
}
