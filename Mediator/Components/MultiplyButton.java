package Components;

import java.awt.event.ActionEvent;

import javax.swing.JButton;

import Interfaces.IComponent;
import Interfaces.IMediator;

public class MultiplyButton extends JButton implements IComponent {

    private IMediator mediator;

    public MultiplyButton(){
        super("x");
    }

    @Override
    public void setMediator(IMediator mediator) {
        this.mediator = mediator;
    }

    @Override
    protected void fireActionPerformed(ActionEvent event) {
        mediator.multiply();
    }

    @Override
    public String getName() {
        return "MultiplyButton";
    }
}
