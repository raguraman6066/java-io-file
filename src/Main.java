import  java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        //create file
       File file=new File("abc.txt");
       boolean fstatus=file.createNewFile();
       System.out.println(fstatus);
        //create directory
    File file2=new File("mywork");
     //   File file2=new File("D:\\");
       boolean f2status=file2.mkdir();
       System.out.println(f2status);
        //create file inside dir
       File file3=new File(file2,"work.txt");
       file3.createNewFile();
       //list of files in dir
        String[] str=file2.list();
        for(String st:str)
        {
            //file3.isDirectory()
            if(st.contains(".")){
                System.out.println("file "+st);
            }else{
                System.out.println("dir "+st);
            }
        }
//delete the file
        file3.delete();
        file2.delete();
    }
}