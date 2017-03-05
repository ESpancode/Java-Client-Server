//Java Socket Program
//Socket Client
import java.net;
import java.io.;

//Create public class called Client

public class Client{
    public static void main(String [] args){
        String server =  args [0];
        int port = int.parseint(args[1]);
        try{
            //Connecting to server
            System.out.println("Connecting" + server + "To Port" + port);
            Socket client = new Socket (server, port);

            //Output to server
            System.out.println("Connected" + client.getRemoteSocketAddress());
            OutputStream outToServer - client.getOutputStream();
            DataOutputStream out = new DataOutputStream(outToServer);

            //Input from Server 
            out.write("Hello" + client.getLocalSocketAddress());
            InputStream FromServer = client.getInputStream();
            DataInputStream in = new DataInputStream(FromServer);

            // Closing the server
            System.out.println("Server Response", in.read());
            client.close(); 
        }
        //Tracing Server Data 
        catch(IOException e){
            e.printStackTrace(); 
        }   
        }
    }
}