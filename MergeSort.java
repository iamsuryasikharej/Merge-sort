import java.util.Arrays;
import java.util.List;

public class MergeSort
{
    public static void main(String[] args) {
        
        int[] a=new int[]{99,44,55,33,77,100,22};
        sort(a,0,a.length-1);

        for(int temp:a)
        {
            System.out.println(temp);
        }

    }

    public static void sort(int a[],int i,int j)
    {
        if(i==j)
        {
            return;
        }
        else{
        int mid=(i+j)/2;
        sort(a,i,mid);
        sort(a,mid+1,j);
        merge(a,i,mid,mid+1,j);
        }
        
    }

    private static void merge(int[] a, int i, int mid, int j, int j2) {
        int high=j2;
        int low=i;
        int temp[]=new int[(j2-i)+1];
        int k=0;
        while(i<=mid && j<=j2)
        {
            if(a[i]<a[j])
            {
                temp[k]=a[i];
                k++;
                i++; 
            }
            else
            {
                temp[k]=a[j];
                j++;
                k++;
            }
        }

        if(i>mid)
        {
            for(int q=j;q<=j2;q++)
            {
                temp[k]=a[q];
                k++;

            }
        }
        else if(j>j2)
        {
            for(int q=i;q<=mid;q++)
            {
                temp[k]=a[q];
                k++;

            } 
        }

        //copy form temp to main

        for(int c=0;c<temp.length;c++){
            a[low]=temp[c];
            low++;
        }
    }
}