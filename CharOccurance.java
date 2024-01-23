import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class CharOccurance {
    public static void main(String[] args) {
        String s="geek for geeks";
       // int [] char=s.toCharArray();
        String rep=s.replace(" ","");
        System.out.println(rep.chars().mapToObj(i->(char)i).collect(Collectors.groupingBy(i->i,Collectors.counting())));
//        int len=s.length();
//        String rep=s.replace(" ","");
//        char[] a= rep.toCharArray();
//        Map<Character, Integer> map=new TreeMap<Character,Integer>();
//        int count=0;
//        for(int i=0;i<a.length;i++)
//        {
//            count=0;
//            for(int j=1;j<a.length;j++)
//            {
//               if(a[i]==a[j])
//               {
//
//                  count++;
//
//               }
//            }
//            map.put(a[i],count);
//        }
//        System.out.println(map);

    }
}
