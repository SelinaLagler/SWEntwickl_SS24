package exceptions.stack;

import exceptions.stack.exceptions.StackEmptyExeption;
import exceptions.stack.exceptions.StackFullException;

public class IntStackDemo {
    public static void main(String[] args) throws StackEmptyExeption,StackFullException {
        IntStack stack = new IntStack(2);
        try {
            //stack.pop();
            stack.push(4);
            stack.push(2);
            stack.pop();

            stack.pop();
        } catch (StackEmptyExeption | StackFullException e) {
            throw new RuntimeException(e);
        }
    }
}
