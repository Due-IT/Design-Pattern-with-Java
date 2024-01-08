package trees;

import java.awt.*;

public class Tree {
    /*
    생성후 변경할 수 없도록 속성은 private로 정의
     */
    private int x;
    private int y;
    private TreeType type; //참조를 이용해 공유 상태 저장

    public Tree(int x, int y, TreeType type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public void draw(Graphics g) {
        type.draw(g, x, y);
    }
}
