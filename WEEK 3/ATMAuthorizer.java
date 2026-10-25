public class ATMAuthorizer {
    public static void main(String[] args) {
        String savedUser = "jhan";
        int savedPin = 1234;
        double balance = 100000.0; 

        // Papapalitan to para ma test yung failure and other stuff and shi 
        String inputUser = "jhan";
        int inputPin = 1234;
        double withdrawAmount = 999999.0;

        if (inputUser.equals(savedUser)) {
            if (inputPin == savedPin) {
                
                String tier = "";
                if (balance >= 100000) {
                    tier = "Platinum";
                } else if (balance >= 50000) {
                    tier = "Gold";
                } else if (balance >= 10000) {
                    tier = "Silver";
                } else {
                    tier = "Bronze";
                }

                double feePercent = 0.0;
                double dailyLimit = 0.0;

                switch (tier) {
                    case "Platinum":
                        feePercent = 0.0;
                        dailyLimit = 100000.0;
                        break;
                    case "Gold":
                        feePercent = 0.01;
                        dailyLimit = 50000.0;
                        break;
                    case "Silver":
                        feePercent = 0.02;
                        dailyLimit = 20000.0;
                        break;
                    case "Bronze":
                        feePercent = 0.05;
                        dailyLimit = 10000.0;
                        break;
                }

                double fee = withdrawAmount * feePercent;
                double totalCost = withdrawAmount + fee;

                System.out.println("Account Tier: " + tier);
                System.out.println("Requested Withdrawal: PHP " + withdrawAmount);

                if (withdrawAmount <= dailyLimit) {
                    if (balance >= totalCost) {
                        balance -= totalCost;
                        System.out.println("Status: APPROVED");
                        System.out.println("Fee Charged: PHP " + fee);
                        System.out.println("New Balance: PHP " + balance);
                    } else {
                        System.out.println("Status: DENIED - Insufficient funds to cover amount plus fee.");
                    }
                } else {
                    System.out.println("Status: DENIED - Amount exceeds daily limit of PHP " + dailyLimit + " for " + tier + " tier.");
                }

            } else {
                System.out.println("Status: DENIED - Incorrect PIN.");
            }
        } else {
            System.out.println("Status: DENIED - Invalid username.");
        }
    }
}