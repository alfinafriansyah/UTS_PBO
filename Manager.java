public class Manager extends Employee {
    private String departemen;

    public Manager(String nama, int umur, String employeeID, double gaji, String departemen) {
        super(nama, umur, employeeID, gaji);
        this.departemen = departemen;
    }

    public void displayDepartemen() {
        System.out.println("Departemen      : " + departemen);
    }
}
