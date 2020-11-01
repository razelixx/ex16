package com.company;

//Необходимо написать программу, которая будет выводить на экран текстовые данные из файла .txt

import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try(FileReader txtRead = new FileReader("file.txt"))
        {
            int i;
            while((i=txtRead.read())!=-1){
                System.out.print((char)i);
            }
        }
        catch (IOException exc){
            System.out.println(exc.getMessage());
        }
    }
}
