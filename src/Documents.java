import java.io.*;
import java.util.Scanner;

public class Documents {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите адрес файла для чтения. Подсказка test.txt");
        try {
        FileReader fileReader = new FileReader(scanner.next()); // объект для чтения, наш файл
        BufferedReader bufferedReader = new BufferedReader(fileReader); // выводим в буфер файл
        String line = bufferedReader.readLine(); // читаем по строчно
            int count =0;
        while (line != null)

        {   count++;   // считаем строки
            line = bufferedReader.readLine();
            int lineLength = line.length();
            if (line.contains("docnum") && lineLength==15)   {
                 System.out.println("строка номер  " + count + " начинается с docum и длинна номера равна 15 символам, №   " + line);
                }
            if (line.contains("contract") && lineLength==15) {
                System.out.println("строка номер  "+count + "  начинается с contract и длинна номер равна 15 символам, №   " + line);}

            }

        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            System.out.println("больше совпадений не выявлено");

        }

            }
}
