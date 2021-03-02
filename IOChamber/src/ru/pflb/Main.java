package ru.pflb;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        if(args.length > 0){
            try{
                fileReader(args[0]);
            }
            catch (FileNotFoundException e){
                System.out.println("Файл не распознан. Введите ваши сообщения");
                consoleReader();
            }
        }
        else{
            consoleReader();
        }
    }

    private static void fileReader(String fileName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        List<String> readerList = new ArrayList<String>();

        while (reader.ready()){
            String fileLine = reader.readLine();
            readerList.add(fileLine);
        }

        for(int i = 0; i < readerList.size(); i++){
            if((i + 1)%2 != 0)System.out.println(readerList.get(i));

        }
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
            if((i + 1)%2 != 0)System.out.println(inputList.get(i));
        }
    }
}
