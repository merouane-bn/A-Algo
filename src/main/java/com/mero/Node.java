package com.mero;

class Node {
    public int x, y;
    public boolean walkable;
    public Node parent;
    public int gCost, hCost;

    public Node(int x, int y, boolean walkable) {
        this.x = x;
        this.y = y;
        this.walkable = walkable;
    }

    public int getFCost() {
        return gCost + hCost;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}

