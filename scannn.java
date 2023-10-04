import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //从控制台获取字符串
        //Scanner scanner = new Scanner(System.in);
        /*System.out.println("请输入字符串：");
        while(true){
            String line = scanner.nextLine();
            if(line.equals("exit")) break;
            System.out.println(">>"+line);
        }*/

        //使用分隔符
        //Scanner scanner = new Scanner("123 asdf sd 45 789 sdf asdfl,sdf.sdfl,asdf    ......asdfkl    las");
        /*  while(scanner.hasNext()){
            scanner.useDelimiter(" |,|\\.");
            System.out.println(scanner.next());
        }*/

        //测试文本输入
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File("D:\\Workspaces\\Java\\algorithm\\Offer_7.java"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while(scanner.hasNextLine()){ 
            System.out.println(scanner.nextLine());
        }

        scanner.close();
    }
}
