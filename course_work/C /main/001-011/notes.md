## 01

How to implement Data structures from scratch :

Data Structures that are included in libraries, however, for a fundamental understanding of data structures :

It would be worthwhile to write the data structures from scratch. This will give you the **fundamental** understanding of 

data structures. 

You should be able to implement the best data structure for the problem domain. 

In Programming you have two things that are very important :

**Data

Instructions 

Write instructions to process data according to the need of the program

Data is kept in primary memory.

Data structure is just an efficient usage of this memory.

DS increases the scalability of the program.

## To be an efficient programmer, you must have a good knowledge of data structures


**Data Structures** 

We will be using the C programming language to cover data structures in depth


-------------------------------


# 02
## Stack

Linear abstract data structure where the elements could be added or deleted only at one end called the **top** of the stack

The elements follows  **'last in first Out Order'**, known as **LIFO**

In stack the element added last will be deleted first, the element that has been inserted first will be deleted last.

Insertion into the stack is called **push**

**pop** is the deletion of the element.

**If the stack is full** it is said to be in **overflow state** The push operation will be rejected.

**if the stack is empty it is said to in underflow** The pop operation will be rejected.

If you insert an element first, it will be pushed into the index.[0]

if you insert a second element it will be pushed into  the index.[1]

if pop an element the second element will be deleted in the index.[1] 

THe pop operation will always delete the top of the index stack. so index.[1] will be deleted, call it again, then 

index.[0] will be deleted. 

**a good example is the terminal UP arrow key**

THe terminal remembers the commands : When you run a command, the command is stored in the stack. Press the Up arrow key and you will see your last command, first.


-----------------------------------


# 03

## practical stack example

for example, a text editor will use the stack, and operations on the stack ..for example ctr-z, undoes the last operation.

**a good example is the terminal UP arrow key**

THe terminal remembers the commands : When you run a command, the command is stored in the stack. Press the Up arrow key and you will see your last command, first.


---------------------------------

# 04

## Implementation of Stack using 1 dimensional array 

building a stack using one dimensional array -- to keep track of the last element is inserted we need to create variable.

Anytime you push an element it will go the top. Before adding another element to the top we have to make sure that the array is not in overflow. index.[5] contain 0, 1, 2, 3, 4, 

if we use the push operation on index.[4] where index.[4] contains an element. e.g. (n - 1)

When pop make sure to check that the stack is in underflow state, last element gets deleted at the stack.

---------------------------------------

# 05

## Push Pop operation in C


```c

 #include <stdio.h> 
 #define SIZE 10

 typedef struct {
 	int item[SIZE];
 	int top; 	
 }Stack;  //this is the definition of the structure type stack this way we can create as many stacks as we need

 //prototype declarations
 void init(Stack *)
 void push(Stack *, int);  //the push function should return nothing, it should receive the stack pointer, the address to //the stack object to which it should push into

 int pop(Stack *); // here you can see that the pop function will return the stack address where the element is being 
 //deleted.

 //here are the operations

 void push(Stack *sp, int value) {  //push function to check if there's an overflow state
 	if (sp->top == SIZE - 1){
 	printf("Stack overflow\n");
 	return;
 	}

 	sp->top++; //implementing the top by 1 
 	sp->item[sp->top] = value; // assign the value to the top index of the array {01}

}

int pop(Stack *sp) {
	if (sp->top == -1){ //check to see if underflow
		printf("Stack underflow\n");
		return -9999; // you must return a value, even if an underflow, because pop is declared as an int
		// if the caller gets -9999 the caller will understand the state is in underflow
}
	int value;
	value = sp->item[sp->top]; //fetch the value from the top element
	sp->top--;  // increment the value by -1
	sp->item[sp->top] = value;

}



 }

 void init(Stack *sp) {
   sp-> top = -1;
 }


int main() {
	
	Stack s1, s2;
	init(&s1);
	init(&s2);
	push(&s1, 100);
	push(&s1, 200);

	push(&s2, 10); 
	push(&s2, 20);


	return 0;
}

// this stack is a fixed stack, size will always be 10;

```

{01} IN the push function the arrow operator is being used to sp-> is the pointer to the object and 



