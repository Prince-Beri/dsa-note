public class lastMomentBeforeAllAntsFallOutOfAPlank {
    public int getLastMoment(int n, int[] left, int[] right) {
        int maxLeft = 0, minRight = Integer.MIN_VALUE;
        for(int l: left){
            maxLeft = Math.max(l, maxLeft);
        }
        for(int r: right){
            minRight = Math.min(r, minRight);
        }

        return Math.max(n - minRight, maxLeft);
    }
}
