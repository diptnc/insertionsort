public class InsertionSort {

//    sorting algo
    public void sort(double arr[]){
        int n= arr.length;
        for (int i=1;i<n;i++){
            double key= arr[i];
            int j= i-1;
            while (j>=0 && (arr[j]>key)){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    display(arr);
    }
    public void display(double arr[]){
        for (int i=0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
double arr[]={24.37,35,27,9857};
InsertionSort obj = new InsertionSort();
obj.sort(arr);
    }
}
