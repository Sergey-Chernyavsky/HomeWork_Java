package ru.pflb;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<Integer>();

        for(int i = 0; i < 10; i++){
            numbers.add(i + 1);
        }

        for(int i = 0; i < numbers.size(); i++){
            String multipleLine = "";
            for(int j = 0; j < numbers.size(); j++){
                if(i == 0){
                    String number = Integer.toString(numbers.get(j));
                    multipleLine += spaceNumber(number);
                }
                else{
                    String number = Integer.toString(numbers.get(j) * numbers.get(i));
                    multipleLine += spaceNumber(number);
                }
            }
            System.out.println(multipleLine);
        }
    }

    private static String spaceNumber(String s){
        while (s.length() < 3){
            s += " ";
        }
        return s;
    }
}
