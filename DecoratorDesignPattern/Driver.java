package DDP;

public class Driver {
    public static void main(String[] args) {
        Room balloons = new Balloons(new Ceiling());
        System.out.println(balloons.partOfRoom());
        System.out.println();

        Room fairyLight = new FairyLight(new Wall());
        System.out.println(fairyLight.partOfRoom());
        System.out.println();

        /*
        Room balloons1= new Balloons(new Wall());
        System.out.println(balloons1.partOfRoom());
        System.out.println();

        Room fairyLight1 = new FairyLight(new Ceiling());
        System.out.println(fairyLight1.partOfRoom());
        System.out.println();
        */
    }
}
