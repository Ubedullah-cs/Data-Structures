interface list{
    boolean isEmpty();
    int size();
    void add(int item);
    void add(int index,lindedlist.Node item);
    void remove(lindedlist.Node item );
    lindedlist duplicate();
    lindedlist duplicateReversed();
}
class lindedlist implements list{
    Node head;
    int size;
    lindedlist(){
        size=0;}
class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;}}

            public void sort(){
             if(size>1){
                for(int i=0;i<size-1;i++){
                    Node currentNode=head;
                    Node prev=null;
                    while (currentNode!=null && currentNode.next!=null) {
                        Node nextNode=currentNode.next;
                        if(currentNode.data>nextNode.data){
                            currentNode.next=nextNode.next;
                            nextNode.next=currentNode;
                            if(prev!=null){
                                prev.next=nextNode;
                            }else{
                                head=nextNode;
                            }
                            
                        prev=nextNode;}else{
                            prev=currentNode;
                            currentNode=currentNode.next;
                        }}}}}
        

    public boolean isEmpty(){
                if(head==null){
                    return true;}
                    return false;
            }
   public void add (int item){
    size++;
    Node newNode=new Node(item);
    if(head==null){
        head=newNode;
    }else{
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }temp.next=newNode;}}
        public void add(int index,Node item ){
            if(index<=size+1){
                if(index==1){
                    item.next=head;
                    head=item;
                }else {
                    Node temp=head;
                    for(int i=0;i<index-1;i++){
                        temp=temp.next;
                    }
                    item.next=temp.next;}}}
                    
    void remove(int index){
        if(index==1 && head!=null){
            head=head.next;
        }else{
            Node temp=head;
            for(int i=1;i<index;i++){
                temp =temp.next;
            }
            temp.next=temp.next.next;}}
    public lindedlist duplicate(){
        lindedlist duplist=new lindedlist();
    Node temp=head;
    while (temp!=null) {
        Node newNode=new Node(temp.data);
        if(duplist.head==null){
        duplist.head=newNode;
        temp=temp.next;
        }else{
            Node duptemp=duplist.head;
            while(duptemp.next!=null){
          duptemp = duptemp.next;}
          duptemp.next=newNode;
          temp=temp.next;}}
    return duplist;}
    public lindedlist duplicateReversed(){
        lindedlist dupReverse =new lindedlist();
        for(int i=0;i<=size;i++){
        Node temp=head;
        for(int j=i;j<size;j++){
            temp =temp.next;}
            Node newNode=new Node(temp.data);
            if(dupReverse.head==null){
                dupReverse.head=newNode;
            }else{
                Node duptemp=dupReverse.head;
                while (duptemp.next!=null) {
                    duptemp=duptemp.next;}
               duptemp.next=newNode;}}
return dupReverse;}
public String toString(){
    System.out.println("size :"+size());
    System.out.println(" - ");
    Node temp=head;
    while (temp!=null) {
        System.out.println(temp.data+" , ");
        temp=temp.next;}
        return "";}
    public void remove(Node item){
        Node temp=head;
        Node pretemp=null;
        while (temp!=null) {
            if(item.data==temp.data){
                pretemp.next=temp.next;
                break;
            }else{
                pretemp=temp;
                temp=temp.next;}}}
public int size (){
    int size =0;
    Node temp=head;
    while (temp!=null) {
        size++;
        temp=temp.next;
    }
    return size;}
}
    class Lab2Ex3{
        public static void main(String[] args) {
            lindedlist list=new lindedlist();
            lindedlist.Node n=list.new Node(8);
            list.add(1);
            list.add(3);
            list.add(5);
            list.add(4,n);
   lindedlist duplist=list.duplicate();
   lindedlist ReversedupList=list.duplicateReversed();
   System.out.println("original list");
   System.out.println(list+"\n");
   System.out.println("Duplicate list ");
   System.out.println(duplist+"\n");
   System.out.println("Reversed list");
   System.out.println(ReversedupList+"\n");

   System.out.println("After removing n node from original list :");
   list.remove(n);
   System.out.println(list);
        }
    }