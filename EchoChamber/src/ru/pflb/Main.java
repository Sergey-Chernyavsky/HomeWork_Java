package ru.pflb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        consoleReader();
    }

    private static void consoleReader() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> inputList = new ArrayList<String>();

        String input;
        while (!(input = reader.readLine()).equals("")){
            inputList.add(input);
        }
        reader.close();

        for(int i = 0; i < inputList.size(); i++){
            System.out.println(inputList.get(i));
        }
    }

}
