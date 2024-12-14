import java.util.Scanner;

public class tictac {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        String nomJUn;
        String nomJDeux;
        String[][] board;
        String choixJUn;
        String choixJDeux;
        int tourJUn;
        int tourJDeux;
        String reset;
        boolean winner;
        int positionColone;
        int positionLigne;
        do {
            System.out.print("J1: Veuillez saisir votre nom : ");
            nomJUn = clavier.nextLine().toUpperCase();
            System.out.print("J2: Veuillez saisir votre nom : ");
            nomJDeux = clavier.nextLine().toUpperCase();
            System.out.print(nomJUn + " Veuillez choisir votre signe (0/X) : ");
            choixJUn = clavier.nextLine().toUpperCase();
            System.out.print(nomJDeux + " Veuillez choisir votre signe (0/X) : ");
            choixJDeux = clavier.nextLine().toUpperCase();
            while (choixJUn.equals(choixJDeux)) {
                System.out.println("Vous ne pouvez pas avoir le meme signe veuillez rechoisir");
                System.out.print(nomJUn + "  Veuillez choisir votre signe (0/X)");
                choixJUn = clavier.nextLine();
                System.out.print(nomJDeux + " Veuillez choisir votre signe (0/X)");
                choixJDeux = clavier.nextLine();
            }
            System.out.println(nomJUn + " Votre signe est : " + choixJUn);
            System.out.println(nomJDeux + " Votre signe est : " + choixJDeux);
            board = new String[3][3];
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    board[i][j] = "_";
                }
            }
            Tableau(board);
            tourJUn = 0;
            tourJDeux = 0;

            winner = false;
            while (!winner) {
                if (tourJUn <= tourJDeux) {// tour du Joueur 1

                    System.out.print(nomJUn + " Ou voulez vous poser votre signe : ");
                    System.out.println("ligne(0,1,2) : ");
                    positionLigne = clavier.nextInt();
                    System.out.println("colonne(0,1;2) : ");
                    positionColone = clavier.nextInt();
                    clavier.nextLine();

                    while (board[positionLigne][positionColone].equals(choixJUn) || board[positionLigne][positionColone].equals(choixJDeux)) {
                        System.out.println("La case est deja occupé veuillez choisir une autre case ");
                        System.out.print(nomJUn + " Ou voulez vous poser votre signe : ");
                        System.out.println("ligne(0,1,2) : ");
                        positionLigne = clavier.nextInt();
                        System.out.println("colonne(0,1;2) : ");
                        positionColone = clavier.nextInt();
                        clavier.nextLine();
                    }

                    board[positionLigne][positionColone] = choixJUn;
                    Tableau(board);
                    tourJUn += 1;


                }
                else{//tour Joueur 2 (tourJDeux < tourJUn)

                    System.out.println(nomJDeux + " Ou voulez vous poser votre signe : ");
                    System.out.println("ligne(0,1,2) : ");
                    positionLigne = clavier.nextInt();
                    System.out.println("colonne(0,1;2) : ");
                    positionColone = clavier.nextInt();
                    clavier.nextLine();

                    while (board[positionLigne][positionColone].equals(choixJUn) || board[positionLigne][positionColone].equals(choixJDeux)) {
                        System.out.println("La case est deja occupé veuillez choisir une autre case ");
                        System.out.println("ligne(0,1,2) : ");
                        positionLigne = clavier.nextInt();
                        System.out.println("colonne(0,1;2) : ");
                        positionColone = clavier.nextInt();
                        clavier.nextLine();
                    }
                    board[positionLigne][positionColone] = choixJDeux;
                    Tableau(board);
                    tourJDeux += 1;

                }
                winner = victoire(board,choixJUn,nomJUn) || victoire(board,choixJDeux,nomJDeux);
            }
                System.out.println("Voulez vous rejouer (o/n): ");
                reset = clavier.nextLine();
                if (reset.equals("non") || reset.equals("n")) {
                    break;
                }

        }while (reset.equals("o") || reset.equals("oui")) ;

    }

    public static void Tableau (String[][]board) {
        System.out.println(board[0][0] + " " + board[0][1] + " " + board[0][2]);
        System.out.println(board[1][0] + " " + board[1][1] + " " + board[1][2]);
        System.out.println(board[2][0] + " " + board[2][1] + " " + board[2][2]);
    }
    public static boolean victoire (String[][]board, String choix, String nom) {
        // Vérification des lignes, colonnes et diagonales
        for (int i = 0; i < 3; i++) {
            if ((board[i][0].equals(choix) && board[i][1].equals(choix) && board[i][2].equals(choix)) ||  // lignes
                    (board[0][i].equals(choix) && board[1][i].equals(choix) && board[2][i].equals(choix))) { // colonnes
                System.out.println("Bravo " + nom + " Vous avez gagné !");
                return true;
            }
        }
        if ((board[0][0].equals(choix) && board[1][1].equals(choix) && board[2][2].equals(choix)) ||  // diagonale 1
                (board[0][2].equals(choix) && board[1][1].equals(choix) && board[2][0].equals(choix))) { // diagonale 2
            System.out.println("Bravo " + nom + " Vous avez gagné !");
            return true;
        }
        return false;
    }
}
