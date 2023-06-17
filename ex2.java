// 2) Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.

import java.io.IOException;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class ex2 {
        public static void main(String[] args) throws IOException{
            Logger sortarray = Logger.getLogger(ex2.class.getName());

            String logsPath = "bublesort.txt";
            FileHandler fh = new FileHandler(logsPath, false);
            sortarray.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();
            fh.setFormatter(formatter);

            int [] array = {8, 6, 4, 3, 5, 7};
            sortarray.info("Исходная версия массива: " + Arrays.toString(array));
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length - i - 1; j++) {
                    if(array[j] > array[j+1]){
                        int temp = array[j];
                        array[j] = array[j+1];
                        array[j+1] = temp;
                }
            }
            
            sortarray.info("Текущая версия массива: " + Arrays.toString(array));
                                
        }

        sortarray.info("Итоговая версия массива: " + Arrays.toString(array));
        
        sortarray.warning("Массив отсортирован!!!!");
    }
}

