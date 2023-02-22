import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String host = "netology.homework";
        int port = 8089;

        try (Socket clientSocket = new Socket(host, port);
             PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
             BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))) {

            String message1 = in.readLine();
            System.out.println(message1);
            out.println(scanner.nextLine());
            String message2 = in.readLine();
            System.out.println(message2);
            out.println(scanner.nextLine());
            String message3 = in.readLine();
            System.out.println(message3);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
