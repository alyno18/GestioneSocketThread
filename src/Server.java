import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Logger;

public class Server {
	ServerSocket ss;
    Socket so;
    DataOutputStream out;
    DataInputStream in;
    
    public Server(int porta){
        try{
            ss = new ServerSocket(porta);
            System.out.println();
        } catch (IOException ex){
        	ex.printStackTrace();
        }
        
    }
    public void inAscolto(){
        try{
	        so = ss.accept();
	        System.out.println("connessione stabilita");
        }
        catch(IOException ex){
            Logger.getLogger(Server.class.getName());
        }
    }
    public void scrivi(String messaggio){
        try {
        	out = new DataOutputStream(so.getOutputStream());
        }
        catch(IOException ex) {
        	ex.printStackTrace();
        }
        
    }
    public void leggi(){
        try{
        	in = new DataInputStream(so.getInputStream());
        }
        catch(IOException ex) {
        	ex.printStackTrace();
        }
    }
}