import lombok.ToString;

import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 8080);
            Scanner scanner = new Scanner(System.in)) {
            System.out.println("已连接到服务器");
            OutputStreamWriter writer = new OutputStreamWriter(socket.getOutputStream());
            writer.write(scanner.nextLine()+"\n");
            writer.flush();
            System.out.println("消息已发送");
        } catch (Exception e) {
            System.out.println("连接服务器失败");
            e.printStackTrace();
        }
    }
}
