import java.io.IOException;
import java.net.InetAddress;

public class GestioneClient {

	public static void main(String[] args) {
		try{
	        Client cli = new Client(InetAddress.getLocalHost(), 2000);
	        cli.leggi();
	        }
		catch(IOException ex){
	            ex.printStackTrace();
	        }
	}
}