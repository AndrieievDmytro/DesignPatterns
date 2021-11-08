package Interfaces;

import Objects.HandleOperation;

public interface IMediator {
    void registerComponent(IComponent component);
    void createGUI();
    void add();
    void substract();
    void divide();
    void multiply();
    void performActions(HandleOperation handleOperation); 
}
