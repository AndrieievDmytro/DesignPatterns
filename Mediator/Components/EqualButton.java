package Components;

import java.awt.event.ActionEvent;
import javax.swing.JButton;
import Interfaces.IComponent;
import Interfaces.IMediator;
import Objects.HandleOperation;

public class EqualButton extends JButton implements IComponent{

    private IMediator mediator;
    private HandleOperation result;

    public EqualButton(){
        super("=");
    }

    public EqualButton(HandleOperation result){
        this.result = result;
    }

    @Override
    public void setMediator(IMediator mediator) {
        this.mediator = mediator;
    }

    @Override
    protected void fireActionPerformed(ActionEvent event) {
        mediator.performActions(result);
    }

    @Override
    public String getName() {
        return "EqualButton";
    }
}
