package s15_IO_textfile.bai_tap;

import s15_IO_textfile.thuc_hanh.ReadFileExample;

import java.io.*;
import java.util.Scanner;

public class CopyFileText {
    public static void main(String[] args) throws IOException {
        InputStream inStream = null;
        OutputStream outStream = null;
        System.out.println("cung cấp một tập tin nguồn: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println("cung cap một tập tin đích: ");
        String output = scanner.nextLine();

        try {
            inStream = new FileInputStream(new File(input));
            outStream = new FileOutputStream(new File(output));

            int length;
            /*
             * copy dữ liệu từ file đầu vào sang file đầu ra
             *  sử dụng phương thức read và write trong java.
             */
            byte[] buffer = new byte[1024];

            // copy the file content in bytes
            while ((length = inStream.read(buffer)) > 0) {
                outStream.write(buffer, 0, length);
            }
            System.out.println("File is copied successful!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            /*Đóng luồng input/output*/
            inStream.close();
            outStream.close();
        }
    }
}
