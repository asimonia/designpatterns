package state.first;

public class Canvas {

    private ToolType currentTool;

    void mouseDown() {
        if (currentTool == ToolType.PAINTCAN)
            System.out.println("Selected the paint can!");
        else if (currentTool == ToolType.EYEDROP)
            System.out.println("Selected the eyedrop!");
        else if (currentTool == ToolType.ERASER)
            System.out.println("Selected the eraser!");
    }

    void mouseUp() {
        if (currentTool == ToolType.PAINTCAN)
            System.out.println("Tagging the canvas with a paint can");
        else if (currentTool == ToolType.EYEDROP)
            System.out.println("Filling the canvas with some blue");
        else if (currentTool == ToolType.ERASER)
            System.out.println("Erasing something");
    }

    public ToolType getCurrentTool() {
        return currentTool;
    }

    public void setCurrentTool(ToolType currentTool) {
        this.currentTool = currentTool;
    }
}
