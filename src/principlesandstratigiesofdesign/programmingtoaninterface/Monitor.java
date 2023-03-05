package principlesandstratigiesofdesign.programmingtoaninterface;

import principlesandstratigiesofdesign.programmingtoaninterface.interfaces.DisplayModule;

public class Monitor implements DisplayModule {
    @Override
    public void display() {
        System.out.println("Displaying through monitor");
    }
}
