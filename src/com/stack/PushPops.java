package com.stack;

public class PushPops {
    static int top = -1;
    static int[] arr = new int[10];

    public static void push(int x) {
        if (top == arr.length - 1) {
            System.out.println("capacity full");
        } else {
            top++;
            arr[top] = x;
            System.out.println(x + " is store in " + (top + 1) + " position and capacity is " + arr.length);
        }
    }

    public static void pop() {
        if (top == -1) {
            System.out.println("stack empty");
        } else {
            arr[top] = 0;
            System.out.println("data deleted form " + top + " index");
            top--;
        }
    }
}
