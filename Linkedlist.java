import javax.security.auth.Subject;

public class Linkedlist {
    Single head;
    Single tail;
    int size;
    public void Singlestart(){
        this.head = null;
        this.size = 0;
    }
    public void first(int data){
        Single da = new Single(data);
        da.next = head;
        head = da;
        size++;
    }
    public void End(int data){
        Single da = new Single(data);
        if(head == null){
            head = da;
            size++;
        }else{
            Single current = head;
            while(current.next != null){
                System.out.println(current.next);
                current =current.next;
            }
            current.next = da;
            size++;
        }
    }

    public void middle(int data,int position){
        Single da = new Single(data);
        if(position < 0 || position > size){
            System.out.println("incalid number is enter");
        }
        if(position == 0){
            first(data);

        }
        Single current = head;
        for(int i = 0; i < position -1 ; i++){
            current =current.next;
            System.out.println(current);
        }
        da.next = current.next;
        current.next = da;
        size++;
    }
    public void delete(int value){
        if(head == null) return;

        if(head.data == value){  // Compare data, not node
            head = head.next;
            size--;
            return;
        }

        Single current = head;
        while(current != null && current.next != null){
            if(current.next.data == value){
                current.next = current.next.next;
                size--;
                return;
            }
            current = current.next;
        }
    }
    public void reverse(){
        if( head == null) return;
        Single  current = head;

    }
    public boolean search(int value){
        if(head == null) return false;
        Single current = head;
        while(current != null){
            if(current.data == value){
                return true;
            }
        }
        return false;
    }

    public void travese(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        Single current = head;
        while(current != null){
            System.out.print(current.data + "->");
            current =current.next;
        }
        System.out.println("null");
    }
    public static  void main(String[] args){
        Linkedlist list = new Linkedlist();
        list.first(2);
        list.End(4);
        list.middle(7,2);
       list.End(8);
       list.middle(2,3);
        list.travese();
        list.delete(2);
        list.delete(8);
        list.travese();
        list.middle(1,1);
        System.out.println(list.size);
        list.travese();

    }

}
class Single{
    int data;
    Single next;
    Single(int data){
        this.data = data;
        this.next = null;
    }
}
class Double{
    int data;
    Double next;
    Double prev;
    Double(int data){
        this.data = data;
         this.next = null;
         this.prev = null;
    }
}
class Circule{
    int data;
    Circule next;
    Circule tail;
    Circule(int data){
        this.data = data;
        this.next = null;
        this.tail = null;
    }
}




