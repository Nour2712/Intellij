public class Member {

    final private String name;
    final private int memberId;

    public Member(String name, int memberId){
        this.name = name;
        this.memberId = memberId;
    }
    //del 8,3
    public String getName() {
        return name;
    }

    public int getMemberId() {
        return memberId;
    }

    @Override
    public String toString() {
        return String.format("%s (Lånernummer: %d);", name, memberId);
    }
}
