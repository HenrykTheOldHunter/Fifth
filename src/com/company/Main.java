package com.company;

public class Main {

    public static void main(String[] args) {
        MovableCircle movableCircle = new MovableCircle(100,85,2,12);
        MovablePoint movablePoint = new MovablePoint(34, 43,10,11);
        System.out.println(movableCircle.toString());
        System.out.println(movablePoint.toString());
    }
}