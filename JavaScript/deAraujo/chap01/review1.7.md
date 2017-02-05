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

  * When a function calls itself within its own body it is called *recursion.*

  * fin