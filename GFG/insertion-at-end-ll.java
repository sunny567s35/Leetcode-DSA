
class Solution:
    #Function to insert a node at the end of the linked list.
    def insertAtEnd(self,head,x):
        # code here 
        newNode = Node(x)
        if not head:
            return newNode
        temp = head
        while temp.next :
            temp = temp.next;
        temp.next = newNode
        return head

