import java.util.Arrays;

class Search {
    int target;

    Search(int target){
        this.target = target;
    }
}
public class IinnerSearch {
    public static void main(String[] args) {
        int[] elment = {1,3,4,5,6,7};
        Search obj = new Search(4);
        for (int i =0; i<elment.length;i++) {
            if (elment[i] == obj.target)
                System.out.println("Search Index: "+obj.target +" Index: "+i);
        }

    }
}


