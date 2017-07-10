import Device.Gadgets;
import Device.Notebook;
import Mark.Samsung;

public class Start {
    public static void main(String[] args) {
        Gadgets gadgets = new Notebook(new Samsung());
        gadgets.showDetails();
    }
}
