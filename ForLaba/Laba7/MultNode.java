package Laba7;

import java.util.Collection;

public class MultNode implements AbstractNode {
    private final Collection<AbstractNode> List;
    public MultNode(Collection<AbstractNode> List) {
        this.List=List;
    }
    public int calculate() {
        int result = 1;
        for (AbstractNode node: List) {
            result*=node.calculate();
            if (result==0) break;
        }
        return result;
    }

    public String toString() {
        String result = "";
        boolean first = true;
        for (AbstractNode node:List){
            if(!first) result += "*";
            first=false;
            result+= "(" + node +")";
        }
        return result;
    }
}
