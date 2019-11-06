import java.util.Timer;
import java.util.TimerTask;

public class DogDoor {

    private boolean open;

    public DogDoor(){
        this.open = false;
    }

    public void open(){
        System.out.println("The dog door is opening");
        open=true;
    }
    public void close(){
        System.out.println("The dog door is closing");
        open=false;
    }
    public void openTimed(){
        open();

        final Timer timer = new Timer();
        timer.schedule(new TimerTask(){
            public void run(){
                close();
                timer.cancel();
            }
        },5000);
    }

    //returns the state of the door
    public boolean isOpen(){
        return open;
    }

}
