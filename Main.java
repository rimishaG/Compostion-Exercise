package language;

public class Main {

    public static void main(String[] args) {
//	create a single room of a house using composition
        //Think about the things that should  be included in the  room
        //maybe physical parts of the house but can be furniture as well.
        //add at least one method to access an object via a getter and
        //then  that objects public method as you saw in the previous video
        //then add atleast one method to hide the object e.g. not using getter
        //but to access the object used in composition within the main class.
        //like you saw earlier in this video.

        Wall wall1 = new Wall("East");
        Wall wall2 = new Wall("West");
        Wall wall3 = new Wall("North");
        Wall wall4 = new Wall("South");

        Ceiling ceiling = new Ceiling(15,60);
        Bed bed = new Bed("Modern",4,3,2,1);
        Lamp lamp = new Lamp("Classic",true,80);

        Bedroom bedroom = new Bedroom("Sajibs", wall1, wall2,wall3,wall4,ceiling,bed,lamp);
        bedroom.makeBed();
        bedroom.getLamp().turnOn();
    }
}
