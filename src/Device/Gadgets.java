package Device;

import Mark.Marks;

public abstract class Gadgets {
    Mark.Marks mark;

    public Gadgets(Mark.Marks mark) {
        this.mark = mark;
    }

    public void showDetails() {
        showType();
        mark.showMark();
    }

    abstract void showType();
}
