class Solution {
    public boolean squareIsWhite(String coordinates) {
         int alpha = coordinates.charAt(0);
       int num = coordinates.charAt(1);
       return (alpha % 2 )!=(num%2);
       
    }
}