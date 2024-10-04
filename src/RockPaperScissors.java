import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        String playerAMove = "";
        String playerBMove = "";
        String input = "";
        boolean done = false;

        Scanner in = new Scanner(System.in);

        do {
            while(true){
                System.out.print("Player A make a move\t Rock - R\t Paper - P\t Scissors - S\t Or done to quit:");
                playerAMove = in.nextLine();
                playerAMove = playerAMove.toUpperCase();

                if(playerAMove.equalsIgnoreCase("done"))
                {
                    done = true;
                    break;
                }
                if(playerAMove.matches("[RPS]"))
                {
                    break;
                }
                else{
                    System.out.println("Illegal Move! Please enter R, P, or S: ");
                }
            }
            if (done)
            {
                break;
            }

            while(true){
                System.out.print("Player B make a move\t Rock - R\t Paper - P\t Scissors - S:");
                playerBMove = in.nextLine();
                playerBMove = playerBMove.toUpperCase();

                if(playerBMove.matches("[RPS]"))
                {
                    break;
                }
                else{
                    System.out.println("Illegal Move! Please enter R, P, or S: ");
                }
            }


            System.out.print("\nPlayer A: " + playerAMove + "\nPlayer B: " + playerBMove + "\n\n");

            if(playerAMove.equals("DONE"))
            {
                done = true;
                break;
            }

            {
                switch (playerAMove) {
                    case "R":
                        if (playerBMove.equals("R")) {
                            System.out.println("Rock v.s. Rock! It's a tie!\n ");
                        } else if (playerBMove.equals("P")) {
                            System.out.println("Paper covers Rock! Player B wins!\n ");
                        } else {
                            System.out.println("Rock breaks Scissors! Player A wins!\n ");
                        }
                        break;
                    case "P":
                        if (playerBMove.equals("P")) {
                            System.out.println("Paper v.s. Paper! It's a tie!\n ");
                        } else if (playerBMove.equals("R")) {
                            System.out.println("Paper covers Rock! Player A wins!\n ");
                        } else {
                            System.out.println("Scissors cuts Paper! Player B wins!\n ");
                        }
                        break;
                    case "S":
                        if (playerBMove.equals("R")) {
                            System.out.println("Rock beats Scissors! Player B wins!\n ");
                        } else if (playerBMove.equals("P")) {
                            System.out.println("Scissors cuts Paper! Player A wins!\n ");
                        } else {
                            System.out.println("Scissors v.s. Scissors! It's a tie!\n ");
                        }
                        break;
                }
            }
        } while (!done);
    }
}