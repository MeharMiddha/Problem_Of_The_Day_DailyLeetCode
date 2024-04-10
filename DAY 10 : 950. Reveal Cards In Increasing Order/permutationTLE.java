class Solution {
    public static ArrayList<Integer> list2 = new ArrayList<>();
    public static boolean check(int deck[]){
        int max=Integer.MIN_VALUE;
        Queue<Integer> que = new LinkedList<>();
        for(int i=0;i<deck.length;i++){
            que.add(deck[i]);
        }
        while(que.size()>=1){
            int a = que.remove();
            max = Math.max(a,max);
            if(a<max){
                return false;
            }
            if(que.size()>1){
                int b = que.remove();
                que.add(b);
            }
        }
        return true;
    }
    public static void permutation(int index,int[] deck){
        if(index==deck.length){
            if(check(deck)){
                for(int i : deck) list2.add(i);
                return;
            }
        }
        for(int i=index;i<deck.length;i++){
            int temp=deck[i];
            deck[i]=deck[index];
            deck[index]=temp;
            permutation(index+1,deck);
            temp=deck[i];
            deck[i]=deck[index];
            deck[index]=temp;
        }
    }
    public int[] deckRevealedIncreasing(int[] deck) {
        list2=new ArrayList<>();
        permutation(0,deck);
        for(int i=0;i<deck.length;i++){
            deck[i]=list2.get(i);
        }
        return deck;
    }
}
