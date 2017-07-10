package Device;

import Mark.Marks;

public class Tablet extends Gadgets {

    public Tablet(Mark.Marks mark) {
        super(mark);
    }

    @Override
    void showType() {
        System.out.println("Device.Tablet");

    }
}
