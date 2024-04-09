import java.io.*;
import java.util.Scanner;

public class FileWriterDemo {
    public static void main(String[] args) {
        try {
            File file=new File("demo.txt");
            /*
            FileWriter fileWriter=new FileWriter("demo.txt");
            fileWriter.write("This is first line of java io");
            fileWriter.close();//must need - to send the data*/

            //read from scanner
            Scanner scanner=new Scanner(file);
            while(scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
            System.out.println("---------");
            //read from buffer reader
            FileReader fileReader=new FileReader("demo.txt");
            BufferedReader bf=new BufferedReader(fileReader);
            String line=bf.readLine();

           while(line!=null){
               System.out.println(line);
               line=bf.readLine();//reading next line and re-initialing line variable
            }

            bf.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
