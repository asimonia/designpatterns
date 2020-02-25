package state.second;

class Canvas {

    private Tool currentTool;

    void mouseDown() {
        currentTool.mouseDown();
    }

    void mouseUp() {
        currentTool.mouseUp();
    }

    void setCurrentTool(Tool currentTool) {
        this.currentTool = currentTool;
    }
}
