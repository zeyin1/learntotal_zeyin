package com.zeyinpro.dto;

public class Subject {
    private static  final int number=60;

    private MathSubject mathSubject;

    public Subject(MathSubject mathSubject){
        this.mathSubject=mathSubject;
    }

    public String getUserName() {
        return mathSubject.getUserName();
    }

    public int getScore() {
        return mathSubject.getScore();
    }

    public boolean average(){
        return mathSubject.getScore()>number;

    }

}
