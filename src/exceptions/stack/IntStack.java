package exceptions.stack;

import exceptions.stack.exceptions.StackEmptyExeption;
import exceptions.stack.exceptions.StackFullException;

public class IntStack {

    private int[] stack;
    private int pointer;

    public IntStack(int maxSize) {
        this.stack = new int[maxSize];
        this.pointer = -1;
    }

    public void push(int value) throws StackFullException {
    if (pointer >= stack.length-1){
        throw new StackFullException("Stack ist bereits voll");
    }
    pointer ++;
    stack[pointer] +=value;
    }
    public int pop()throws StackEmptyExeption{
        if (pointer== -1){
            throw new StackEmptyExeption("Stack ist leer");
        }
        int res = stack[pointer];
        stack[pointer]=0;
        pointer--;
        return res;

    }
}
