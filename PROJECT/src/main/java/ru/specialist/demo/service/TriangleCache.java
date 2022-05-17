package ru.specialist.demo.service;

import org.springframework.stereotype.Repository;
import ru.specialist.demo.entity.TriangleInfo;
import ru.specialist.demo.entity.TriangleSidesInfo;

import java.util.LinkedHashMap;
import java.util.Map;

@Repository
public class TriangleCache {

    Map<TriangleSidesInfo, TriangleInfo> numberMap = new LinkedHashMap<>();

    {
        numberMap.put(new TriangleSidesInfo(3,4,5),
                new TriangleInfo(12,6));
        numberMap.put(new TriangleSidesInfo(6,8,10),
                new TriangleInfo(24,24));
    }
    public boolean isContain(TriangleSidesInfo key) {
        return numberMap.containsKey(key);
    }

    public TriangleInfo findBySides(TriangleSidesInfo number) {
        return numberMap.get(number);
    }

    public TriangleInfo addTriangleInfo(TriangleSidesInfo number, TriangleInfo triangleInfo) {
        numberMap.put(number, triangleInfo);
        return triangleInfo;
    }
    public Map<TriangleSidesInfo, TriangleInfo> getTriangleMap() {
        return numberMap;
    }
}


