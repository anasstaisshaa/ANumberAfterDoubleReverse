class Solution {
    public static void main(String[] args) {
        System.out.println(isSameAfterReversals(526));
    }
    public static boolean isSameAfterReversals(int num) {
        String str = Integer.toString(num);
        StringBuilder sb = new StringBuilder(str);

        if(sb.charAt(0) == '0' && sb.length() == 1){
            return true;
        } else {
            while(sb.charAt(0) == '0')
                sb.deleteCharAt(0);
            while(sb.charAt(sb.length() -1 ) == '0')
                sb.deleteCharAt(sb.length() -1 );

            return sb.length() == str.length();
        }
    }
}
