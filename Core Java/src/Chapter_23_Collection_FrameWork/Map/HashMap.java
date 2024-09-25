package Chapter_23_Collection_FrameWork.Map;

import java.util.Map;

public class HashMap {
    public static void main(String[] args) {
        Map<Integer,String> map = new java.util.HashMap<Integer,String>();
        map.put(10, "Ten");
        map.put(20,"Twenty");
        map.put(30,"Thirty");
        map.put(40,"Fourty");
        map.put(50,	"Fifty");
        System.out.println("Map :" + map);
    }
}
