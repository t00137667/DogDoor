public class DogDoorTest {

    public static void main(String[] args) {
        DogDoor door = new DogDoor();
        Remote remote = new Remote(door);
        BarkRecogniser  sensor = new BarkRecogniser(door);

        System.out.println("Rover barks to go outside....");
        sensor.recognize("Woof");
        System.out.println();

        System.out.println("Rover has gone outside....");
        //remote.pressButton();
        System.out.println();

        try{
            Thread.currentThread().sleep(10000);
        }
        catch(InterruptedException e){

        }

        System.out.println("Rover has done his business....");
        //remote.pressButton();
        System.out.println();

        if(!door.isOpen()){
            System.out.println("Rover is stuck outside");
            System.out.println();
            System.out.println("Rover barks to get inside");
            sensor.recognize("Woof");
        }

        System.out.println("Rover is back inside....");
        //remote.pressButton();
        System.out.println();
    }
}
