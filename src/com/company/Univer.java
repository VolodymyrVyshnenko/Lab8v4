package com.company;

public class Univer implements Edu{
    private String Name, Place, Level, Teachers;
    //Конструктор класу
    public Univer (String name, String place, String level, String teachers) {
        Name = name;
        Place = place;
        Level = level;
        Teachers = teachers;
    }

    @Override
    public String getKind() {
        return "Університет ";
    }

    @Override
    public String getName() {
        return Name;
    }

    @Override
    public String getPlace() {
        return Place;
    }

    @Override
    public String getLevel() {
        return Level;
    }

    @Override
    public String getTeachers() {
        return Teachers;
    }
}