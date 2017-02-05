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

A *thread* of execution **is** the *smallest* sequence of programmed instructions that can be managed independently. Multiple threads can coexist within the same process and share the same area.

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

When the JS interpreter sees the curly braces it places the object into the heap, and the shirt variable as the pointer to the object.

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

Think of JS as a collection of objects inheriting functionality from their "parent object" to which they interface with.

New objects can also override the original properties and methods and create their own.

Newly created properties can be passed on down the pipeline via the object's **prototype** property every time we instanstiate or ( reproduce ) the object. We can also use the prototype to assign (adding) new functionality to the existing object, even to the global **for this particular instance**, anything that is added to the global object is temporary.

```Javascript

 var shelf = {"books":20, "CDs": 57, "Magazines": 19 };

 shelf.CDs;
 // 57

 shelf.books
 // 20

 shelf.books = 21;

 shelf.books;
 // 21

 shelf;
 //results in Object{books: 21, CDs:57, Magazines: 19}

                 // assign new items to the object:
shelf.audioBooks = 11;


//now call the object

shelf;

//result: Object{books: 21, CDs:57, Magazines: 19, audioBooks: 11};


```

**In this way a** *variable* **can point to a collection of data in key-value pairs, making the collection an object.** JS has **object wrapping**


```Javascript

var x = "pitbull";

typeofx;

// result: 4

x.substring(0,3);
//result pit



```

**the 0 ** parameter represents the first included character for the substring and the **3** parameter represents the first **excluded** character.



## Assigning functions to a variable


```Javascript

var addMe100 = function (param1) {
  var result = param1 + 100;
  return result;
};


```

the **};** is the **function definition statement**, meaning that the defining variable **addMe100** *points* to some unnamed function
object on the heap, which in turn adds 100 to any *argument* passed in by the parameter. By adding a semicolon at the end you are assigning a variable, the same with this function. Functions are objects and **objects can also be a collection of functions**

          A collection of functions designed to perform a specific assignment for an object is called a method.
          Sometimes a method has only one function, other times, a method compromises of several functions in
          the same method.

When aggregating functionality that works together to attain a specific outcome/behavior is an object. Objects within objects make up a package known as a program.

**The max number of parameters for a function in JS is 255** The parameter is the placeholder inside the parenthesis and is an **object array-lookalike** holding a max of 255 parameters. **Data is passed into the function by using the placeholder in the parenthesis, or parameter. The data is called the** *argument.* Data is then passed out of the function with the **return** statement. When the **return** is reached it acts as a **break** or halts the execution continuation of the function. When return is reached the function instance is destroyed, unless another variable is still pointing to it.

Functions can be called *externally* as in the example, or *internally* within their own body. This is called **Recursion**

In JS **functions are objects** They can be passed around just as any other object does.

**Deference** the variable (i.e. the pointer) in order to remove it from the browser's memory, because **it is a global** variable and it will remain in memory until the program terminates. Deference means to **remove the reference** by making the variable **null.** This will eventually **clear the variable and the function.**


```Javascript

var addMe100 = function (param1) {
  var result = param1 + 100;
  return result;
};

addMe100 = null;

```

Using typeof for checking the *type* of the addMe100, typeof method will return an empty *object*, calling the function will result in the JS interpreter displaying 'Uncaught TypeError: addMe100 is not a function at anonymous:1:1'

##1.6 Named Functions vs Anonymous Functions

The function **addMe100();** is an **anonymous** function. Meaning that the function is assigned to a **variable declaration** and it is an **expression** ( part of a program) of the *declared* variable.

**In JavaScript we have variable declarations such as this"**

**var x;**

**We can also have function declarations:**

**function y(){};**

Declarations can have expressions such as:


```Javascript

x = 123;

// or this:

y () {
  console.log("I am an expression... what are you ?");
}

```

At the same time: **variables** can have **functions as expressions:**


```Javascript

var z = function() {


  console.log("This function is an expression of z");



};   //<-------------- notice the semicolon at the closing parenthesis, you will see this a lot in nodeJS
```


