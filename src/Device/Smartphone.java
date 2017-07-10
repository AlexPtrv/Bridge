package Device;

import Mark.Marks;

public class Smartphone extends Gadgets {
    public Smartphone(Mark.Marks mark) {
        super(mark);
    }

    @Override
    void showType() {
        System.out.println("Device.Smartphone");

    }
}
