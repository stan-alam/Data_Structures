# 1.1 Prototypical versus Class-based

## Understanding the nature of JS object is the most important step for mastering JS

	JavaScript is about creating and destroying objects

JS is a **prototype-based** OO language. It is **not a classed based** like Python is. The main purpose of class based and prototype based languages are to full fill a niche in the OO ethos **by sharing code and avoiding redundancy.**

In a class-based languages the programmer creates a blue-print( the class )and then objects are derived from this *schematic.*

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

         Strings ARE immutable in JS : fixed values of which reside in the stack
         if the string is edited then the variable gets replaced by another
         string variable of a shorter or longer length and with the same name.

Since the variable and the data are the same when it comes to primitive values, the whole variable is replaced when we modify the string. This replacement happens because of the memory size necessary to accommodate the new data. The replacement happens in the background and is not noticeable to the user.


A sting value can store 0 + characters and is represented by a 16-bit positive integer. The first position is numbered [zero]
In a JS string the last position of the last character **IS** the length of the value in the string **minus one.** e.g.

So for the string **'Tony'** The first position of the last character is the length of 'Tony' - 1, or 4 -1 = 3. When a string contains actual textual data, each element is considered a single UTF-16 code unit.

If a string expands, **a new string replaces the old string** and the **old data is discarded**



##1.3 Variables vs Reference Types

**Numbers, Strings, Booleans** => JavaScript primitives.

As for **reference types**, these are **object definitions**. Other languages use *classes.* Classes are not used in the latest ECMA script. ECMA-262 is the specs for JavaScript and the browser in which it is executed in.

**Global Object** This is the prototype (the **template**) for which **every other object created will inherit** ***standard properties***

The Global object is a **mutant** it takes on a different life depending where it used, when in the browser, the gloabl object becomes the **Window Object**


```Javascript

  var stanObj = new Object();

```

Once *declared* as an object, the new object *stan* "inherits by pointing to" **properties* such as:

    A). A Constructor - Liken a constructor to a formula for creating similar future objects via the
    new operator. A constructor is a reference to a function. If you create new instances of an object,
    a constructor can be used as a script which services as an interface with rules of what can and
    cannot be allows on the new object to be. This simplifies conception and it saves memory because all
    objects can feed from its source ( the present source ), we only have to code this source once.
    independently of how many object instances there are.
    	An inherited constructor is a pointer to a source, and it not necessary for the
    functionality of the object already constructed. It serves only to give to a future object,the right
    to be born and exist via the constructor umbilical cord. A constructor takes advantage of the hidden
    parameter called this, a generic placeholder that will represent the object being processed.
    The English equivalent is the pronoun "whose."

    B) Prototype -- is another inherited property which is a built-in interface. Prototype acts an
    umbilical cord or pipeline for an object to inherit properties and methods from a parent.
    "Protos" or parent is the source of which the current object inherits properties/methods from
    another object somewhere above the chain. The usefulness of this link goes beyond the current object
    itself as other objects of a lower hierarchy may also inherit traits from their grandparent. Like the
    constructor, the prototype link is used only in retrieval. It has no effect on updating prototypes.
    This means that any change in the current object does not change its prototype or parent source. We
    can also think of prototype as a list of all methods the object is authorized to use. Every new
    instance of the object inherits this list.

**Do not think of JavaScript in terms of inheriting properties and methods.** Think of it in terms of interfaces. Some objects have methods. These methods can be interfaced with other objects down the pipeline and other objects can use them to create their own functionality which may or may not be similar to the parent object.

     Imagine that the Parent Object is a reservoir from which the water flowing this supply is the prototype
     chain. Water is the prototype chain in which properties/methods float, making themselves avialable to objects
     down the pipeline.

#2 Object Methods:

As for **inherited methods** e.g. stan inherits by "pointing to" **methods** from its parent object, the "Object" object, such as:

a) **hasOwnProperty** This method does *not* check *up* or *down* the chain of inheritance. It only verifies if the object in question has created **its own** properties ( for example property 'writer': does **object_name.OwnProperty('writer'))return true** *if* it exists **and if** it has been created, *not* inherited from up the chain.

does stanObj have it's own property of toString?

b) is **PrototypeOf** The ProtoTypeOf method allows to check if an object feeds its magic directly from another object. We need to include the term prototype in order to use this method. In other words, **"ObjectOne.isPrototypeOf(ObjectTwo)" will not work because JavaScript does not know what exactly we mean by that command.**

