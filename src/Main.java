import java.util.ArrayList;



public class Main {
    public static void main(String[] args) {
        String temp;

        ArrayList<String> names = new ArrayList<>();
        names.add("apple");
        names.add("bat");
        names.add("dog");
        names.add("elephant");
        //buble sorting
        for (int i = 0; i < names.size(); i++) {
           for(int j=0;j<names.size()-1-i;j++)
           {   // Compare by length first
               if (names.get(j).length()>names.get(j+1).length()&&names.get(j).length()!=names.get(j+1).length())

               {//swap
                   temp=names.get(j+1);
                   names.set(j+1,names.get(j));

                   names.set(j,temp);

               }
               // If the lengths are equal, compare lexicographically
               else if (names.get(j).length()==names.get(j+1).length()) {

                   if (names.get(j).compareTo(names.get(j+1))>0){

                       temp=names.get(j+1);
                       names.set(j+1,names.get(j));

                       names.set(j,temp);
                   }

               }



           }



        }
        System.out.println(names);
    }
}
