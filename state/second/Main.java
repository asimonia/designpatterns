package state.second;

public class Main {
    public static void main(String[] args) {
        Canvas canvas = new Canvas();
        canvas.setCurrentTool(new PaintcanTool());
        canvas.mouseDown();
        canvas.mouseUp();

        canvas.setCurrentTool(new EyedropTool());
        canvas.mouseDown();
        canvas.mouseUp();

        canvas.setCurrentTool(new EraserTool());
        canvas.mouseDown();
        canvas.mouseUp();
    }
}
