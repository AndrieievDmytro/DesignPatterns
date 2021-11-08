package Components;

import javax.swing.JTextPane;

import Interfaces.IComponent;
import Interfaces.IMediator;

public class ActionBox extends JTextPane implements IComponent {
    
    private IMediator mediator;

    @Override
    public void setMediator(IMediator mediator) {
        this.mediator = mediator;
    }

    public IMediator getMediator(){
        return this.mediator;
    }

    @Override
    public String getName(){
        return "ActionBox";
    }
    
}
