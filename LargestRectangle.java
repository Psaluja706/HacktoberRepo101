import java.util.*;
 
public class Main
{
     
    public static int MaxArea(int arr[], int n)
    {
        
        Stack<Integer> s = new Stack<>();
        s.push(-1);
        int max = arr[0];
        int left[] = new int[n];
        int right[] = new int[n];
        for (int i = 0; i < n; i++){
            left[i] = -1;
            right[i] = n;
        }
 
        int i = 0;
        while (i < n)
        {
            while(!s.empty()&&s.peek()!=-1&&arr[i]<arr[s.peek()]){
                right[s.peek()] = (int)i;
                s.pop();
            }
            if(i>0&&arr[i]==arr[(i-1)]){
                left[i] = left[(int)(i-1)];
            }else{
                left[i] = s.peek();
            }
            s.push(i);
            i++;
        }
 
 
        for(i = 0; i<n; i++){
            max = Math.max(max, arr[i]*(right[i] - left[i] - 1));
        }
 
        return max;
    }
     
    public static void main(String[] args)
    {
        int a[] = { 6, 2, 5, 4, 5, 1, 6 };
        System.out.println("Maximum area is " + MaxArea(a, a.length));
    }
}
