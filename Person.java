public class Person {
    private String nama;
    private int umur;

    public Person(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public void displayInfo() {
        System.out.println("Nama    : " + nama);
        System.out.println("umur     : " + umur);
    }
}