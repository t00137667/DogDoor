public class BarkRecogniser {

    private DogDoor door;


    public BarkRecogniser(DogDoor door) {

        this.door = door;

    }

    public void recognize(String Bark) {
        if(Bark == "Woof")
        {

            System.out.println("A bark was heard");

            door.openTimed();

        }
    }
}

