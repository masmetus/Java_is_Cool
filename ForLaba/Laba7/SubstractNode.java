package Laba7;

import java.util.Collection;

public class SubstractNode implements AbstractNode {
    private final Collection<AbstractNode> List;

    public SubstractNode(Collection<AbstractNode> List) {
        this.List = List;
    }
    public int calculate() {
        int result = 0;
        boolean first = true;
        for (AbstractNode node:List){
            if (first) {
                result=node.calculate();
                first=false;
            } else {
                result-=node.calculate();
            }
        }
        return result;
    }
    public String toString() {
        String result = "";
        boolean first = true;
        for (AbstractNode node:List){
            if (!first) result+="-";
            first=false;
            result+=node;
        }
        return result;
    }
}
