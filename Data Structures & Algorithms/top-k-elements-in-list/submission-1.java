class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>((entry1, entry2) -> entry1.getValue()-entry2.getValue());

        Map<Integer, Integer> myMap = new HashMap<>();

        for(int i=0;i<nums.length;i++){
             myMap.put(nums[i], myMap.getOrDefault(nums[i], 0)+1);
        }
        for(Map.Entry<Integer, Integer> entry : myMap.entrySet()){
            pq.offer(entry);
            if(pq.size()>k){
                pq.poll();
            }
        }
    
        int result[] = new int[k];
        for(int i=0;i<k;i++){
            result[i]=pq.poll().getKey();
        }
        return result;
       

    }
}
