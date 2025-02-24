final class SecuritySystem {
    public boolean authenticateUser(String username, String password) {
        return "admin".equals(username) && "password123".equals(password);
    }
}

// class AdvancedSecurity extends SecuritySystem {
//     @Override
//     public boolean authenticateUser(String username, String password) {
//         return false;
//     }
// }

public class Question2Security {
    public static void main(String[] args) {
        SecuritySystem securitySystem = new SecuritySystem();
        boolean isAuthenticated = securitySystem.authenticateUser("admin", "password123");
        System.out.println("Authentication successful: " + isAuthenticated);
    }
}
