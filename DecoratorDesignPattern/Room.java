package DDP;

interface Room{
    public String partOfRoom();
}

class Wall implements Room{
    public String partOfRoom() {
        return "Decorated walls with ";
    }
}

class Ceiling implements Room{
    public String partOfRoom()
    {
        return "Decorated Ceiling with ";
    }
}

