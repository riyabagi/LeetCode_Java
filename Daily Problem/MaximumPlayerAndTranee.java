class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);
        
        int m = players.length;
        int n = trainers.length;
        
        if (m == 0 || n == 0) {
            return 0;
        }
        int count = 0, j = 0, i = 0;

        while (i < m && j < n) {
            if(players[i] <= trainers[j]){
                count++;
                i++; j++;
            } else {
                j++;
            }
        }
        return count;
    }
}