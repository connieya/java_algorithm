# Tree 말단 노드까지의 가장 짧은 경로 (BFS)

아래 그림과 같은 이진트리에서 루트 노드 1에서 말단노드까지의 길이 중 가장 짧은 길이를
구하는 프로그램을 작성하세요
각 경로의 길이는 루트노드에서 말단노드까지 가는데 이동하는 횟수를 즉 간선의 개수를 길이로 하겠습니다.

![img_4.png](img_4.png)

가장 짧은 길이는 3번 노드까지의 길이인 1이다.

※ Queue 에서 꺼내고 난 뒤 Queue 의 길이만큼 for문 돌아야 정확한 레벨을 구할 수 있다.

이해가 안되면 직접 Queue 그림을 그려보자.

```java

class Node1 {
    int data;
    Node1 lt, rt;

    public Node1(int data) {
        this.data = data;
        lt = rt = null;
    }
}

public class Tree_BFS {
    Node1 root;

    public int BFS(Node1 root) {
        Queue<Node1> queue = new LinkedList<>();
        queue.offer(root);
        int L = 0;
        while (!queue.isEmpty()) {
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                Node1 currentNode = queue.poll();
                if (currentNode.lt == null && currentNode.rt == null) {
                    return L;
                }
                if (currentNode.lt != null) {
                    queue.offer(currentNode.lt);
                }
                if (currentNode.rt != null) {
                    queue.offer(currentNode.rt);
                }
            }
            L++;

        }
        return L;

    }

    public static void main(String[] args) {
        Tree_BFS tree = new Tree_BFS();
        tree.root = new Node1(1);
        tree.root.lt = new Node1(2);
        tree.root.rt = new Node1(3);
        tree.root.lt.lt = new Node1(4);
        tree.root.lt.rt = new Node1(5);
        System.out.println(tree.BFS(tree.root));
    }
}

```