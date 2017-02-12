#Review Chapter one, 1.9

   * Reference values reside in the Heap.

   * In order to call or modify an object we need to have a variable pointing to it.

   * JS is composted of its core in ECMAScript, and the object from the environment where it is being implemented, think in web browsers, Adobe Flash.

   * In a browser, the main object is **Window.** ECMAScript interfaces the DOM and BOM.

   * The DOM has been been standardized. The BOM continues to be browser specific but is rapidly changing.

   * ECMAScript comes with **Native Objects,** which are always available, such as the **Gloabl Object, Array, Boolean, Data, Function, Math, Number, RegEx, and String.**

   * The running environment (such as a browser) adds to its own objects called **hosted objects.** In a browser, the **Global Object** *morphs in* to become the **Window.** Then we have the DOM and all sorts of proprietary objects known as **BOM** collection.

   * A variable is a given name *declared* under a given scope.

   * **A property is a variable + the data to which the variable points to.**

   * There is no scope protection inside of JavaScript code block, except if this code block is a function. ECMA 6 is introducing the **"let"**
   In JS, functions protect their variables, __but only if__ predefined with the prefix **var** when they are declared.

   * Although in the global scope the keyword "var" could be omitted because the variable is available down the scope chain, it is good practice to always write it in when declaring a variable in order to prevent confusion by JS interpreter. **var binds the variable to its immediate scope.** In the latest ECMA5, omitting var will throw an error.
