 #include <stdio.h> 
 #define SIZE 10

 typedef struct {
 	int item[SIZE];
 	int top; 	
 }Stack;  /*this is the definition of the structure type stack this way we can create as many stacks as we need*/

 /*prototype declarations*/
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