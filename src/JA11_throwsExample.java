import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

class ReadAndWrite{

    void readFile() throws FileNotFoundException{
        FileInputStream fis = new FileInputStream("d:/abc.txt");
        //statement
    }

    void saveFile() throws FileNotFoundException{
        String text = "This is Demo";
        FileOutputStream fos = new FileOutputStream("d:/xyz.txt");
        //statement
    }

}

public class JA11_throwsExample {
    public static void main(String[]args){
        ReadAndWrite rw = new ReadAndWrite();

        try{
            rw.readFile();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }

        try{
            rw.saveFile();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
        System.out.println("Hello ABC");
    }
}
