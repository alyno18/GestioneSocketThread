
public class Countdown extends Thread{
private int tempo;
    
    public Countdown(int t){
        this.tempo=t;
    }
    public void run(){
        for(int i = tempo; i>0;i--){
            System.out.println(i);
            
            try {
                sleep(1000);
            }
            catch (InterruptedException ex) {
            	ex.printStackTrace();
            }
        }
    }
}