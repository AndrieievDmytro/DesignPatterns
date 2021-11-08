package Objects;

import java.math.BigDecimal;

public class HandleOperation {
    
    private BigDecimal component1;
    private BigDecimal component2;
    private char performedAction;
    private String result;

    public HandleOperation(HandleOperation handleOperation){
        this.component1 = handleOperation.component1;
        this.component2 = handleOperation.component2;
        this.performedAction = handleOperation.performedAction;
    }

    public HandleOperation(BigDecimal component1, BigDecimal component2, char action){
        this.component1 = component1;
        this.component2 = component2;
        this.performedAction = action;
    }

    public String getResult(){
        return this.result;
    }

    public void getAnswer(){
        switch(this.performedAction){
            case '+' :
                result =  component1.add(component2).toString(); 
                break;
            case '-' :
                result =  component1.subtract(component2).toString();
                break;
            case '/' :
                result = component1.divide(component2).toString();
                break;
            case '*' :
                result =  component1.multiply(component2).toString();
                break;
            // default :
            //     result = new BigDecimal(0).toString();
        }
    }

    @Override
    public String toString() {
        
        return result;
    }
}
