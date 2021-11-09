package main

import "fmt"

func main() {

	caretaker := &Caretaker{
		mementoArray: make([]*Memento, 0),
	}

	text := &Text{
		Content: "Initial text",
	}

	fmt.Printf("Initial content: %s\n", text.getContext())
	caretaker.addMemento(text.createSnapshot())

	text.setContext("Second modification")
	fmt.Printf("Text current state: %s\n", text.getContext())
	caretaker.addMemento(text.createSnapshot())

	text.setContext("Third modification")
	fmt.Printf("Text current state: %s\n", text.getContext())
	caretaker.addMemento(text.createSnapshot())

	text.restoreSnapshot(caretaker.getMemento(1))
	fmt.Printf("Restored to the second modification: %s\n", text.getContext())

	text.restoreSnapshot(caretaker.getMemento(0))
	fmt.Printf("Restored to initial context: %s\n", text.getContext())

}
