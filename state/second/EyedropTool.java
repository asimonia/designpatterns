package state.second;

public class EyedropTool implements Tool {
    @Override
    public void mouseDown() {
        System.out.println("Selected the eyedrop!");
    }

    @Override
    public void mouseUp() {
        System.out.println("Filling the canvas with some blue");
    }
}
