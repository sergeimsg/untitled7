import java.io.*;
import java.util.Scanner;

public class Documents {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("������� ����� ����� ��� ������. ��������� test.txt");
        try {
        FileReader fileReader = new FileReader(scanner.next()); // ������ ��� ������, ��� ����
        BufferedReader bufferedReader = new BufferedReader(fileReader); // ������� � ����� ����
        String line = bufferedReader.readLine(); // ������ �� �������
            int count =0;
        while (line != null)

        {   count++;   // ������� ������
            line = bufferedReader.readLine();
            int lineLength = line.length();
            if (line.contains("docnum") && lineLength==15)   {
                 System.out.println("������ �����  " + count + " ���������� � docum � ������ ������ ����� 15 ��������, �   " + line);
                }
            if (line.contains("contract") && lineLength==15) {
                System.out.println("������ �����  "+count + "  ���������� � contract � ������ ����� ����� 15 ��������, �   " + line);}

            }

        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            System.out.println("������ ���������� �� ��������");

        }

            }
}
