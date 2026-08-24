import java.util.*;

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        int k = A.length;
        for(int i=0; i<k;i++){
            answer+= A[i]*B[k-i-1];
        }

        return answer;
    }
}