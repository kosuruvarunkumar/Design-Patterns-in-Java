package principlesandstratigiesofdesign.programmingtoaninterface;

import principlesandstratigiesofdesign.programmingtoaninterface.interfaces.DisplayModule;

public class Computer {
    private DisplayModule displayModule;

    public void setDisplayModule (DisplayModule displayModule) {
        this.displayModule = displayModule;
    }

    void display() {
        displayModule.display();
    }
}
