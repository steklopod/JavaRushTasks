package src.actions;

import HTML.src.View;
import javax.swing.*;
import java.awt.event.ActionEvent;

public class RedoAction extends AbstractAction {
    private View view;

    public RedoAction(View view){
        this.view = view;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
    view.redo();
    }
}
