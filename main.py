class myStack:
    
    def __init__(self, capacity):
        self.capacity = capacity
        self.arr = []
        self.top = -1
    
    
    def push(self, input):
        if len(self.arr) == self.capacity:
            print('Stack is full')
        else:
            self.top += 1
            self.arr.append(input)
            print(f'{input} has been added to the stack')  
            
    
    def pop(self):
        if self.top == -1:
            print('The stack is empty')
        
        else:
            item = self.arr[self.top]
            print(f'{item} has been popped') 
            self.top -= 1
    
    def peek(self):
        if self.top == -1:
            print('the stack is empty')
        else:
            item = self.arr[self.top]
            print(f'{item} is the item you have peeked at') 
    
stack = myStack(5)

stack.push("a");
stack.push("b");
stack.push("c");
stack.push("d");
stack.push("e");
stack.push("f");
stack.pop()
stack.peek()