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

A *thread* of execution **is** the *smallest* sequence of programmed instructions that can be managed independently. Multiple threads can coexist within the same process and share the same area.

**Memory can be divided into two distinct areas** the **stack** and the **heap**

A *stack* is a **restricted data structure.** A **restricted** amount of




