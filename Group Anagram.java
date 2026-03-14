class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String, List<String>> map = new HashMap<>();

        for(String word : strs){
            char [] charWord = word.toCharArray();
            Arrays.sort(charWord);
            String sortedWord = new String(charWord);

            if(!map.containsKey(sortedWord)){
                map.put(sortedWord,new ArrayList<>());
            }
            map.get(sortedWord).add(word);
        }
    return new ArrayList<>(map.values());
    }
}
