package ExceptionTesting;

import org.testng.annotations.Test;

import java.io.FileNotFoundException;

public class FileHandlingTest  {
     @Test(expectedExceptions = FileNotFoundException.class)
     public void testFileHandling() throws FileNotFoundException {
         FileHandling fileHandling = new FileHandling();
         fileHandling.readFile("abc.png");
     }

}
