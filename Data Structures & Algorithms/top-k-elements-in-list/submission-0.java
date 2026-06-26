class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>((entry1, entry2) -> entry2.getValue()-entry1.getValue());

        Map<Integer, Integer> myMap = new HashMap<>();

        for(int i=0;i<nums.length;i++){
             myMap.put(nums[i], myMap.getOrDefault(nums[i], 0)+1);
        }
        for(Map.Entry<Integer, Integer> entry : myMap.entrySet()){
            pq.offer(entry);
        }
        int count = 0;
        int result[] = new int[k];
        while(count<k && !pq.isEmpty()){
            result[count] = pq.poll().getKey();
             count++;
        }
        return result;

    }
}
