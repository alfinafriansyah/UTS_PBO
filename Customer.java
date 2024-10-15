class Customer extends User {
    private boolean verificationStatus = false;

    public Customer(UserProfile userProfile) {
        super(userProfile);
    }

    public boolean getVerificationStatus() {
        return verificationStatus;
    }

    public void applyVerification(String doc) {
        System.out.println("Verification document submitted: " + doc);
        verificationStatus = true;
        System.out.println("Verification status updated to verified.");
    }
}