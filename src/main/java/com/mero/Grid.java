package com.mero;

import java.util.ArrayList;
import java.util.List;
class Grid {
    private Node[][] grid;

    public Grid(int width, int height) {
        grid = new Node[width][height];
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                grid[x][y] = new Node(x, y, true); // Tous les nœuds sont walkable par défaut
            }
        }
    }

    public void setNode(int x, int y, boolean walkable) {
        if (x >= 0 && x < grid.length && y >= 0 && y < grid[0].length) {
            grid[x][y].walkable = walkable;
        } else {
            throw new IllegalArgumentException("Coordonnées hors limites : (" + x + ", " + y + ")");
        }
    }

    public Node getNode(int x, int y) {
        if (x >= 0 && x < grid.length && y >= 0 && y < grid[0].length) {
            return grid[x][y];
        }
        throw new IllegalArgumentException("Coordonnées hors limites : (" + x + ", " + y + ")");
    }

    public List<Node> getNeighbors(Node node) {
        List<Node> neighbors = new ArrayList<>();
        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}}; // 4 directions cardinales

        for (int[] dir : directions) {
            int newX = node.x + dir[0];
            int newY = node.y + dir[1];

            if (newX >= 0 && newX < grid.length && newY >= 0 && newY < grid[0].length) {
                Node neighbor = grid[newX][newY];
                if (neighbor.walkable) {
                    neighbors.add(neighbor);
                }
            }
        }
        return neighbors;
    }
}
