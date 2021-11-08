package Objects;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Color;
import java.math.BigDecimal;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.swing.border.LineBorder;
import Components.ActionBox;
import Components.AddButton;
import Components.DivideButton;
import Components.EqualButton;
import Components.HistoryBox;
import Components.MultiplyButton;
import Components.SubstractButton;
import Interfaces.IComponent;
import Interfaces.IMediator;

public class Calculator implements IMediator{

    private AddButton add;
    private DivideButton div;
    private MultiplyButton mult;
    private EqualButton equl;
    private SubstractButton substr;
    private ActionBox actionBox;
    private HistoryBox historyBox;

    @Override
    public void registerComponent(IComponent component) {
        component.setMediator(this);
        switch (component.getName()) {
            case "AddButton":
                add = (AddButton)component;
                break;
            case "DivideButton":
                div = (DivideButton)component;
                break;
            case "EqualButton":
                equl = (EqualButton)component;
                break;
            case "MultiplyButton":
                mult = (MultiplyButton)component;
                break;
            case "SubstractButton":
                substr = (SubstractButton)component;
                break;
            case "ActionBox":
                actionBox = (ActionBox)component;
                break;
            case "HistoryBox":
                historyBox = (HistoryBox)component;
                break;
        }
    }

    public JPanel setButtonsPanel(int xAxis, int yAxis){
        JPanel buttons = new JPanel();
        buttons.setBorder(new LineBorder(Color.BLACK));
        buttons.setSize(500, 300);
        buttons.setLocation(xAxis,yAxis);
        buttons.setLayout(new BoxLayout(buttons, BoxLayout.PAGE_AXIS));
        JPanel buttonPanel = new JPanel();
        add.setPreferredSize(new Dimension(50, 50));
        buttonPanel.add(add);
        div.setPreferredSize(new Dimension(50, 50));
        buttonPanel.add(div);
        equl.setPreferredSize(new Dimension(100, 100));
        buttonPanel.add(equl);
        mult.setPreferredSize(new Dimension(50, 50));
        buttonPanel.add(mult);
        substr.setPreferredSize(new Dimension(50, 50));
        buttonPanel.add(substr);
        buttonPanel.setLayout(new FlowLayout());
        buttons.add(buttonPanel);
        return buttons;
    }

    public JPanel setTextArea(){
        JPanel textArea = new JPanel();
        textArea.setLayout(null);
        textArea.setSize(250, 50);
        textArea.setLocation(120, 30);
        textArea.setBorder(new LineBorder(Color.BLACK));
        textArea.setLayout(new BoxLayout(textArea, BoxLayout.PAGE_AXIS));
        actionBox.setFont(new Font("Times New Roman", Font.BOLD, 24));
        actionBox.setEditable(true);
        textArea.add(actionBox);
        return textArea;
    }


    public JPanel setHistoryPanel(){
        JPanel historyArea = new JPanel();
        historyBox.setFixedCellWidth(200);
        historyArea.setLayout(null);
        historyArea.setSize(200, 260);
        historyArea.setLocation(500, 0);
        historyArea.setBorder(new LineBorder(Color.BLACK));
        historyArea.setLayout(new BoxLayout(historyArea, BoxLayout.PAGE_AXIS));
        historyArea.add(historyBox); 
        return historyArea;
    }

    @Override
    public void createGUI() {
        int xAxisSize = 700;
        int yAxisSize = 300;
        JFrame calculator = new JFrame("Calculator");
        calculator.setSize(xAxisSize,yAxisSize);
        calculator.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        calculator.getContentPane().add(setButtonsPanel(0, yAxisSize/3 ));
        calculator.getContentPane().add(setTextArea());
        calculator.getContentPane().add(setHistoryPanel());
        calculator.setLayout(null);
        calculator.setResizable(false);
        calculator.setLocationRelativeTo(null);
        calculator.setVisible(true);
    }

    @Override
    public void add() {
        actionBox.setText(actionBox.getText()+"+");
    }

    @Override
    public void substract() {
        actionBox.setText(actionBox.getText()+"-");
    }

    @Override
    public void divide() {
        actionBox.setText(actionBox.getText()+"/");
    }

    @Override
    public void multiply() {
        actionBox.setText(actionBox.getText()+"*");
    }

    @Override
    public void performActions(HandleOperation handleOperation) {
        String r = actionBox.getText();
        String [] arr =  r.split("[^0-9]");
        int firstNum = Integer.parseInt(arr[0]);
        int secondNum = Integer.parseInt(arr[1]);
        String action = r.replaceAll("[^+,/,*,-]", "");
        HandleOperation result = new HandleOperation(new BigDecimal(firstNum), new BigDecimal(secondNum), action.charAt(0));
        result.getAnswer();
        actionBox.setText(result.getResult());
        historyBox.addElement(new Record(String.valueOf(firstNum) + " " + action + " " + String.valueOf(secondNum) + " = " + result.getResult()));
    }
}
