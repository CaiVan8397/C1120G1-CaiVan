package s15_IO_textfile.bai_tap;

import java.io.*;

public class CopyFileText2 {
    public static void main(String[] args) {
        File file = new File("D:\\test1.txt");
        File file1 = new File("D:\\test2.txt");
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader =new BufferedReader(fileReader);
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file1));
            String line;
            while ((line =bufferedReader.readLine()) !=null){
                System.out.println(line);
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
