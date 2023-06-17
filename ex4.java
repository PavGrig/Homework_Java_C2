import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class ex4 {
    public static void main(String[] args) throws IOException{
        Logger calculator = Logger.getLogger(ex2.class.getName());

        String logsPath = "calculator.txt";
        FileHandler fh = new FileHandler(logsPath, true);
        calculator.addHandler(fh);
        SimpleFormatter formatter = new SimpleFormatter();
        fh.setFormatter(formatter);

        Scanner scan = new Scanner(System.in);
        
        System.out.print("Input a first number: ");
        double num1 = scan.nextDouble();
        
        System.out.print("Input a second number: ");
        double num2 = scan.nextDouble();
        
        System.out.print("Input a required operation (+-/*): ");
        char operation = scan.next().charAt(0);
        
        scan.close();
        
        double res = 0;
        
        if (operation == '+'){
            res = num1 + num2;
            calculator.info("Результат решения: " + num1 + "+" + num2 + "=" + res);
        }
        

        if (operation == '-'){
            res = num1 - num2;
            calculator.info("Результат решения: " + num1 + "-" + num2 + "=" + res);
        }

        if (operation == '/'){
            res = num1 / num2;
            calculator.info("Результат решения: " + num1 + "/" + num2 + "=" + res);
        }

        if (operation == '*'){
            res = num1 * num2;
            calculator.info("Результат решения: " + num1 + "*" + num2 + "=" + res);
        }
        
        System.out.println(res);
    }
}
