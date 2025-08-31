class Solution {
    public String frequencySort(String s) {
        
       

        //create hash map 
        HashMap<Character,Integer> map = new HashMap<>();


        //count the frequency of characters 

        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch, 0)+1);
        }
    
        List<Character> chars = new ArrayList<>(map.keySet());
        Collections.sort(chars, (a,b)->map.get(b)-map.get(a));


        StringBuilder sb = new StringBuilder();
        for(Character ch : chars ){
            for(int i =0;i<map.get(ch);i++){
                sb.append(ch);
            }
        }

    return sb.toString();
    }
}