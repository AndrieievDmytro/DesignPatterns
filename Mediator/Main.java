import javax.swing.DefaultListModel;

import Components.ActionBox;
import Components.AddButton;
import Components.DivideButton;
import Components.EqualButton;
import Components.HistoryBox;
import Components.MultiplyButton;
import Components.SubstractButton;
import Interfaces.IMediator;
import Objects.Calculator;

public class Main {

    public static void main(String[] args) {
        IMediator mediator = new Calculator();
        mediator.registerComponent(new AddButton());
        mediator.registerComponent(new DivideButton());
        mediator.registerComponent(new EqualButton());
        mediator.registerComponent(new MultiplyButton());
        mediator.registerComponent(new SubstractButton());
        mediator.registerComponent(new ActionBox());
        mediator.registerComponent(new HistoryBox(new DefaultListModel<>()));
        mediator.createGUI();
    }
}