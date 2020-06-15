package Laba7;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        AbstractNode operation1 = new MultNode(Arrays.<AbstractNode>asList(
                new SubstractNode(Arrays.<AbstractNode>asList(new SimpleNode(5), new SimpleNode(5))),
                new SubstractNode(Arrays.<AbstractNode>asList(new SimpleNode(3), new SimpleNode(1))),
                new SimpleNode(2), new SimpleNode(3)));

        AbstractNode operation2 = new MultNode(Arrays.<AbstractNode>asList(
                new SubstractNode(Arrays.<AbstractNode>asList(new SimpleNode(5), new SimpleNode(3))),
                new SubstractNode(Arrays.<AbstractNode>asList(new SimpleNode(3), new SimpleNode(2))),
                new SimpleNode(2), new SimpleNode(3)));

        System.out.println("Пример 1: " + operation1.toString() + " = " + operation1.calculate());
        System.out.println("Пример 2: " + operation2.toString() + " = " + operation2.calculate());
    }
}
