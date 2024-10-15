public class Main {
    public static void main(String[] args) {
        UserProfile customerProfile = new UserProfile(1, "password123", "Budiono", 28, "budioo@gmail.com", ".jpg");
        UserProfile adminProfile = new UserProfile(2, "adminpass", "Siregar", 35, "siregartzy@yahoo.com", ".pdf");

        Customer customer = new Customer(customerProfile);
        Admin admin = new Admin(adminProfile);

        customer.logIn(1, "password123");
        customer.applyVerification(".jpg");
        customer.logOut();

        admin.logIn(2, "adminpass");
        admin.updateVehicleDetails(101);
        admin.addVehicle();
        admin.retrieveComplain();
        admin.verifyUser(customer);
        admin.logOut();
    }
}
