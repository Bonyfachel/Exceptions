package com.company;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        FileInputStream a = new FileInputStream("a.txt");
        FileInputStream b = new FileInputStream("b.txt");
        Scanner scanner = new Scanner(a);
        Scanner scanner2 = new Scanner(b);
        int c;
        int d;
        while ((c = a.read()) != -1 && (d = b.read()) != -1) {
            if (c != d) {
                System.out.println((char)c + " " + (char)d);
            }
        }
        a.close();
        b.close();
    }
}
