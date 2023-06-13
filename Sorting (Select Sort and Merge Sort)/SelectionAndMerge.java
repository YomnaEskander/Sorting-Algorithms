import java.util.Arrays;
import java.util.Random;


//This is the Merge method where it takes three arrays, the bigArray is the one that merges the left and right sorted subarrays.
public void merge(int L[],int R[], int BigArray[]){
    // i - to mark the index of left sub-array (L)
// j - to mark the index of right sub-array (R)
// k - to mark the index of merged array (A)
int i = 0;int j = 0;int k = 0;

while(i < L.length && j < R.length) { //this if condition sees if the number in L array is smaller than in 
                // the R arrY THEN puts it in the Bigarray 
if(L[i] <= R[j]) {
BigArray[k] = L[i];i++;
}else{ //else it puts the R number. also it increments 
BigArray[k] = R[j];
j++;
     }
k++;}//end of while
while(i<L.length) {BigArray[k] = L[i]; k++; i++;} //whether there are left overs in L and R
    //if there is still a left over in L and R is done, it will add it in A 3ala tol
while(j<R.length) {BigArray[k] = R[j]; k++; j++;}
}


//This is the mergeSort method, it is based on recursion. First it makes a base condition for the recursion to stop then it takes in an array. 

public void mergeSort(int Array[]) {
    //Variables		
        int n,middle; n = Array.length; middle = n/2;
    if(n<2) { // base condition. If the array has less than two element, do nothing.
                return ;
                    }
        int L[] = new int[middle];
        int R[] = new int[n-middle];
    for(int i = 0 ; i < middle ; i++) { // creating left subarray
            L[i] = Array[i];
            }
    for(int i = middle ; i < n ; i++) { // creating right subarray
                R[i-middle] = Array[i];
            }
        mergeSort(L); // recursive calls  
        mergeSort(R); // recursive calls
        merge(L,R,Array); //merge sorted halves.
        
        }
        // this merges the sorted left and right array into one array; 



//We sort the array in a descending matter by using first for loop as scanning the entire array.
    
public void selectsortDesend(int array[]){
        int n = array.length;
        int maxId, maxv;,
        ;
        int temp=0;
        for (int i=0;i <n-1;i++){
            maxId=i;
            maxva =array[i];
            for (int j= i+1 ; j < n ;j++){
                if (array[j] > array[maxId]){
                     maxId=j;
                     maxva=array[j];
                             
                }
            }   
               if(maxva > array[i]){ 
          temp =array[i];
          array[i]=array[maxId];
          array[maxId]= temp;
               }
        }}


//This is the ascending selectsort.

public void selectsort(int arr[]){
        int n = arr.length;
        int minId;
        int minva;
        int temp=0;
        for (int i=0;i <n-1;i++){
            minId=i;
            minva =arr[i];
            for (int j= i+1 ; j < n ;j++){
                if (arr[j] < arr[minId]){
                     minId=j;
                     minva=arr[j];
                             
                }
            }   
               if(minva < arr[i]){ 
          temp =arr[i];
          arr[i]=arr[minId];
          arr[minId]= temp;
               }
        }
    }


    

//This method generates random int and puts them in an array


static int[] generateRandom(int n){
    Random r = new Random();
    int[] x= new int[n];
    for (int i = 0; i < x.length; i++) {
       x[i]=(int)(Math.random()*1000);
       }
    return x;
    
}
