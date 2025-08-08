public class Member {
    private int memberId;
    private String name;
    private String contactInfo;

    public Member(int memberId, String name, String contactInfo) {
        this.memberId = memberId;
        this.name = name;
        this.contactInfo = contactInfo;
    }

    public int getMemberId() { return memberId; }
    public String getName() { return name; }
    public String getContactInfo() { return contactInfo; }

    public void displayInfo() {
        System.out.println("Member ID: " + memberId + ", Name: " + name + ", Contact: " + contactInfo);
    }
}
