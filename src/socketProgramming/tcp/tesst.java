package socketProgramming.tcp;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class tesst {
//    @Test
//    public void givenGreetingClient_whenServerRespondsWhenStarted_thenCorrect() throws IOException {
//        GreetClient client = new GreetClient();
//        client.startConnection("127.0.0.1", 6666);
//        String response = client.sendMessage("hello server");
//        assertEquals("hello client", response);
//    }


    @Test
    public void givenClient_whenServerEchosMessage_thenCorrect() throws IOException {
        EchoClient client = new EchoClient();
        client.startConnection("127.0.0.1", 4444);
        String resp1 = client.sendMessage("hello");
        String resp2 = client.sendMessage("world");
        String resp3 = client.sendMessage("!");
        String resp4 = client.sendMessage(".");

        assertEquals("hello", resp1);
        assertEquals("world", resp2);
        assertEquals("!", resp3);
        assertEquals("good bye", resp4);
    }
}
