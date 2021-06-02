    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        for(int i = 0; i < n; i++){
            int total = 0, stopCount = 0,j=i;
            while(stopCount < n){
                total += gas[j % n] - cost[j % n];
                if(total < 0)
                    break;
                stopCount++;
                j++;
            }
            if(stopCount == n && total >= 0)
                return i;
        }
        return -1;
    }