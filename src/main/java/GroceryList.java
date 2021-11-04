public class GroceryList {
    private String[] arr;

    // Creates a new empty Grocery List of size 10
    // Remember to create the array!
    // You don't need to change any of the values in the array
    public GroceryList() {
        arr = new String[10];

    }

    // Adds an item to the grocery list
    public void add(String item) {
        for (int i = 0; i < arr.length; i++){
            if(arr[i] == null){
                arr[i] = item;
                break;
            }
        }
    }

    // Removes an item from the grocery list
    // Replaces the item with null
    // Remember to shift anything to the left if necessary
    public void remove(String item) {
        int counter = 0;
        for (int i = 0; i < arr.length; i++){
            if(arr[i] == item){
                arr[i] = null;
                counter = i;
            }
        }
        for (int i = counter; i < arr.length - 1; i++){
            arr[i] =arr[i + 1];

        }
        arr[9] = null;
    }

    // Returns a String representation the grocery list
    // The String should start with "Grocery List:" and
    // contain each non-null value separated by a comma
    // For instance, the string should look something like:
    // Grocery List: eggs, milk, oranges

    // You **may** have an extra comma at the end
    @Override
    public String toString() {
        String groc = "";
        for (int i = 0; i < arr.length; i++){
            if (arr[i] != null){
                if (arr[i + 1] == null) {
                    groc = groc + arr[i];
                }
                else{
                    groc = groc +  arr[i] + ", ";
                }
            }
        }

        return "Grocery List: " + groc;
    }
}
