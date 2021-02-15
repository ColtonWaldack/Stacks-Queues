import java.util.ArrayList;

public class Assignment2 {
 ArrayList<String> fruit=  new ArrayList<String>();
 ArrayList<String> q =  new ArrayList<String>();

 public class Stack {

  public void push(String node) {
   fruit.add(node);
  }

  public String pop() {
   if(!isEmpty()) {
   String value = fruit.get(fruit.size()-1);
   fruit.remove(fruit.size()-1);
   return value;
   }
   else {
    System.out.println("There is nothing to pop");
    return null;
   }
  }
  public boolean isEmpty() {
   return fruit.size()==0;
  }
  public void printStack() {
  int L = fruit.size() - 1 ;
  int i = 0;
  System.out.println("---Stack----");
  while ( i <= L) {
  System.out.println(fruit.get(L));
  L--;
 }


  }

  public Stack() {




  }

 }

  public class Queue{


  public void enqueue(String node) {
   q.add(node);

  }


  public String dequeue() {
   if (!isEmpty()) {
    String value = q.get(q.size() - 1);
    q.remove(q.size() - 1);
    return value;
   } else {
    System.out.println("There is nothing to dequeue");
    return null;
   }
  }

  public boolean isEmpty() {

   return q.size()==0;

  }
  public void printQueue() {
   int L = q.size() - 1 ;
  int i = 0;
  System.out.println("---Queue----");
  while ( i <= L) {
  System.out.println(q.get(i));
  i++;
 }

  }

  public Queue() {

  }
 }



 public Assignment2() {
  Stack fruits= new Stack();
  fruits.pop();
  fruits.push("Apple");
  fruits.push("Banana");
  fruits.pop();
  fruits.push("Canned Yams");
  fruits.push("Durian");
  fruits.printStack();
  fruits.pop();
  fruits.pop();
  fruits.printStack();

 Queue q = new Queue();
  q.enqueue("Job 1");
  q.enqueue("Job 2");
  q.enqueue("Job 3");
  q.printQueue();
  q.dequeue();
  q.dequeue();
  q.printQueue();
  System.out.println(q.isEmpty());
  q.dequeue();
  System.out.println(q.isEmpty());





 }


 public static void main(String[] args) {
  new Assignment2();

 }
}


