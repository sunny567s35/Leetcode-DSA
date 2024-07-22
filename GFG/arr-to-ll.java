class Solution {
    static Node constructLL(int arr[]) {
        // code here
        Node start  = new Node();
        Node dummy = start;
        dummy.data = arr[0];
        for(int i =1 ;i<arr.length ;i++){
            
            Node temp = new Node(arr[i]);
            dummy.next = temp;
            dummy = temp;
            
        }
      
        return start;
    }
}