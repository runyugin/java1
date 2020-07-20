package ru.progwards.java2.lessons.test;

public class addAsStrings {

    static int addAsStrings(int n1, int n2){
        int z = n1+n2;


        String nn1 = Integer.toString(n1);
        String nn2 = Integer.toString(n2);
        String zz = nn1 + nn2;
        int zx = Integer.parseInt(zz);

        return zx;
    }

    static String textGrade(int grade){
        String textGrade = "не определено";
        if(grade==0){textGrade = "не оценено";}
        else if(grade>0 && grade<21){textGrade = "очень плохо";}
        else if(grade>20 && grade<41){textGrade = "плохо";}
        else if(grade>40 && grade<61){textGrade = "удовлетворительно";}
        else if(grade>60 && grade<81){textGrade = "хорошо";}
        else if(grade>80 && grade<101){textGrade = "отлично";}
        return textGrade;
    }







    public static void main(String[] args) {
        addAsStrings(1, 2);
        addAsStrings(2, 1);
        textGrade(0);

    }
}
