import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> grocerylist = new ArrayList<String>();

    public ArrayList<String> getGrocerylist() {
        return grocerylist;
    }

    public void addGrocery(String item){
          grocerylist.add(item);
    }

    public  void printGrocery(){
        System.out.println("You have "+ grocerylist.size()+" item");
        for (int i = 0;i<grocerylist.size();i++){
            System.out.println((i+1)+" ,"+grocerylist.get(i));
        }
    }

    public void modifyGrocery(String currentItem, String newItem){
        int position =  findItem(currentItem);
        if(position >= 0){
            modifyGrocery(position, newItem);
        }
    }

    private void modifyGrocery(int position,String newitem){
        grocerylist.set(position,newitem);
        System.out.println("Grocery item "+(position+1)+" has been modified");
    }

    public void removeGrocery(String item){
        int position =  findItem(item);
        if(position >= 0){
            removeGrocery(position);
        }
    }

    private void removeGrocery(int position){
        grocerylist.remove(position);
    }

    private int findItem(String searchItem){
        return grocerylist.indexOf(searchItem);
    }

    public boolean onFile(String searchItem){
        int position = findItem(searchItem);
        if(position >=0){
            return true;
        }
        return false;
    }
}