c) **propertyIsEnumerable** -- method is used to determine where the specified property is an object, *is visible enough*
listed to be enumerated in a script such as for ... in loop. *It actually lists the object own properties* because own properties can be enumerated, but all inherited properties are not in the *enumerable* list and will not appear on a 'for...loop'

d) **toString()** Every object has a toString() method. It is automatically called when the object is to be represented as a text value like when we alert(object) or console.log it. String conversation happens when a string representation of an object is required.

e) **valueOf()** JS returns the primitive value of a specified object. stanObj.valueOf(); may return an **Array, Boolean, Data, Function, Number, Object, String.** JS uses this method internally but can be called on purpose. Objects such as Math and Error do not have a built-in valueOf method.


##Back to Properties

         A property of an object can be explained as a variable attached to the new object
         * these properties will be overwritten when creating a new object.

in the case of stanObj = new Object(); **stanObj is NOT the object(duh!)**

stanObj is the label, a *symbol* technically stanObj is a variable, a pointer which temporarily resides in the stack and points to an **object** instantiated (cloned but using existing functionality ) from a **Template**. This object resides in the heap and once the object is reassigned or deleted the label (variable) stanObj goes into **garbage collection mode** from where it will be erased.

in JavaScript *almost* **is an object**. All primitive types **except null** and **undefined**, are actually treated as objects, because they are internally wrapped into objects, i.e. when the interpreter/browser needs to implement a method to process the primitive in question.

Because they can be wrapped as objects, properties and methods can be assigned to primitives, showing all the characteristics of an object. This is because **JS** has a prototype **reference** for **Boolean**, **Number** and **String** in its library, which is automatically called in when temporarily needed to wrap a primitive value:

## 1.4 Everything comes from Objects

```Javascript

  var z = new Object;

  typeof z;

  var b = z;

  var z = "hello";

  typeof z;


```

b still points to the object, while z has been replaced with a string.

All JS native objects start with a capital letter.

if z and b were pointing to the same object, and z modified the object, then b will also be pointing to the modified object.

This occurs only when we assign a **reference data to variables** if variable **a** is a string or **a** is a number, and is later assign it to be, such as that **b = a**, string a is copied to string b.

With primitives, each variable and its data is independent of any other variable.

primitives live on the stack

if a variable such as **b** is attached to an object such as 123 i.e. a number, now the type b *is* a number and the object that b was previously pointing to is by definition no longer viable and it is slated for garbage collection.


```Javascript

  var x = hat;

  var color = "azul"

  typeof x;

  // result is "string "

  typeof color;

  //string

  var shirt = { color: "white", size: "M", material: "cotton" };

  typeof shirt;

  //object


```

When the JS interpreted sees the curly braces it places the object into the heap, and the shirt variable as the pointer to the object.

e.g

```Javascript

  shirt.color;
  // "white"

  shirt.size;
  // "M"

  shirt.material;
  // "cotton"

```

**In JS almost everything is an object**

*variable declarations always terminate with a semicolon

```Javascript

  var shirt = { "color": "white", "size": "M", "material": "cotton" };

  typeof shirt;

  // object

```

By applying curly braces the JS engine saw that this variable declaration would be more complex than just a primitive. It places the object into the heap and allows the variable, i.e. 'shirt' to act as the pointer from the stack.

The variable 'shirt' has **properties** and **methods** inherited from the *Object template.* Use **Dot syntax** to access values within the object.

        An object is a bunch of mapped key-value pairs items harnessed together by a variable name, pointing to the data.


Brackets can also be used to access properties of the object.

```Javascript

  var shirt = { "color": "white", "size": "M", "material": "cotton" };

  shirt["color"];

  // white

  shirt["material"];
  // cotton

```

brackets allow to use numeric keys, while dot syntax does not allow the use of numbers.

##Objects##

Think of variables as symbols that point to data in the stack. The *stack* points to data in the *heap*; the key-value pairs are located in the heap, bound by a pointer in the stack. If no pointer exists, then no key value pairs will exist. Just as a coin, one side does not exist without the other. **An unassigned variable has a value of undefined but still exists** By assigning the variable to **null** will clear it from working memory.
To check if a variable is assigned or not use **typeof**


