class IteradorListaBasica implements Iterador<T> {
    private int index;

    public IteradorListaBasica() {
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < lista.getNumElements();
    }

    @Override
    public T next() {
        return lista.getElements(index++);
    }

    @Override
    public void delete() {
        if (index > 0 && index <= getNumElements()) {
            ListaBasica.this.delete(elements[index - 1]);
            index--;
        }

    }}