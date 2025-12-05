package net.konic.corejava.staticnonstatic;

public class LoginService {
	  // Static method
    static void validateUser(String username) {
        System.out.println(username + " logged in successfully");
    }

    // Non-static method
    void logout() {
        System.out.println("User logged out");
    }

    public static void main(String[] args) {

        
        LoginService.validateUser("Haneef");

        //instane //non stati
        LoginService ls = new LoginService();
        ls.logout();
    }

}
