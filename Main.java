import java.io.FileWriter;//Needed for writing to the file
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.*;

import java.io.IOException; //Exception handling

import java.util.Scanner; //Takes in user input.



public class Main {
    public static void main(String[] args) throws IOException {
        File _file = new File("file.txt"); //Selects file and prepares it for writing
        FileWriter _fileWriter = new FileWriter(_file, true);
        BufferedWriter _buffWriter = new BufferedWriter(_fileWriter);
        PrintWriter _printWriter = new PrintWriter(_buffWriter);

        Scanner _input = new Scanner(System.in); //Takes in user input
        System.out.println("Please enter some text (the text will be filled on a new line in the file):");
        String _text = _input.next();

        _printWriter.print("\n" + _text); //appends to file
        _printWriter.close();

    }
}