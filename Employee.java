public class Employee extends Person {
    private String employeeID;
    private double gaji;

    public Employee(String nama, int umur, String employeeID, double gaji) {
        super(nama, umur);
        this.employeeID = employeeID;
        this.gaji = gaji;
    }

    public double hitungGajiPerTahun() {
        double gajiPerTahun = gaji * 12;
        System.out.println("Gaji per Tahun  : " + gajiPerTahun);
        return gajiPerTahun;
    }
}
