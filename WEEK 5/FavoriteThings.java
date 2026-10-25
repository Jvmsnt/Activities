public class FavoriteThings  {
    public static void main(String[] args) {
        // Declare and initialize a String array with 5 favorite things
        String[] favorites = {"Adobo", "Siopao", "Suman", "Sinigang", "Siomai Rice"};

        System.out.println("My Favorite Things:");
        
        
        for (int i = 0; i < favorites.length; i++) {
            System.out.println((i + 1) + ". " + favorites[i]);
        }

       
        System.out.println("\nTotal number of favorite things: " + favorites.length);
    }
}