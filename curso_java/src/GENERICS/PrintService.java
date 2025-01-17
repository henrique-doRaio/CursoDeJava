package GENERICS;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T> {
    private List<T> list = new ArrayList<>();

    public void addValue(T value){
        list.add(value);
    }

    public Integer first(){
        if(list.isEmpty()){
            throw new IllegalStateException("List is empty");
        }
        return (Integer) list.get(0);
    }

    public void print(){
        System.out.println("[");
        if(!list.isEmpty()){
            System.out.print(list.get(0));
        }
        for(int i = 1 ; i < list.size(); i++){
            System.out.print(", " + list.get(i));
        }
        System.out.print("]");
    }
}
