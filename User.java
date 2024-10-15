public class User {
    private UserProfile userProfile;

    public User(UserProfile userProfile) {
        this.userProfile = userProfile;
    }

    public boolean logIn(int userId, String password) {
        if (userProfile.getUserId() == userId && userProfile.getPassword().equals(password)) {
            System.out.println("Login successful.");
            return true;
        } else {
            System.out.println("Login failed.");
            return false;
        }
    }

    public void recoverPassword() {
        System.out.println("Password recovery link sent to " + userProfile.getEmail());
    }

    public void logOut() {
        System.out.println("Logged out successfully.");
    }
}
