class Admin extends User {
    
    public Admin(UserProfile userProfile) {
        super(userProfile);
    }

    public void updateVehicleDetails(int vehicleId) {
        System.out.println("Vehicle details updated for Vehicle ID: " + vehicleId);
    }

    public void addVehicle() {
        System.out.println("New vehicle added to the system.");
    }

    public void retrieveComplain() {
        System.out.println("Complaint retrieved and under review.");
    }

    public void verifyUser(Customer customer) {
        if (!customer.getVerificationStatus()) {
            System.out.println("User verified by Admin.");
        } else {
            System.out.println("User is already verified.");
        }
    }
}
