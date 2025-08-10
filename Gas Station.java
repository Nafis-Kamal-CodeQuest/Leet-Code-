class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int sumGas = 0, sumCost = 0;
        for(int i = 0; i<gas.length; i++){
            sumGas = sumGas + gas[i];
            sumCost = sumCost + cost[i];
        }
        if(sumGas<sumCost){
            return -1;
        }
        int currentTank = 0;
        int totalTank = 0;
        int start = 0;

        for(int i = 0; i<gas.length; i++){
            int diff = gas[i] - cost[i];
            totalTank = totalTank + diff;
            currentTank = currentTank + diff;
            
            if(currentTank<0){
                currentTank = 0;
                start = i+1;
            }

           
        }
        return start;
    }
}
