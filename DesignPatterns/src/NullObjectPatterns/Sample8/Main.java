package NullObjectPatterns.Sample8;

public class Main {

    public static void main(String[] args) {

        AbstractSpaceShip ASS1 = SpaceShipFactory.getSpaceShipName("Voyager");
        System.out.println(ASS1.getName());

        AbstractSpaceShip ASS2 = SpaceShipFactory.getSpaceShipName("Enterprise");
        System.out.println(ASS2.getName());

        AbstractSpaceShip ASS3 = SpaceShipFactory.getSpaceShipName("Millenium Falcon");
        System.out.println(ASS3.getName());


    }
}
