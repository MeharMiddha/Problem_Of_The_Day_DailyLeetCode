class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Queue<Integer> q = new LinkedList<>();
        Arrays.sort(deck);
        for(int i=0;i<deck.length;i++){
            q.add(i);
        }
        int arr[]=new int[deck.length];
        for(int card:deck){
            int index1 = q.remove();
            arr[index1]=card;
            if(!q.isEmpty()){
                int index2 = q.remove();
                q.add(index2);
            }
        }
        return arr;
    }
}
