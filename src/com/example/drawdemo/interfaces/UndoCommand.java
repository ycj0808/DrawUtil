package com.example.drawdemo.interfaces;

public interface UndoCommand {
    public void undo();
    public void redo();
    public boolean canUndo();
    public boolean canRedo();
}
