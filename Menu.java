import java.util.*;
import java.io.*;

public class Menu <T> 
{
    T option;

    public Menu(T option)
    {
        this.option = option;
    }

    public T ret()
    {
        return this.option;
    }

}
