import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

public class Client {
	Socket so;
	DataOutputStream out;
	DataInputStream in;
	
    public Client(InetAddress ip, int porta){
        try{
        	so = new Socket(ip, porta);
        }
        catch(IOException ex){
            ex.printStackTrace();
        }
    }
    
    public void scrivi(String messaggio){
        try{
        	out = new DataOutputStream(so.getOutputStream());
        }
        catch (IOException ex) {
        	ex.printStackTrace();
        }
        
    }
    public void leggi(){
        try{
        	in = new DataInputStream(so.getInputStream());
        }
        catch (IOException ex) {
        	ex.printStackTrace();
        }
    }
}
