package Components;

import java.awt.event.ActionEvent;
import javax.swing.JButton;
import Interfaces.IComponent;
import Interfaces.IMediator;

public class SubstractButton extends JButton implements IComponent {

    IMediator mediator;

    public SubstractButton(){
        super("-");
    }

    @Override
    public void setMediator(IMediator mediator) {
        this.mediator = mediator;
    }

    @Override
    protected void fireActionPerformed(ActionEvent event) {
        mediator.substract();
    }

    @Override
    public String getName() {
        return "SubstractButton";
    }
}
