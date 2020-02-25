package state.second;

public class EraserTool implements Tool {
    @Override
    public void mouseDown() {
        System.out.println("Selected the eraser!");
    }

    @Override
    public void mouseUp() {
        System.out.println("Erasing something");
    }
}
