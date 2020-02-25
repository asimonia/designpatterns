package state.first;

public class Main {
    public static void main(String[] args) {
        Canvas canvas = new Canvas();
        canvas.setCurrentTool(ToolType.PAINTCAN);
        canvas.mouseDown();
        canvas.mouseUp();

        canvas.setCurrentTool(ToolType.EYEDROP);
        canvas.mouseDown();
        canvas.mouseUp();

        canvas.setCurrentTool(ToolType.ERASER);
        canvas.mouseDown();
        canvas.mouseUp();

    }
}
