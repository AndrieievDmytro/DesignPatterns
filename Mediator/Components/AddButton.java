package Components;

import java.awt.event.ActionEvent;

import javax.swing.JButton;
import Interfaces.IComponent;
import Interfaces.IMediator;

public class AddButton extends JButton implements IComponent{

    private IMediator mediator;

    public AddButton() {
        super("+");
    }

    @Override
    public void setMediator(IMediator mediator) {
        this.mediator = mediator;        
    }
    
    @Override
    protected void fireActionPerformed(ActionEvent event) {
        mediator.add();
    }    

    @Override
    public String getName() {
        return "AddButton";
    }
}
