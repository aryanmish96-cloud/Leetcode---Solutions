class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();

        for(int a : asteroids){
            while(!st.isEmpty() && st.peek()>0 && a<0){
                //agr current asteroid bada h stack ke peek se to stack se remove krke aage badh jaao;
                if(st.peek()< -a){
                    st.pop();
                    continue;

                }
                // same size h toh dono destroy ho jaayenge 
                if(st.peek()==-a){
                    st.pop();
                    
                }
                // agr stack ke peek pe asteroid bada h toh cureent wale ko pura destroy krke zero krdo or aage loop check mt kro 
                a=0;
                break;
                
            }
            if(a!=0){
                st.push(a); //agr current wala khtm nhi hua h toh usse stack me daal do 
            }
            
        }
        int[]ans = new int[st.size()];

            for(int i = ans.length-1 ; i>=0 ; i--){
                ans[i] = st.pop();
            }
        return ans;
    }
}