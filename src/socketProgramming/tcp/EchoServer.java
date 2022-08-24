package socketProgramming.tcp;
import java.net.*;
import java.io.*;
public class EchoServer {
    private Socket clientSocket;
    private ServerSocket serverSocket;
    private PrintWriter out;
    private BufferedReader in;

    public void start(int port) throws IOException {
        serverSocket = new ServerSocket(port);
        clientSocket = serverSocket.accept();
        out = new PrintWriter(clientSocket.getOutputStream(), true);
        in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        String line = in.readLine();
        while(line!=null){
            if(line.equals(".")){
                out.println("good bye");
                break;
            }
            out.println(line);
        }
    }
    public void stop() throws IOException {
        out.close();
        in.close();
        serverSocket.close();
        clientSocket.close();
    }

    public static void main(String[] args) throws IOException {
        EchoServer echoServer = new EchoServer();
        echoServer.start(4444);
    }
}
