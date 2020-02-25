package state.second;

public class PaintcanTool implements Tool {
    @Override
    public void mouseDown() {
        System.out.println("Selected the paint can!");
    }

    @Override
    public void mouseUp() {
        System.out.println("Tagging the canvas with a paint can");
    }
}
