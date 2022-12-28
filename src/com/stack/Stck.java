package com.stack;

import java.util.Scanner;

public class Stck {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        while(true) {
            System.out.println("push(1) or pop(2)");
            int pp=sc.nextInt();
            switch (pp){
                case 1: System.out.println("ENTER");
                    PushPops.push(sc.nextInt());
                    break;
                case 2:PushPops.pop();
                    break;
            }
        }
    }
}