import java.util.*;

public class busRoutes {
    public int numBusesToDestination(int[][] routes, int source, int target) {
        Map<Integer, List<Integer>> bStopToBIds = new HashMap<>();
        for (int i = 0; i < routes.length; i++) {
            int bid = i;
            for (int bStop : routes[i]) {
                bStopToBIds.computeIfAbsent(bStop, k -> new ArrayList<>()).add(bid);
            }
        }

        Queue<int[]> q = new LinkedList<>();
        Map<Integer, Boolean> bVis = new HashMap<>();
        Map<Integer, Boolean> bStopVis = new HashMap<>();
        q.offer(new int[]{source, 0});
        bStopVis.put(source, true);

        while (!q.isEmpty()) {
            int sz = q.size();
            while (sz-- > 0) {
                int[] p = q.poll();
                int curStop = p[0];
                int busTravelled = p[1];

                if (curStop == target) {
                    return busTravelled;
                }

                for (int bus : bStopToBIds.getOrDefault(curStop, Collections.emptyList())) {
                    if (bVis.getOrDefault(bus, false)) continue;

                    bVis.put(bus, true);
                    for (int busStop : routes[bus]) {
                        if (bStopVis.getOrDefault(busStop, false)) continue;
                        bStopVis.put(busStop, true);
                        q.offer(new int[]{busStop, busTravelled + 1});
                    }
                }
            }
        }
        return -1;
    }
}