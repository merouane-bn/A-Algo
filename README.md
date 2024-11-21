# A* Pathfinding Algorithm

## Description

Ce projet implémente l'algorithme A* pour la recherche de chemin dans une grille. L'utilisateur peut définir la taille de la grille, les obstacles, ainsi que le point de départ et le point de destination. L'algorithme A* utilise la distance de Manhattan pour estimer le coût heuristique et trouve le chemin le plus court entre le point de départ et la destination, en évitant les obstacles.

## Fonctionnalités

- Saisie interactive de la taille de la grille (lignes et colonnes).
- Saisie interactive des obstacles à placer sur la grille.
- Saisie interactive du point de départ et du point de destination.
- Vérification si le point de départ ou la destination est un obstacle.
- Exécution de l'algorithme A* pour trouver le chemin le plus court.
- Affichage du chemin trouvé ou d'un message d'erreur si aucun chemin n'est possible.

## Installation

1. Clonez ce projet sur votre machine locale.
   ```bash
   git clone https://github.com/merouane-bn/A-Algo.git
   ```

2. Assurez-vous d'avoir installé [Java 8 ou supérieur](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) sur votre machine.

3. Ouvrez le projet dans votre IDE préféré (par exemple, IntelliJ IDEA ou Eclipse).

4. Compilez et exécutez le projet.

## Utilisation

1. Exécutez la classe `AStarTest` dans votre IDE.
2. L'application vous demandera de saisir les informations suivantes :

    - Le nombre de lignes et de colonnes de la grille.
    - Le nombre d'obstacles et leurs coordonnées (lignes, colonnes).
    - Les coordonnées du point de départ et du point de destination.

3. L'algorithme A* va alors être exécuté et le chemin le plus court sera affiché (si un chemin existe).

### Exemple d'exécution

**Entrée de l'utilisateur :**
```
Entrez le nombre de lignes : 5
Entrez le nombre de colonnes : 5
Combien d'obstacles souhaitez-vous ajouter ? 
4
Entrez les coordonnées des obstacles (ligne colonne) :
Obstacle 1 : 1 1
Obstacle 2 : 1 2
Obstacle 3 : 2 2
Obstacle 4 : 3 2
Entrez les coordonnées du point de départ (ligne colonne) : 
0 0
Entrez les coordonnées du point de destination (ligne colonne) : 
4 4
```

**Sortie de l'algorithme A* :**
```
Path found: [(0,0), (0,1), (0,2), (0,3), (1,3), (2,3), (3,3), (4,3), (4,4)]
Test terminé.
```

### Scénario d'erreur

Si le point de départ ou de destination est un obstacle, le programme affichera un message d'erreur :

**Entrée de l'utilisateur :**
```
Entrez le nombre de lignes : 5
Entrez le nombre de colonnes : 5
Combien d'obstacles souhaitez-vous ajouter ? 
4
Entrez les coordonnées des obstacles (ligne colonne) :
Obstacle 1 : 1 1
Obstacle 2 : 1 2
Obstacle 3 : 2 2
Obstacle 4 : 3 2
Entrez les coordonnées du point de départ (ligne colonne) : 
1 1
Entrez les coordonnées du point de destination (ligne colonne) : 
4 4
```

**Sortie de l'algorithme A* :**
```
Erreur : Le point de départ ou la destination est un obstacle.
```

## Structure du projet

- `AStarAlgorithm.java` : Implémentation de l'algorithme A*.
- `AStarTest.java` : Classe principale pour tester l'algorithme A* avec saisie utilisateur.
- `Node.java` : Représente un nœud dans la grille (avec les propriétés `x`, `y`, `walkable`, `gCost`, `hCost`, etc.).
- `Grid.java` : Représente la grille et contient les méthodes pour définir des nœuds et récupérer les voisins.

## Contribuer

Si vous souhaitez contribuer à ce projet, veuillez forker ce dépôt, créer une branche, effectuer vos modifications et soumettre une pull request.

## License

Ce projet est sous la licence MIT. Voir le fichier [LICENSE](LICENSE) pour plus d'informations.
```
