public class myStack {
    
    String[] array;
    int top;
    int capacity;


    myStack(int capacity){
        this.capacity = capacity;
        this.array = new String[this.capacity];
        this.top = -1; // when the first value is pushed, this will be set to 0 and will be the first pos in the stack
      
        
    }

    void push(String value){
        if(this.top == this.capacity - 1 ){
            System.out.println("Stack is full");
        }
        else{ 
            this.top += 1 ;
            this.array[this.top] = value;
            System.out.println(value + " has been added to the stack");
            
            
        }
    }   
        
   void pop(){
        if(this.top == -1){
            System.out.println("This stack is empty");
            
        }
        else{
           System.out.println(array[this.top]+ " has been popped");
            this.top -= 1;
           

        }
   
    }

    void peek(){
        if (this.top == -1){
            System.out.println("The Stack is empty");
            

        }else{
            System.out.println(this.array[this.top] + " is the item that u peeked");
        }
    }

    String isEmpty(){
        if(this.top == -1){
            return "Is empty";
        }else{
            return "Not Empty";
        }
    }

    String isFull(){
        if(this.top == this.capacity - 1){
            return "Is full";

        }else{
            return "Is not full";
        }
    }

}
