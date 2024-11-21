package com.mero;

import java.util.Scanner;

public class AStarTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Demander les dimensions de la grille
        System.out.print("Entrez le nombre de lignes : ");
        int rows = scanner.nextInt();
        System.out.print("Entrez le nombre de colonnes : ");
        int cols = scanner.nextInt();

        // Créer la grille
        Grid grid = new Grid(rows, cols);

        // 2. Demander les coordonnées des obstacles
        System.out.println("Combien d'obstacles souhaitez-vous ajouter ? ");
        int obstaclesCount = scanner.nextInt();

        System.out.println("Entrez les coordonnées des obstacles (ligne colonne) :");
        for (int i = 0; i < obstaclesCount; i++) {
            System.out.print("Obstacle " + (i + 1) + " : ");
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            grid.setNode(x, y, false); // Rendre le nœud non walkable
        }

        // 3. Demander le point de départ
        System.out.println("Entrez les coordonnées du point de départ (ligne colonne) : ");
        int startX = scanner.nextInt();
        int startY = scanner.nextInt();
        Node start = grid.getNode(startX, startY);

        // 4. Demander le point de destination
        System.out.println("Entrez les coordonnées du point de destination (ligne colonne) : ");
        int endX = scanner.nextInt();
        int endY = scanner.nextInt();
        Node end = grid.getNode(endX, endY);

        // 5. Vérifier si le point de départ ou la destination est un obstacle
        if (!start.walkable || !end.walkable) {
            System.out.println("Erreur : Le point de départ ou la destination est un obstacle.");
            return;
        }

        // 6. Exécuter l'algorithme A*
        AStarAlgorithm aStar = new AStarAlgorithm();
        aStar.aStar(start, end, grid);

        // 7. Afficher le résultat
        System.out.println("Test terminé.");
    }
}
