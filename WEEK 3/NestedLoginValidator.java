public class NestedLoginValidator {
    public static void main(String[] args) {
        String savedUser = "jhanvince";
        String savedPass = "pogiako123";
        boolean isLocked = false;

        // Dat Palitan to para ma test yong pasword at userrrrrr
        String inputUser = "LegitsiLebronto";
        String inputPass = "PANGIT123";
        boolean checkLocked = true;

        if (inputUser.equals(savedUser)) {
            if (inputPass.equals(savedPass)) {
                if (!checkLocked) {
                    System.out.println("Login Successful! Welcome back.");
                } else {
                    System.out.println("Login Failed: Account is currently locked.");
                }
            } else {
                System.out.println("Login Failed: Incorrect password.");
            }
        } else {
            System.out.println("Login Failed: Username not found.");
        }
    }
}