public class PersonMain {
    public static void main(String[] args) {
        Manager manager = new Manager("Budi", 35, "M123", 8000, "HR");
        
        manager.displayInfo();
        manager.hitungGajiPerTahun();
        manager.displayDepartemen();
    }
}