package com.company;

public class College implements Edu{
    private String Name, Place, Level, Teachers;
    //Конструктор класу
    public College (String name, String place, String level, String teachers) {
        Name = name;
        Place = place;
        Level = level;
        Teachers = teachers;
    }

    @Override
    public String getKind() {
        return "Коледж ";
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
