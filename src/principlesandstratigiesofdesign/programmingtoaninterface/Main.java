package principlesandstratigiesofdesign.programmingtoaninterface;

import principlesandstratigiesofdesign.programmingtoaninterface.interfaces.DisplayModule;

/**
 * This package presents the use of "Programming to an interface".
 * Here DisplayModule is an interface. Monitor and Projector are the classes that implements the interface. In
 * the Computer class we are dynamically binding the DisplayModule type.
 */
public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer();
        DisplayModule monitor = new Monitor();
        DisplayModule projector = new Projector();
        computer.setDisplayModule(monitor);
        computer.display();
        computer.setDisplayModule(projector);
        computer.display();
    }
}
