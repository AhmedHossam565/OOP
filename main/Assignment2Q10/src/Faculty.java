public class Faculty extends Employee {
    private String rank;
    private String officeHours;

    public Faculty(String name, String address, String phoneNumber, String emailAddress,
                   String office, double salary, String dateHired, String rank, String officeHours) {
        super(name, address, phoneNumber, emailAddress, office, salary, dateHired);
        this.rank = rank;
        this.officeHours = officeHours;
    }

    public String getRank() {
        return rank;
    }

    public String getOfficeHours() {
        return officeHours;
    }
}