When a variable is declared it is usually **hoisted** or pulled up to the top of the **scope** by the interpreter, which lists all *variable declarations* on the top. Sort of like an index of what's available. **Only the declaration is hoisted not the expression.** This makes a difference when debugging the code and not so much the program at execution.

```Javascript

x = 123;

// or this:

y () {
  console.log("I am an expression... what are you ?");
}

var z = function() {


  console.log("This function is an expression of z");



};

```

The following is figuratively described as on the top of the scope:

**x, y(), z**

The function z resembles a variable, i.e. because only the **declaration name is hoisted** and not the expression. It only means a bit more work when it comes to debugging.

The other difference between **y** and **z** : i.e. **y** can be called before it is declared in the function script because JS already recognizes **y** as a function and it will look for it. However, in **z**, of we call the function in **z** before the function assignment is written, there may be an error.

     It is considered a best practice to declare all functions before calling them.

Besides this using **anonymous** functions is a powerful technique, if implemented wisely, JQuery makes a lot of use of said functions.

#Review Chapter one, 1.7

  * JavaScript is a **prototype-based language**

  * Just like classes, prototyping avoids repeating code which saves memory and simplifies the script.

  * **Memory** is subdivided between **stack** and **heap**. Stack acts as a scratch pad for short length data such as **primitives** and other other temp data. Longer more detailed data such **objects** of any kind, are written in the **Heap**.

  * Objects are accessed by creating **pointers** which are variables. Once the dereference a pointer, the object goes into delete scheduled via garbage collection. Browsers determine garbage collection.

  * **primitive types** reside in the *stack* and **Reference Types** reside in the **HEAP**

  * To **deference** an object we declare the pointer variable as *null*

  * An object can be created by instantiating it from the object Object( **the global object**).

  * Once we declare an object, it inherits the **properties** and **methods** from the prototype that we "cloned" it from, as well as any parent of this prototype further up the chain.

  * When a variable is declared containing strings as *key-value pairs* the data **is saved as an object in the Heap.** While the variable is saved in the stack. The values can be accessed by using the **Dot syntax** or the **Bracket syntax.** It is important to know both methods.

  * Since everything is an object, functions and arrays are also object in their own right and they all inherit from the object **Object.**

  * When we declare variables or functions their names are *hoisted* to the top of the **Scope** so JS knowns they exist. Their expressions are not hoisted, they will be evaluated *at runtime* once the script reaches it, the *pointer* get acknowledged at the very top. This means that it comes to existence immediately.

  * A **named function** is a **declared function.** It is listed at the top of the scope as a function and not as a simple named variable. It comes to existence immediately.

  * An **anonymous function** is a function *assigned* to a variable. It acts an expression of the variable. We terminate the variable assignment with a **semicolon.**

  * When a function calls itself within its own body it is called **recursion.**


# 1.8 The Untouchable Object

**The object resides in the *heap*. An object is a **reference type.**

**How do we access an object?** - We access an object by assigning a label to it. **This label is known as a variable.** The variable points to the object.

**What happens to the object when the variable is removed?** - The object is placed automatically in garbage collection to be deleted in the browser.

**Can we directly touch the object we remove the variable?** - **NO!** We need to us a *pointer* i.e.(variable) to handle the object. Through the pointer and other manipulative techniques therefrom, we are able to manipulate or modify the object **via interface mechanisms** which depend on properties and methods available to the object.

Objects inherit from the mother object, or the JS object template.

    Objects are created by JS when we assign a variable to the object. The variable resides in the stack
    and points to the location of the object in the heap. WIthout this umbilical cord leading the program
    to the object, there is no object. If we cut the umbilical cord, we deference the variable (declaring it
    null or reassigning it to something else), the object ceases to exist. :(
    Without a variable pointing to the object there can be no object if the object has been created from
    scratch, or instantiated from another object. Native objects such as built in objects and the
    Object always exist. They are in standby waiting to be called by another variable whenever needed.
    The permanent library never ceases.

**This is an important concept** - JS is not just ECMAScript. JS is a combination of ECMAScript and environment where it is being used such as the browser( ie. the DOM & BOM ). ECMAScript is implemented by a JS Engine. There are several engines being used. e.g. Google's V8.


# 1.8.2 Native Objects



