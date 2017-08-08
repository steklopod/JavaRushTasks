package com.javarush.task.task32.task3209.listeners;

import com.javarush.task.task32.task3209.View;

import javax.swing.*;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

/**
 * Created by Asus on 024 24.07.17.
 */
public class UndoMenuListener implements MenuListener {
    private View view;
    private JMenuItem undoMenuItem;
    private JMenuItem redoMenuItem;

    boolean canUndo = false;


    public UndoMenuListener(View view, JMenuItem undoMenuItem, JMenuItem redoMenuItem){
        this.view = view;
        this.undoMenuItem = undoMenuItem;
        this.redoMenuItem = redoMenuItem;
    }


    @Override
    public void menuSelected(MenuEvent menuEvent) {
        boolean canUndo = view.canUndo();
        boolean canRedo = view.canRedo();
        if (canUndo){
            undoMenuItem.setEnabled(true);
        } else {
            undoMenuItem.setEnabled(false);
        }

        if (canRedo){
            redoMenuItem.setEnabled(true);
        } else {
            redoMenuItem.setEnabled(false);
        }
    }

    @Override
    public void menuDeselected(MenuEvent e) {

    }

    @Override
    public void menuCanceled(MenuEvent e) {

    }
}
