package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class TestCaseReader {


    public static String myTestCaseReader (){

        try {
            File myObj = new File("TestCase.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {


        //Creating the File object
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream("TestCase.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        //Creating a Scanner object
        Scanner sc = new Scanner(inputStream);
        //StringBuffer to store the contents
        StringBuffer sb = new StringBuffer();
        //Appending each line to the buffer
        while(sc.hasNext()) {
            sb.append(" "+sc.nextLine());
        }
        String nnn = String.valueOf(sb);

        System.out.println(nnn);
sc.close();
    }
}




