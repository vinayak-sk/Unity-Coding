package Unity;

import java.util.*;

public class MultiValueMap {
    private static Map<String, List<String>> multiValueMap;

    public static void main(String[] args) {
//        multiValueMap = new LinkedHashMap<>();
//
//        add("key1","value1");
//        add("key2","value1");
//        add("key2","value4");
//        add("key1","value2");
//        add("key1","value3");
//
//        print();
    }

    public boolean add(String key, String value){
        if(!multiValueMap.containsKey(key)){
            multiValueMap.put(key, new LinkedList<String>());
        }
        return multiValueMap.get(key).add(value);
    }

    public void print(){
        for(String key : multiValueMap.keySet()){
            System.out.println(key+":");
            for(String value : multiValueMap.get(key))
                System.out.println(value);
            System.out.println();
        }
    }
    
    public static void outputReturn(){
        for(String key : multiValueMap.keySet()){
            System.out.println(key+":");
            for(String value : multiValueMap.get(key))
                System.out.println(value);
            System.out.println();
        }
    }
}