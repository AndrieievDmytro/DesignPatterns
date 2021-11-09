package main

type Text struct {
	Content string
}

func (t *Text) createSnapshot() *Memento {
	return &Memento{Content: t.Content}
}

func (t *Text) restoreSnapshot(m *Memento) {
	t.Content = m.getSavedState()
}

func (t *Text) setContext(content string) {
	t.Content = content
}

func (t *Text) getContext() string {
	return t.Content
}
