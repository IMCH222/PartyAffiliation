import java.util.Scanner;

public class PartyAffiliation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String partyChoice = "";
        String party = "D - Democrat\tR - Republican\tI - Independent\tO - other\nChoose your party: ";

        System.out.print(party);
        partyChoice = in.nextLine();

        if(partyChoice.equalsIgnoreCase("D")) {
            System.out.println("You get a Democratic Donkey!");
        }
        else if(partyChoice.equalsIgnoreCase("R")) {
            System.out.println("You get a Republican Elephant!");
        }
        else if(partyChoice.equalsIgnoreCase("I")){
            System.out.println("You get a Independent Eagle!");
        }
        else if(partyChoice.equalsIgnoreCase("O")) {
            System.out.println("You get an American Flag!");
        }
    }
}