import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Filehandling {
    public static void main(String[] args) {
//         File myfile=new File("myfile.txt");
//         try{
//             myfile.createNewFile();
//         }
//         catch(IOException e){
// System.out.println("file was not created ");

//         }


// try{
// FileWriter fWriter=new FileWriter("myfile.txt");
// fWriter.write("hello world from umair");
// fWriter.close();
// }
// catch(IOException e){
// System.out.println("writing in file is not possble");
// }


// try{
// File newfile=new File("umiiifile.txt");
// Scanner sc=new Scanner(newfile);
// System.out.println(sc.nextLine());

// }
// catch(IOException e){
// System.out.println("file does not exist");
// }



    File myFile=new File("myfiletxt");
    if(myFile.delete()){
System.out.println("file has been deleted ");

    }
    else{
        System.out.println("file does not delete");
    }
    }
}
