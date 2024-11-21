package com.mero;

import java.util.*;

public class AStarAlgorithm {
    public void aStar(Node start, Node end, Grid grid) {
        if (start == null || end == null) {
            throw new IllegalArgumentException("Les nœuds de départ ou de fin sont null !");
        }

        PriorityQueue<Node> open = new PriorityQueue<>(Comparator.comparingInt(Node::getFCost));
        Set<Node> closed = new HashSet<>();

        open.add(start);

        while (!open.isEmpty()) {
            Node current = open.poll();
            closed.add(current);

            if (current == end) {
                reconstructPath(end);
                return;
            }

            for (Node neighbor : grid.getNeighbors(current)) {
                if (closed.contains(neighbor)) continue;

                int tentativeGCost = current.gCost + 1; // Coût uniforme
                if (!open.contains(neighbor) || tentativeGCost < neighbor.gCost) {
                    neighbor.gCost = tentativeGCost;
                    neighbor.hCost = calculateHeuristic(neighbor, end);
                    neighbor.parent = current;

                    if (!open.contains(neighbor)) {
                        open.add(neighbor);
                    }
                }
            }
        }

        System.out.println("Chemin introuvable.");
    }

    private int calculateHeuristic(Node a, Node b) {
        // Calculer la distance de Manhattan pour les grilles
        return Math.abs(a.x - b.x) + Math.abs(a.y - b.y);
    }

    private void reconstructPath(Node end) {
        List<Node> path = new ArrayList<>();
        Node current = end;

        while (current != null) {
            path.add(current);
            current = current.parent;
        }

        Collections.reverse(path); // Inverser la liste pour obtenir le chemin dans le bon ordre
        System.out.println("Path found: " + path);
    }
}
