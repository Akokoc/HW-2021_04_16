import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ComputerMain {
    public static void main(String[] args) {
        LinkedHashMap<Computer,Double> compMap=new LinkedHashMap<>();
        Computer comp1=new Computer("Apple","Core i5",128);
        Computer comp2=new Computer("ffff","i8",256);
        Computer comp3=new Computer("bhjjk","fygh",100);
        Computer comp4=new Computer("fgchvj","yhnm",300);
        Computer comp5=new Computer("WWWWWW","WERT",90);
        Computer comp6=new Computer("WWWWWW","WERT",90);

        compMap.put(comp1,12.5);
        compMap.put(comp2,1.5);
        compMap.put(comp3,13.56);
        compMap.put(comp4,45.80);
        compMap.put(comp5,111.9);
        compMap.put(comp6,111.9);

        System.out.println(compMap);
//        getComputersLighter(compMap,12.5);
        System.out.println(getComputersLighter(compMap,12.5));


    }

    public static List<Computer> getComputersLighter(LinkedHashMap<Computer,Double> comp, Double toWeight){
        List<Computer> computerList=new ArrayList<>();
        for(Map.Entry<Computer,Double>e:comp.entrySet()){
            if(e.getValue()<=toWeight){
                computerList.add(e.getKey());
            }
        }
        return computerList;

    }

}
