import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class tictac {
    public static void main(String[] args) {

    }
}import java.util.Scanner;
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
        String historiqueJUn;
        String historiqueJDeux;
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

            System.out.print(nomJUn + " Ou voulez vous poser votre signe colonne(1,2) ligne(0,1;2): ");
            positionColone = clavier.nextInt();
            positionLigne = clavier.nextInt();
            System.out.print("Etes vous sur de votre choix ? (o/n): ");
            confirmation = clavier.nextLine();
            while (confirmation.equals("n") || confirmation.equals("non")) {
                System.out.print(nomJUn + " Ou voulez vous poser votre signe colonne(1,2) ligne(0,1;2): ");
                positionColone = clavier.nextInt();
                positionLigne = clavier.nextInt();
                System.out.print("Etes vous sur de votre choix ? (o/n): ");
                confirmation = clavier.nextLine();
            }
            board[positionColone][positionLigne]=choixJUn;
            System.out.println(board[0][0]+" "+board[0][1]+" "+board[0][2]);
            System.out.println(board[1][0]+" "+board[1][1]+" "+board[1][2]);
            System.out.println(board[2][0]+" "+board[2][1]+" "+board[2][2]);
            System.out.print(nomJDeux+" Ou voulez vous poser votre signe colonne(1,2) ligne(0,1;2): ");
            positionColone = clavier.nextInt();
            positionLigne= clavier.nextInt();
            System.out.print("Etes vous sur de votre choix ? (o/n): ");
            confirmation = clavier.nextLine();
            while(confirmation.equals("n")||confirmation.equals("non")){
                System.out.print(nomJUn+" Ou voulez vous poser votre signe colonne(1,2) ligne(0,1;2): ");
                positionColone = clavier.nextInt();
                positionLigne= clavier.nextInt();
                System.out.print("Etes vous sur de votre choix ? (o/n): ");
                confirmation = clavier.nextLine();
            }
            board[positionColone][positionLigne]=choixJDeux;
            System.out.println(board[0][0]+" "+board[0][1]+" "+board[0][2]);
            System.out.println(board[1][0]+" "+board[1][1]+" "+board[1][2]);
            System.out.println(board[2][0]+" "+board[2][1]+" "+board[2][2]);


            if (board[0][0].equals("0") && board[0][1].equals("0") && board[0][2].equals("0")) {//ligne 1
                System.out.println("Bravo " + nomJUn + " Vous avez gagner ");
            } else if (board[1][0].equals("0") && board[1][1].equals("0") && board[1][2].equals("0")) {//ligne 2
                System.out.println("Bravo " + nomJUn + " Vous avez gagner ");
            } else if (board[2][0].equals("0") && board[2][1].equals("0") && board[2][2].equals("0")) {//ligne 3
                System.out.println("Bravo " + nomJUn + " Vous avez gagner ");
            } else if (board[0][0].equals("0") && board[1][0].equals("0") && board[2][0].equals("0")) {//colonne 1
                System.out.println("Bravo " + nomJUn + " Vous avez gagner ");
            }else if (board[1][0].equals("0") && board[1][1].equals("0") && board[2][1].equals("0")) {//colonne 2
                System.out.println("Bravo " + nomJUn + " Vous avez gagner ");
            }else if (board[0][2].equals("0") && board[1][2].equals("0") && board[2][2].equals("0")) {//colonne 3
                System.out.println("Bravo " + nomJUn + " Vous avez gagner ");
            }else if (board[0][0].equals("0") && board[1][1].equals("0") && board[2][2].equals("0")) {//diagonale 1
                System.out.println("Bravo " + nomJUn + " Vous avez gagner ");
            }else if (board[0][2].equals("0") && board[1][1].equals("0") && board[2][0].equals("0")) {//diagonale 1
                System.out.println("Bravo " + nomJUn + " Vous avez gagner ");
            }
            else if (board[0][0].equals("X") && board[0][1].equals("X") && board[0][2].equals("X")) {//ligne 1
                System.out.println("Bravo " + nomJDeux+ " Vous avez gagner ");
            } else if (board[1][0].equals("X") && board[1][1].equals("X") && board[1][2].equals("X")) {//ligne 2
                System.out.println("Bravo " + nomJDeux + " Vous avez gagner ");
            } else if (board[2][0].equals("X") && board[2][1].equals("X") && board[2][2].equals("X")) {//ligne 3
                System.out.println("Bravo " + nomJDeux + " Vous avez gagner ");
            } else if (board[0][0].equals("X") && board[1][0].equals("X") && board[2][0].equals("X")) {//colonne 1
                System.out.println("Bravo " + nomJDeux + " Vous avez gagner ");
            }else if (board[1][0].equals("X") && board[1][1].equals("X") && board[2][1].equals("X")) {//colonne 2
                System.out.println("Bravo " + nomJDeux + " Vous avez gagner ");
            }else if (board[0][2].equals("X") && board[1][2].equals("X") && board[2][2].equals("X")) {//colonne 3
                System.out.println("Bravo " + nomJDeux + " Vous avez gagner ");
            }else if (board[0][0].equals("X") && board[1][1].equals("X") && board[2][2].equals("X")) {//diagonale 1
                System.out.println("Bravo " + nomJDeux + " Vous avez gagner ");
            }else if (board[0][2].equals("X") && board[1][1].equals("X") && board[2][0].equals("X")) {//diagonale 1
                System.out.println("Bravo " + nomJDeux + " Vous avez gagner ");
            }


            System.out.println("Voulez vous rejouer (o/n): ");
            reset = clavier.nextLine();
        }while(reset.equals("o") || reset.equals("oui"));

    }
}