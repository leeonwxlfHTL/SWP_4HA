package streams;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileExists {
    public static void main(String[] args) throws Exception {
        File file2 = new File("C:/Users/wolfl/Desktop/test2.txt");
        if(file2.exists()){
            System.out.println("File2 exists");
        } else {
            System.out.println("File2 does not exist");
        }
        File file = new File("test.txt");
        if(file.exists()){
            System.out.println("File exists");
        } else {
            System.out.println("File does not exist");
        }

        file2.delete();



        //File file3 = new File("C:/Users/wolfl/Desktop/test");
        //file3.mkdir();
        File file4;

       // for (int i = 0; i < 10; i++) {
       //     file4 = new File("C:/Users/wolfl/Desktop/test/test" + i + ".txt");
      //      file4.createNewFile();
      //  }

       // FileOutputStream os;
       // for (int i = 0; i < 10; i++) {
       ////os = new FileOutputStream(file4);
        //   for (int k = 0; k <= i; k++){
        //       os.write((k + "\n").getBytes());
        //   }
        //   }
        //os.close();
       // }
        file4 = new File("C:/Users/wolfl/Desktop/test");

        file4.delete();



    }

