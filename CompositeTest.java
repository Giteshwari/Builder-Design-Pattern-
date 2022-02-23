/**
COMPOSITE DESIGN PATTERN
*/

package CompositeDesignPattern;

/*
used when objects represent tree structure.
It has composite and leaf objects.
Whatever we perform with leaf objects, that need to be performed with composite objects.
*/

public class CompositeTest
{
    public static void main(String[] args)
    {
       //CLIENT
     Component hardDrive = new Leaf(4000,"HardDrive");
       Component mouse = new Leaf(500,"Mouse");
       Component monitor = new Leaf(6000,"Monitor");
       Component ram = new Leaf(3000,"RAM");
       Component cpu = new Leaf(9000,"CPU");

       Composite peripheral = new Composite("Peripheral");
       Composite cabinet = new Composite("Cabinet");
       Composite motherBoard = new Composite("MotherBoard");
       Composite computer = new Composite("Computer");

       peripheral.addComponent(mouse);
       peripheral.addComponent(monitor);

       motherBoard.addComponent(ram);
       motherBoard.addComponent(cpu);

       cabinet.addComponent(hardDrive);
       cabinet.addComponent(motherBoard);

       computer.addComponent(peripheral);
       computer.addComponent(cabinet);

       peripheral.showPrice();  //has mouse and monitor
       System.out.println();

       computer.showPrice();
    }
}
