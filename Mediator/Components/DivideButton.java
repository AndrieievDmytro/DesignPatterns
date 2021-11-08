package Components;

import java.awt.event.ActionEvent;

import javax.swing.JButton;

import Interfaces.IComponent;
import Interfaces.IMediator;

public class DivideButton extends JButton implements IComponent {

    IMediator mediator;

    public DivideButton() {
        super("/");
    }

    @Override
    public void setMediator(IMediator mediator) {
        this.mediator = mediator;
    }

    @Override
    protected void fireActionPerformed(ActionEvent event) {
        mediator.divide();
    }

    @Override
    public String getName() {
        return "DivideButton";
    }
}
