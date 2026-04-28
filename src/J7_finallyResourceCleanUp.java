//Resource cleanup is main use of finally
import java.io.*; //imports all classes from the I/O package, Needed for: FileInputStream, IOException

public class J7_finallyResourceCleanUp {
    public static void main(String[] args) {
        FileInputStream file = null;

        try {
            file = new FileInputStream("test.txt");
        } catch (Exception e) {
            System.out.println("Error");
        } finally {
            try {
                if (file != null) {
                    file.close();
                    System.out.println("File closed");
                }
            } catch (IOException e) {
                System.out.println("Error closing file");
            }
        }
    }
}


/*


//Resource cleanup is main use of finally
import java.io.*; //imports all classes from the I/O package, Needed for: FileInputStream, IOException

public class J7_finallyResourceCleanUp {
    public static void main(String[] args) {
        FileInputStream file = null;  //initialize with null, Declared outside so it can be accessed in finally
                                      // Initialized to null to: Avoid uninitialized variable error
                                      //Allow checking: if(file != null)


        try {                                        //Tries to open a file, this is called resource acquisition
            file = new FileInputStream("test.txt");  //Possible exception: FileNotFoundException(subclass of IOException), if file doesn't exist
        } catch (Exception e) {        //Catches any exception(Exception is generic), Prints simple message,  (FileNotFoundException e) would be better
            System.out.println("Error");  //prints simple message
        } finally {           //Always executes, used for cleanup(releasing resources)
            try {
                if (file != null) {   //prevent NullPointerException, cause if file failed to open -> file is still null
                    file.close();     //Release System resources, Closes file Safely, *** close() itself can throw exception!!!
                    System.out.println("File closed");
                }
            } catch (IOException e) {
                System.out.println("Error closing file");
            }
        }
    }
}


Why Cleanup is Important
When a file is Opened: -> OS allocates: File Descriptor, Memory Buffer
If Not Closed: -> Memory Leak, file lock issues, Too many open files -> CRASH
Very important in backend System(High load Systems)


Why try-catch inside Finally
file.close() throws checked exception(IOException)
Java forces you to handle it
*Cannot Leave finally without handling exceptions

____________________________________________________________


Alternate to above try-catch-finally Resource cleanup
Above pattern is replaced by try-with-resource

try (FileInputStream file = new FileInputStream("test.txt")) {
    // use file
} catch (IOException e) {
    System.out.println("Error");
}


Benefits: No finally, No Manual close(), No Nested try-catch, Cleaner and safer




 */