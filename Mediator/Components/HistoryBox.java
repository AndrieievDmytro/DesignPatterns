package Components;

import javax.swing.DefaultListModel;
import javax.swing.JList;

import Interfaces.IComponent;
import Interfaces.IMediator;
import Objects.Record;

public class HistoryBox extends JList<Record> implements IComponent {

    private IMediator mediator;
    private final DefaultListModel<Record> _listModel; 

    public HistoryBox(DefaultListModel<Record> listModel){
        super(listModel);
        _listModel = listModel;

    }

    public IMediator getMediator(){
        return this.mediator;
    }

    public void addElement(Record results) {
        _listModel.addElement(results);
        int index = _listModel.size() - 1;
        setSelectedIndex(index);
        ensureIndexIsVisible(index);
    }

    public Record getCurrentElement() {
        return (Record)getSelectedValue();
    }

    @Override
    public void setMediator(IMediator mediator) {
        this.mediator = mediator;
    }    

    @Override
    public String getName() {
        return "HistoryBox";
    }
}
