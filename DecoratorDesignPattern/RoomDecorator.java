package DDP;

public abstract class RoomDecorator implements Room {
    private Room newRoom;
    RoomDecorator(Room newRoom)
    {
        this.newRoom = newRoom;
    }

    @Override
    public String partOfRoom() {
        return (newRoom.partOfRoom());
    }
}

class Balloons extends RoomDecorator
{
    Balloons(Room newRoom){
        super(newRoom);
    }
    @Override
    public String partOfRoom() {
        return super.partOfRoom() + "Balloons";
    }
}

class FairyLight extends RoomDecorator
{
    FairyLight(Room newRoom) {
        super(newRoom);
    }

    @Override
    public String partOfRoom() {
        return super.partOfRoom() + "Fairy Lights";
    }
}

