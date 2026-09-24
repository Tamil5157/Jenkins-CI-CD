import com.sun.net.httpserver.HttpServer;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
 
public class Jenkins {
    public static void main(String[] args) throws IOException {
 
        HttpServer server = HttpServer.create(new InetSocketAddress(8081), 0);
 
        server.createContext("/", exchange -> {
 
            String response = "Hello from Jenkins CI/CD Pipeline!";
 
            exchange.sendResponseHeaders(200, response.length());
 
            try (OutputStream os = exchange.getResponseBody()) {
                os.write(response.getBytes());
            }
        });
 
        server.start();
 
        System.out.println("Application running on port 8081");
    }
}
