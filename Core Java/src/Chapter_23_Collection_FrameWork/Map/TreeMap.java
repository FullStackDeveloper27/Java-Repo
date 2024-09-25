package Chapter_23_Collection_FrameWork.Map;
import	java.util.*;
public class TreeMap {
    public static void main(String[] args)
    {
        //Map<Integer,String>	map	=	new	LinkedHashMap<Integer,String>();
        Map<Integer,String>	map	=	new java.util.TreeMap<Integer,String>();
        map.put(50, "Fifty");
        map.put(40,"Fourty");
        map.put(30,"Thirty");
        map.put(20,"Twenty");
        map.put(10,	"Ten");
        System.out.println("Map :" + map);
    }
}
