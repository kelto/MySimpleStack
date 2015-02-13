package dcll.kelt.mysimplestack;

import java.util.ArrayList;

/**
 * Created by 21406548 on 13/02/2015.
 */
public class MySimpleStack<Item> implements SimpleStack<Item> {

    private ArrayList<Item> list;

    public MySimpleStack()
    {
        this.list = new ArrayList<Item>();
    }
    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public int getSize() {
        return list.size();
    }

    @Override
    public void push(Item item) {
        list.add(item);
    }

    @Override
    public Item peek() throws EmptyStackException {
        if(getSize()==0)
            throw new EmptyStackException();
        return list.get(list.size()-1);
    }

    @Override
    public Item pop() throws EmptyStackException {
        Item last = peek();
        list.remove(list.size()-1);
        return last;
    }
}
