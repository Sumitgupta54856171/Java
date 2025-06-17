public class Queue {
int front;
int rear;
int size;
int[] bucket;
int maxSize;
Queue(int capacity){
    maxSize = capacity;
    bucket = new int[maxSize];
    front = 0;
    rear = -1;
    size = 0;
    System.out.println("Array-based queue created with capacity: " + capacity);
}
public void Insert(int data){
    if(fullsize()){
        System.out.println("this time memmory is full");
    }
    rear =(rear + 1)% maxSize;
    bucket[rear] =data;
    size++;
}
public int dequeu(){
    if(empty()){
        System.out.println("this memmory is empty");
    }
    int dequeuedata = bucket[front];
    front = (front + 1)% maxSize;
    size--;
    System.out.println(dequeuedata);
    return  dequeuedata;
}
public int search (int element){
    for(int i = 0; i<size;i++){
        int index = (front + 1)% maxSize;
        if(bucket[index] == element){
            System.out.println(bucket[index]);
            return i +1 ;
        }
    }
    return -1;
}
public void printls(){
    if(empty()){
        System.out.println("this list is empty");
    }
    for(int i= 0;i<size;i++){
        System.out.print(bucket[i]+"->");
    }
}
public int size(){
    return size;
}
public boolean empty(){
    return size == 0;
}
public boolean fullsize(){
    return  size == maxSize-1;
}
public static void main(String[] args){
    Queue li= new Queue(10);
   li.Insert(3);
   li.Insert(4);
   li.Insert(5);
    System.out.println(li.size());
   li.printls();
   li.dequeu();
    System.out.println(li.size());
    li.printls();
}
}
