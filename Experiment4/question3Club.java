
public class question3Club{
    public static void main(String[] args) {
        Club mem1 = new Club("Myers");
        Club mem2 = new Club("Alex");
        Club mem3 = new Club("Reed");
        mem1.displayClubMember();
        mem1.displayClubName();   
        mem2.displayClubMember();
        mem2.displayClubName();
        mem3.displayClubMember();
        mem3.displayClubName();

    }
}

class Club{
    private static final String CLUBNAME = "Global Club";
    String memberName;

    public Club(String memberName){
        this.memberName = memberName;
    }
    
    public void displayClubName() {
        System.out.println("Club Name: " + CLUBNAME);
    }

    public void displayClubMember() {
        System.out.println("Member Name: " + this.memberName);
    }
}