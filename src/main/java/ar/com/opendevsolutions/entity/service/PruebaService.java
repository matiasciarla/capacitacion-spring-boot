package ar.com.opendevsolutions.entity.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

@Service
@Transactional
public class PruebaService {


    public List<Map<String, Object>> get() {
        Map<String, Object> map1 = new HashMap<>();
        map1.put("id", 2);
        map1.put("name", "diego");
        map1.put("lastName", "guzman");

        Map<String, Object> map2 = new HashMap<>();
        map2.put("id", 2);
        map2.put("name", "ivan");
        map2.put("lastName", "ahu");

        List<Map<String, Object>> list = new ArrayList<>();
        list.add(map1);
        list.add(map2);

        return list;
    }

    public List<Map<String, Object>> getById(Integer id) {
        List<Map<String, Object>> list = new ArrayList<>();
        List<Map<String, Object>> miLista = get();
        for(Map<String, Object>l:miLista){
            //System.out.println(l.toString());
            if(l.get("id").equals(id)){
                //System.out.println(l.values());
                list.add(l);
            }
        }
        return list;
    }
}
