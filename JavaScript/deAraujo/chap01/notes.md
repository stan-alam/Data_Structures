# 1.1 Prototypical versus Class-based

## Understanding the nature of JS object is the most important step for mastering JS

	JavaScript is about creating and destroying objects

JS is a **prototype-based** OO language. It is **not a classed based** like Python is. The main purpose of class based and prototype based languages are to full fill a niche in the lOO ethos **by sharing code and avoiding redundancy**

In a class-based languages the programmer creates a blue-print( the class )and then objects are derived from this *schematic*

Like in a class paradigm, this technique avoids repeating code and it saves memory. **In a prototype language, the programmer creates an object and allows it to become a prototype** for the creation of other objects. In theory this allows objects to be linked together in a *hierarchical* manner. The code can reused forming a protoypical chain.

When an object needs a tool i.e. method, it goes up the chain until it grabs one from one of its ancestors(parent or grandparent)

This classless model of language, also known as instance-based or **prototyped oriented programming** works with a process known as **delegation**

     delegation : one object relying upon another to provide a specified set of functionality.
     It works because JS relies on its real time environment to make its magic. Like a water
     in a river its never the same the second time around. - Heraclitus

Although it looks like a class based language, it is not. *familiarity takes off the edge of admiration*
Admire JS for what it is not by what it looks like.


#1.2 The Memory Concept

Memory management or the act of *managing computer memory* is defined as a way to dynamically allocate portions of memory to a program **at** its request. It is also the act of freeing memory for reuse when data is no longer needed ( in JS this is done by the Web Browser, e.g. the V8 engine )

A *thread* of execution **is** the *smallest* sequence of programmed instructions that can be managed independently. Multiple threads can coexist within the same procless and share the same area.

**Memory can be divided into two distinct areas** the **stack** and the **heap**

A *stack* is a **restricted data structure.** Only a small number of operations can performed in it. Usually this data points to bigger data on the *heap.* e.g. **Variables pointing to objects**

When the operations are done, the data is **automatically cleared** to give space for the next batch. In a way the stack acts a **scratchpad** for memory operations, and for the most part, only **quick data such as points**(variable names) reside in the stack.

**The HEAP** is a completely different matter. To start with, the data in the heap is not as well organized as in the stack, and **chunks of data can be stored ad-hoc**, in the heap: **if piece of data gets larger** memory can be allocated as needed.
THis makes **makes the heap slower than the stack.** Stack memory is faster because in the stack, each data set has a specific size under strict managements.**

	In JS primitive type values are stored in the stack
	and Reference type values are stored in the heap

**A reference is something being referred by something else and without the referrer, there is no reference!**

JS primitive types:

   * Number

   * Boolean

   * String

   * Null

  * Undefined

Since these are *simple values* they are stored **directly** in the location by the variable itself (in the **Stack** ): they are one and the same. For other types of data, **variables are nothing but labels** or symbols that point to the bigger stuff at the heap.

**Reference type values** have their variable name stored in the stack ( acting as a **pointer** to the real data in the heap )

The **Undefined** type is assigned to any *declared* variable that does not yet have a specific value. An undefined variable has no **length property** because it has exactly *one* value called **undefined** so a length property would be useless.

**Null** is usually a *placeholder* for an **object** and the reason why it is considered a primitive in JS is due to an error made earlier in ECMAscript Standard. It remains a primitive due to historical reasons. It also has only an exact value and that is itself, **NULL** Variables with value of *null* are eventually erased from memory.

**Boolean** type represents a logical entity having *two* values, true or false

**String** primitive type, normally in other languages are considered as reference types, however in JS they are considered to be a **Primitive Type**

         Strings are not immutable