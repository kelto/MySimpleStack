package dcll.kelt.mysimplestack;

import org.mockito.Matchers;

/**
 * Created by 21406548 on 23/02/2015.
 */
public class Item extends Matchers{

    private int value;

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue()
    {
        return this.value;
    }
}
