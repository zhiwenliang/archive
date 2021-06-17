package structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 通过将对象向不同节点的拓展，形成一种树形结构来进行不同层次的组合，类似于xml的树形结构
 */
public class Demo {
    public static void main(String[] args) {
        Node root = new Node("root");
        Node level1A = new Node("level1A");
        Node level1B = new Node("level1B");
        Node level2A = new Node("level2A");
        Node level2B = new Node("level2B");
        root.addNode(level1A.addNode(level2A).addNode(level2B));
        root.addNode(level1B);
    }
}

/**
 * 对象中的自我扩展方法 addNode() 是关键。
 */
class Node {
    private String name;
    private List<Node> childrenNode = new ArrayList<>();

    public Node(String name) {
        this.name = name;
    }

    public Node addNode(Node node) {
        childrenNode.add(node);
        return this;
    }
}

