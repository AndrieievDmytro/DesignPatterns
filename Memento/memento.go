package main

type Memento struct {
	Content string
}

func (m *Memento) getSavedState() string {
	return m.Content
}
