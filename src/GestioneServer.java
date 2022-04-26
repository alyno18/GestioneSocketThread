
public class GestioneServer {

	public static void main(String[] args) {
		Server srv = new Server(2000);
        srv.inAscolto();
        srv.scrivi("Benvenuto");
	}
}
