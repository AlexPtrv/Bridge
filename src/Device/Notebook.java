package Device;

import Mark.Marks;

public class Notebook extends Gadgets{
    public Notebook(Mark.Marks marks) {
        super(marks);
    }

    @Override
    void showType() {
        System.out.println("Device.Notebook");
    }
}
