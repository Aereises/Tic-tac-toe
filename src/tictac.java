import java.util.Scanner;

public class tictac {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        String nomJUn;
        String nomJDeux;
        String [][] board;
        String choixJUn; String choixJDeux;
        int tourJUn; int tourJDeux;
        String reset;
        int positionColone;
        int positionLigne;
        String confirmation;
        do{
            System.out.print("J1: Veuillez saisir votre nom : ");
            nomJUn = clavier.nextLine().toUpperCase();
            System.out.print("J2: Veuillez saisir votre nom : ");
            nomJDeux = clavier.nextLine().toUpperCase();
            System.out.print(nomJUn+" Veuillez choisir votre signe (0/X) : ");
            choixJUn = clavier.nextLine().toUpperCase();
            System.out.print(nomJDeux+" Veuillez choisir votre signe (0/X) : ");
            choixJDeux = clavier.nextLine().toUpperCase();
            while(choixJUn.equals(choixJDeux)){
                System.out.println("Vous ne pouvez pas avoir le meme signe veuillez rechoisir");
                System.out.print(nomJUn+"  Veuillez choisir votre signe (0/X)");
                choixJUn = clavier.nextLine();
                System.out.print(nomJDeux+" Veuillez choisir votre signe (0/X)");
                choixJDeux = clavier.nextLine();
            }
            boolean winner=false;
            System.out.println(nomJUn+" Votre signe est : "+choixJUn);
            System.out.println(nomJDeux+" Votre signe est : "+choixJDeux);
            board = new String[3][3];
            for(int i=0; i<3; i++){
                for(int j=0; j<3; j++){
                    board[i][j] ="_";
                }
            }
            System.out.println(board[0][0]+" "+board[0][1]+" "+board[0][2]);
            System.out.println(board[1][0]+" "+board[1][1]+" "+board[1][2]);
            System.out.println(board[2][0]+" "+board[2][1]+" "+board[2][2]);
            tourJUn = 0;
            tourJDeux = 0;
            do{
                if (tourJUn < tourJDeux || tourJUn == 0) {
                    do {
                        System.out.print(nomJUn + " Ou voulez vous poser votre signe : ");
                        System.out.println("colonne(0,1,2) : ");
                        positionColone = clavier.nextInt();
                        System.out.println("ligne(0,1;2) : ");
                        positionLigne = clavier.nextInt();
                        System.out.print("Etes vous sur de votre choix ? (o/n): ");
                        confirmation = clavier.nextLine();
                    } while (confirmation.equals("n") || confirmation.equals("non"));
                    board[positionColone][positionLigne] = choixJUn;
                    System.out.println(board[0][0] + " " + board[0][1] + " " + board[0][2]);
                    System.out.println(board[1][0] + " " + board[1][1] + " " + board[1][2]);
                    System.out.println(board[2][0] + " " + board[2][1] + " " + board[2][2]);
                    tourJUn += 1;
                }
                //tour Joueur 2
                if (tourJDeux < tourJUn || tourJDeux == 0) {
                    do{
                        System.out.println(nomJDeux + " Ou voulez vous poser votre signe : ");
                        System.out.println("colonne(0,1,2) : " );
                        positionColone = clavier.nextInt();
                        System.out.println("ligne(0,1;2) : ");
                        positionLigne = clavier.nextInt();
                        System.out.print("Etes vous sur de votre choix ? (o/n): ");
                        confirmation = clavier.nextLine();
                    }while(confirmation.equals("n") || confirmation.equals("non"));
                    board[positionColone][positionLigne] = choixJDeux;
                    System.out.println(board[0][0] + " " + board[0][1] + " " + board[0][2]);
                    System.out.println(board[1][0] + " " + board[1][1] + " " + board[1][2]);
                    System.out.println(board[2][0] + " " + board[2][1] + " " + board[2][2]);
                    tourJDeux += 1;
                }
                if (board[0][0].equals("0") && board[0][1].equals("0") && board[0][2].equals("0")) {//ligne 1
                    System.out.println("Bravo " + nomJUn + " Vous avez gagné ");
                    winner=true;
                } else if (board[1][0].equals("0") && board[1][1].equals("0") && board[1][2].equals("0")) {//ligne 2
                    System.out.println("Bravo " + nomJUn + " Vous avez gagné ");
                    winner=true;
                } else if (board[2][0].equals("0") && board[2][1].equals("0") && board[2][2].equals("0")) {//ligne 3
                    System.out.println("Bravo " + nomJUn + " Vous avez gagné ");
                    winner=true;
                } else if (board[0][0].equals("0") && board[1][0].equals("0") && board[2][0].equals("0")) {//colonne 1
                    System.out.println("Bravo " + nomJUn + " Vous avez gagné ");
                    winner=true;
                }else if (board[1][0].equals("0") && board[1][1].equals("0") && board[2][1].equals("0")) {//colonne 2
                    System.out.println("Bravo " + nomJUn + " Vous avez gagné ");
                    winner=true;
                }else if (board[0][2].equals("0") && board[1][2].equals("0") && board[2][2].equals("0")) {//colonne 3
                    System.out.println("Bravo " + nomJUn + " Vous avez gagné ");
                    winner=true;
                }else if (board[0][0].equals("0") && board[1][1].equals("0") && board[2][2].equals("0")) {//diagonale 1
                    System.out.println("Bravo " + nomJUn + " Vous avez gagné ");
                    winner=true;
                }else if (board[0][2].equals("0") && board[1][1].equals("0") && board[2][0].equals("0")) {//diagonale 1
                    System.out.println("Bravo " + nomJUn + " Vous avez gagné ");
                    winner=true;
                }
                else if (board[0][0].equals("X") && board[0][1].equals("X") && board[0][2].equals("X")) {//ligne 1
                    System.out.println("Bravo " + nomJDeux+ " Vous avez gagné ");
                    winner=true;
                } else if (board[1][0].equals("X") && board[1][1].equals("X") && board[1][2].equals("X")) {//ligne 2
                    System.out.println("Bravo " + nomJDeux + " Vous avez gagné ");
                    winner=true;
                } else if (board[2][0].equals("X") && board[2][1].equals("X") && board[2][2].equals("X")) {//ligne 3
                    System.out.println("Bravo " + nomJDeux + " Vous avez gagné ");
                    winner=true;
                } else if (board[0][0].equals("X") && board[1][0].equals("X") && board[2][0].equals("X")) {//colonne 1
                    System.out.println("Bravo " + nomJDeux + " Vous avez gagné ");
                    winner=true;
                }else if (board[1][0].equals("X") && board[1][1].equals("X") && board[2][1].equals("X")) {//colonne 2
                    System.out.println("Bravo " + nomJDeux + " Vous avez gagné ");
                    winner=true;
                }else if (board[0][2].equals("X") && board[1][2].equals("X") && board[2][2].equals("X")) {//colonne 3
                    System.out.println("Bravo " + nomJDeux + " Vous avez gagné ");
                    winner=true;
                }else if (board[0][0].equals("X") && board[1][1].equals("X") && board[2][2].equals("X")) {//diagonale 1
                    System.out.println("Bravo " + nomJDeux + " Vous avez gagné ");
                    winner=true;
                }else if (board[0][2].equals("X") && board[1][1].equals("X") && board[2][0].equals("X")) {//diagonale 1
                    System.out.println("Bravo " + nomJDeux + " Vous avez gagné ");
                    winner=true;
                }

            }while(!winner);
            System.out.println("Voulez vous rejouer (o/n): ");
            reset = clavier.nextLine();
            if(reset.equals("n")||reset.equals("non")) {
                break;
            }

            String temp = nomJDeux;
            nomJDeux = nomJUn;
            nomJUn = temp;
        }while(reset.equals("o") || reset.equals("oui"));
    }
}