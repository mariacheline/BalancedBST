/**
 * Informatica 4ais: Esercitazione 3
 *
 * Realizzare una applicazione java che costruisca un albero binario
 * bilanciato a partire da un array di valori precaricato.
 * L'applicazione deve consentire di navigare nell'albero binario a
 * partire dalla radice dell'albero. Ogni nodo deve avere 4 campi:
 * value, parent, left e right.
 *
 *
 * @author  Maria Cheline Magsano
 * @version 1.0
 */

package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Tree tree = new Tree();
        int nodes[] = new int[]{1, 2, 3, 4, 5, 6, 30, 20, 18, 70};
        Tree.root = tree.formattedArray(nodes, 0, nodes.length - 1);
        int userInput;
        boolean check = false;

        System.out.println("\nOrdered values:");
        tree.preOrder(Tree.root);
        System.out.println("");

        System.out.println("\nPlease choose an action:\n 1. View items on the right edges\n"
                + " 2. View items on the left edges\n"
                + " 3. Go to root\n 4. Exit\n");

        do {
            System.out.print("\nChoose an action: ");
            userInput = in.nextInt();

            switch (userInput) {
                case 1 -> {
                    System.out.println("Items on the right edges:");
                    Tree.root.traverseRigth(Tree.root);
                }
                case 2 -> {
                    System.out.println("Items on the left edges");
                    Tree.root.traverseLeft(Tree.root);
                }
                case 3 ->  System.out.println("You're in the root. Value: " + Tree.root.val);
                case 4 -> {
                    System.out.println("\nThank you and goodbye!\n");
                    System.exit(0);
                }
            }

        } while(!check);
    }
}
