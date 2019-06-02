package day06;

import java.util.ArrayList;

public class HashCode1 {
    public static boolean hashcode(ArrayList<HashCode> hashCodes, Object ob)
    {
        for (HashCode hg:hashCodes) {
            if (hg.equals(ob))
            {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        HashCode h=new HashCode("India","Delhi");
        HashCode h1=new HashCode("USA","Washington");
        HashCode h2=new HashCode("Malaysia","Singapoore");
        ArrayList<HashCode> arrayList=new ArrayList<>();
        arrayList.add(h);
        arrayList.add(h1);
        arrayList.add(h2);
        for (HashCode hd:arrayList) {
            System.out.println(hd.toString());

        }
        HashCode h3=new HashCode("Uk","London");
        arrayList.add(1,h3);
        System.out.println(hashcode(arrayList,new HashCode("India","Delhi")));
        System.out.println(hashcode(arrayList,new HashCode("Austrailia","Washington")));
        //System.out.println(hashcode());
        System.out.println(h.hashCode());
    }
}
