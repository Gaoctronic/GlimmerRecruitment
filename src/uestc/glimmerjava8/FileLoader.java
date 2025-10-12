package uestc.glimmerjava8;

import java.io.*;

public class FileLoader {

    private static final String UTILITY_CLASS_CONSTRUCTOR_MESSAGE = "工具类不能被实例化";
    private static final String ERROR_FILE_NOT_FOUND = "ERROR: 文件未找到! ";
    private static final String ERROR_EMPTY_FILE = "ERROR: 文件为空! ";


    private FileLoader() {
        throw new AssertionError(UTILITY_CLASS_CONSTRUCTOR_MESSAGE);
    }

    public static void main(String[] args) {

        BufferedReader bufferedReader = null;

        try {
            File file = new File("data.txt");
            if (!file.exists()) {
                throw new FileNotFoundException(ERROR_FILE_NOT_FOUND);
            }

            bufferedReader = new BufferedReader(new FileReader(file));
            String line;
            int sum = 0;
            int count = 0;


            while ((line = bufferedReader.readLine()) != null) {
                line = line.trim();
                if (line.isEmpty()) {
                    continue;
                }

                try {
                    int number = Integer.parseInt(line);
                    sum += number;
                    count++;
                } catch (NumberFormatException e) {
                    System.out.println("警告：发现无法解析的内容 \"" + line + "\"，该行已被跳过。");
                }
            }

            if (count == 0) {
                throw new EmptyFileException(ERROR_EMPTY_FILE);
            }

            double average = (double) sum / count;
            System.out.println("文件中整数的平均值为：" + average);

        } catch (FileNotFoundException | EmptyFileException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println("读取文件时发生IO异常：" + e.getMessage());
        } finally {

            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                    System.out.println("文件已关闭。");
                } catch (IOException e) {
                    System.out.println("关闭文件时出错：" + e.getMessage());
                }
            }
        }
    }


}

