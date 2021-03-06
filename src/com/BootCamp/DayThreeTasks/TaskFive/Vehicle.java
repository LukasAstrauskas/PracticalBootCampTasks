package com.BootCamp.DayThreeTasks.TaskFive;

public class Vehicle {
    private final String name;
    private final int mass;
    private final int yearProduced;
    private int speed;

    public Vehicle(String name, int mass, int yearProduced, int speed) {
        this.name = name;
        this.mass = mass;
        this.yearProduced = yearProduced;
        this.speed = 0;
    }

    public void drive(int speed) {
        this.speed = speed;
    }

    public void info() {
        System.out.println(
                "Vehicle: " + name +
                        "\nMass: " + mass +
                        "\nYear Produced: " + yearProduced +
                        "\nSpeed:" + speed
        );
    }
}
