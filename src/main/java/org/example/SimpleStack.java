package org.example;

import java.util.ArrayList;

public class SimpleStack implements Stack {
    public ArrayList<Item> ListItem; {
        ListItem = new ArrayList<Item>();
    }

    /**
     * Tests if this stack is empty
     */
    @Override
    public boolean isEmpty() {
        if(!ListItem.isEmpty()) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * Returns the number of items in this stack.
     */
    @Override
    public int getSize() {
        return ListItem.size();
    }

    /**
     * Pushes an item onto the top of this stack.
     * null item is allowed.
     *
     * @param item an item of the stack
     */
    @Override
    public void push(Item item) {
        ListItem.add(0, item);
    }

    /**
     * Looks at the object at the top of this stack without removing it from the stack.
     */
    @Override
    public Item peek() throws EmptyStackException {
        if (isEmpty()) {
            throw new EmptyStackException(); // Lancer l'exception si la pile est vide
        }
        return ListItem.get(0);
    }

    /**
     * Removes the object at the top of this stack and returns
     * that object as the value of this function.
     *
     * @throws EmptyStackException if this stack is empty.
     */
    @Override
    public Item pop() throws EmptyStackException {
        if (isEmpty()) {
            throw new EmptyStackException(); // Lancer l'exception si la pile est vide
        }
        return ListItem.remove(0); // Retirer l'élément du sommet de la pile
    }
}
