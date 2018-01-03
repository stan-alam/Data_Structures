## JS Functions and Arguments as Objects
```text

░░░░░░░░░░░░░░░░░░░░░░░░░░░░░
░░░░░░░░░░░░░▄▄▄▄▄▄▄░░░░░░░░░
░░░░░░░░░▄▀▀▀░░░░░░░▀▄░░░░░░░
░░░░░░░▄▀░░░░░░░░░░░░▀▄░░░░░░
░░░░░░▄▀░░░░░░░░░░▄▀▀▄▀▄░░░░░
░░░░▄▀░░░░░░░░░░▄▀░░██▄▀▄░░░░
░░░▄▀░░▄▀▀▀▄░░░░█░░░▀▀░█▀▄░░░
░░░█░░█▄▄░░░█░░░▀▄░░░░░▐░█░░░
░░▐▌░░█▀▀░░▄▀░░░░░▀▄▄▄▄▀░░█░░
░░▐▌░░█░░░▄▀░░░░░░░░░░░░░░█░░
░░▐▌░░░▀▀▀░░░░░░░░░░░░░░░░▐▌░
░░▐▌░░░░░░░░░░░░░░░▄░░░░░░▐▌░
░░▐▌░░░░░░░░░▄░░░░░█░░░░░░▐▌░
░░░█░░░░░░░░░▀█▄░░▄█░░░░░░▐▌░
░░░▐▌░░░░░░░░░░▀▀▀▀░░░░░░░▐▌░
░░░░█░░░░░░░░░░░░░░░░░░░░░█░░
░░░░▐▌▀▄░░░░░░░░░░░░░░░░░▐▌░░
░░░░░█░░▀░░░░░░░░░░░░░░░░▀░░░
░░░░░░░░░░░░░░░░░░░░░░░░░░░░░

```

 ⭐️

Arguments

Arguments are not longer properties of the function, as of ECMA 5 args are **objects** and look like arrays. They have only one array property available and it is **length.**

**Length is important property because it facilitates iteration by looping over each existing arguments' element.**

An *arguments object* acts like a local variable of the function. It is operational with functions. It is called **into action by the function itself.**
It can also **be called by any subfunction** i.e after proper binding is applied...

**You cannot explicitly create an arguments object** it only becomes available when a function **begins** its execution. This *arguments* object has an array with a holding capacity of 255 items.

**argument parameters is declared in individually within the function parentheses. There is no formalization of the parameter's declaration**
In order to pass data into the function. It depends on the code inside the function asks for the particular input data.

💜

e.g.

```javascript
                    // no formal data going in to the function
var x = function () {
  return arguments; //data out
};

```

1. You can call the function and include a few values:

```javascript

x("hamster", "velociraptor"); // returns all arguments passed in: ["hamster", "velociraptor"]

```
🐍

2. You can call the function with *more* Values

```javascript

x(1,2,3,4,5,6,7,8,9); // which returns [1,2,3,4,5,6,7,8,9]

```

Although *arguments* **looks like an array** it is **NOT AN ARRAY** It can be converted into an array by using the array's **slice()** function.method
and once it is converted to an array, you can use its data for further processing.

e.g. **This will multiply all the arguments by using the array reduce() function.method**
🍖
```javascript

var x = function() { // see there are no formalized parameters

var abc = Array.prototype.slice.call(arguments);

return abc.reduce(function(previousValue, currentValue, index) {
    return previousValue * currentValue;
  });

};

x(2,3,4,5);

//returns 120


```

On line 50 there are no **formalized parameters** for x. On line 52 a variable called abc is declared. Here we assign an extraction of the object **arguments** of the function x as an array, by utilizing **slice()** It will be called by its full path for **abc** to recognized as an array.
We could have used a short cut. e.g.

```javascript

var abc = [].slice.call(arguments);


```

On that same line 52, we use the .call() function. Which is a method from the function object. The **.call()** method makes sure we apply **"this"**
to the intended target by binding it to whatever we name in the inside parentheses. In this case *"from this particular function which name is x call* **its** *arguments.*

Line 54 mathematically **reduces** the new array and returns its calculation.

Line 60, calls the function and returns the value of "120"

```javascript

var x = "I am x!";

var a = function() {
  var getX = Array.prototype.slice.call(x); // here you're calling the variable x
  return getX;
}

a();

//output will be : ["I", " ", "a", "m", " ", "x", "!"]

```

Here on line 86 you declared a string variable x. **on line 88 you created a function (a)** which is somewhat similar to the function for x where getX variable was declared and assigned it the variable "x." **here we point to the array "x" by including it as the first parameter in the call() function.method.** Do remember that call() redirects "this." **Normally 'this' is pointing at the object that owns the script at the time of execution/action.**

On line 89 : Just as previously we request the **prototype of the Array's slice and apply it to whatever is being pointed by the call() method.**

On line 93 : We call the function **a()** which returns an array of the string ... which is expressed on line 95

### Now Back to the main discussion ...

### Why would you formally include parameters in a function, when in fact you can pass in any arguments without formally using parameters?

When we include parameters, you will be establishing a *sequence* of items. These items will be sent to the function, which allows for specific processing of each argument.

```javascript

var nirv = function (x,y) /*here is the data going into the function */ {  
  return "x= " + x + ", y = "+ y;
  //the return is the data out, duh!
};
//here is what the output would be for sending 2, and 11 to the nirv function`
//nirv(2,11);
//"x= 2, y = 11"

```
👀

If you want you can also send in three parameters... although, that last third parameter will be dismissed. The return statement in the nirv function doesn't have anyway to "grab"
or store it, i.e. store it in memory for processing. If you do not include a parameter then the result will be undefined for the count of that parameter. e.g. Lets say your call to the function looks like this ...

```javascript

//console
//>nirv(2);
// the last parameter for the y variable is NOT sent tot he function for processing, although the function was wait for two parameters.

```

**You can plug 255 parameters into javascript's parameter acceptor**

By adding **arguments** as a return value, you will allow the function nirv() to accept up to 255 values in which it will be able to return to console.

🐵

```javascript


var nirv = function (x,y) /*here is the data going into the function */ {  
  return arguments;

};

/* this is the console output
nirv(2,3,5,43,3);
Arguments(5) [2, 3, 5, 43, 3, callee: ƒ, Symbol(Symbol.iterator): ƒ]0: 21: 32: 53: 434: 3callee: ƒ ()length: 5Symbol(Symbol.iterator): ƒ values()__proto__: Object
*/

```

Another example, accessing unlimited arguments with a **for loop** targeting the length of the argument. 💎 LIKE SO ....

```javascript

var ana = function () {
  for(var i = 0; i < arguments.length; i++) {
    console.log(arguments[i] + " is a banana");
  }
};

/* console output
ana("raptor","gerbil","T-rex", "ophthalmosaurus");
VM23094:3 raptor is a banana
VM23094:3 gerbil is a banana
VM23094:3 T-rex is a banana
VM23094:3 ophthalmosaurus is a banana
*/

```

**You would be using formal parameters whenever you are using specific sequence of inputs** If you wish to **be creative**  🐸


# Nested Functions!... yay!

### Nested functions are functions inside of functions!
These inner functions have access to all the data of the outer functions! This is some powerful "stuff", here! These are some important characteristics of inner functions and outer functions!!!!

# Closures!

1. Say there is an array that is assigned to a variable named "**bobMarley**":

```javascript

var bobMarley = [4,5,6,7,8,9];

```

2. Now we assign to **bobMarley** to another variable let's call it "**whalers**", and then to top it off.. we assign **whalers** to **legend** :

```javascript

var whalers = bobMarley;

var legend = whalers;


```
Here we created three different variables that are pointed to the heap. We can reassign the variable 'bobMarley' to null, but the array will still exist under the names of 'legend', and 'whalers.'

**as long as the array is still has some variable pointing to it... that array will not be garbage collected.**

```js
/*
var bobMarley = [4,5,6,7,8,9];
undefined
var whalers = bobMarley;

var legend = whalers;
undefined
var bobMarley = null;          <--------------- notice how we set bobMarley to null
undefined
whalers;                       <=============== and here whalers still holds the values that once belonged to bobMarley
(6) [4, 5, 6, 7, 8, 9]
legend;                        <~~~~~~~~~~~~~~~~ same here with the variable 'legend'
(6) [4, 5, 6, 7, 8, 9]
*/

```
👄

<a>
  <img src="https://github.com/stan-alam/Data_Structures/blob/develop/JavaScript/deAraujo/chap03/svg_files/kiteJSobj.svg" width="50%" height="50%">
</a>

**Above diagram**
Sam and Molly are holding the same  kite. While at Execution Time: Sam lets go of the kite(he's 'swaze') but the kite remains in place because Moly is still holding it.

The kite is secure due to the closure principle. If 'A'knows 'B' and 'B' knows 'C' then A must know 'C'

# The CLOSURE principle

          Knowledge is closed under entailment. Entailment means logical consequence. If 'A' knows 'B'
          and 'B' entails 'C', then A knows C.


If the array bobMarley was set to null, then the array will be marked for garbage collection. **yet the variables "whalers" and "legend" have closure on the array. Thisway the array is able to survive the garbage collection of its original pointer ... the variable known as 'bobMarley.'** *essentially the array lives on in the whalers and legend variable(s)*

```text

::::    ::::   :::::::: :::::::::     :::     ::::::::: :::::::::::      :::       ::::::::                            ::::::::  :::    :::  ::::::::   :::::::: :::::::::::
+:+:+: :+:+:+ :+:    :+:     :+:    :+: :+:   :+:    :+:    :+:          :+       :+:    :+:                          :+:    :+: :+:    :+: :+:    :+: :+:    :+:    :+:     
+:+ +:+:+ +:+ +:+    +:+    +:+    +:+   +:+  +:+    +:+    +:+                   +:+                                 +:+        +:+    +:+ +:+    +:+ +:+           +:+     
+#+  +:+  +#+ +#+    +:+   +#+    +#++:++#++: +#++:++#:     +#+                   +#++:++#++                          :#:        +#++:++#++ +#+    +:+ +#++:++#++    +#+     
+#+       +#+ +#+    +#+  +#+     +#+     +#+ +#+    +#+    +#+                          +#+                          +#+   +#+# +#+    +#+ +#+    +#+        +#+    +#+     
#+#       #+# #+#    #+# #+#      #+#     #+# #+#    #+#    #+#                   #+#    #+#                          #+#    #+# #+#    #+# #+#    #+# #+#    #+#    #+#     
###       ###  ######## ######### ###     ### ###    ###    ###                    ########                            ########  ###    ###  ########   ########     ###     *the

hottest band on the Internet




_   .-')                   .-') _  ('-.     _  .-')   .-') _                     .-')                            ('-. .-.               .-')    .-') _    
( '.( OO )_                (  OO) )( OO ).-.( \( -O ) (  OO) )        ,--.       ( OO ).                         ( OO )  /              ( OO ). (  OO) )   
,--.   ,--.).-'),-----. ,(_)----. / . --. / ,------. /     '._       \  |      (_)---\_)              ,----.    ,--. ,--. .-'),-----. (_)---\_)/     '._  
|   `.'   |( OO'  .-.  '|       | | \-.  \  |   /`. '|'--...__)       `-'      /    _ |              '  .-./-') |  | |  |( OO'  .-.  '/    _ | |'--...__)
|         |/   |  | |  |'--.   /.-'-'  |  | |  /  | |'--.  .--'                \  :` `.              |  |_( O- )|   .|  |/   |  | |  |\  :` `. '--.  .--'
|  |'.'|  |\_) |  |\|  |(_/   /  \| |_.'  | |  |_.' |   |  |                    '..`''.)             |  | .--, \|       |\_) |  |\|  | '..`''.)   |  |    
|  |   |  |  \ |  | |  | /   /___ |  .-.  | |  .  '.'   |  |                   .-._)   \            (|  | '. (_/|  .-.  |  \ |  | |  |.-._)   \   |  |    
|  |   |  |   `'  '-'  '|        ||  | |  | |  |\  \    |  |                   \       /             |  '--'  | |  | |  |   `'  '-'  '\       /   |  |    
`--'   `--'     `-----' `--------'`--' `--' `--' '--'   `--'                    `-----'               `------'  `--' `--'     `-----'  `-----'    `--'    *the hottest band on the

Internet

```

In JS a **closure** is usually referred to functions. **When a function returns it sent to garbage collection**. In this case with bobMarley, whalers, legend variables there is an **inner function** still holding the thread to the **inner variables of the outer function** in this case those variables will not be destroyed. **These inner variables are said to be held in** *execution context*.

```JavaScript

var kiteFlying = function(blackKite) {
    var sam = "has the kite";

    function molly() {
        return sam;
    }
    if (blackKite == "sam") {
        return sam;
    } else {
        return molly();
    }
};

```

```
//console :
kiteFlying("sam");
"has the kite" //output
kiteFlying("molly");
"has the kite" //output

```

"sam" returns the variable **sam** which is "has the kite."

"molly" input triggers the *else* condition, which in turn triggers the function **molly()** which then in returns the contents of **sam**, which at that time has the variable "has the kite". When "molly" activates, **kiteFlying()** has already returned, **but the variable "sam" is still available** _because molly() HAS CLOSURE RIGHTS_ Now you got that!

### The function discussed has an inner function and based on the argument it receives it will either return sam from the outer function or molly from the inner function.

**when a function returns** it is *wiped out*. In this case it is imperative to see that the inner function is able to fetch the variable from the outer function in the process of returning while the outer function is already gone. You can see that the function returns "else", which is another function, it is still wiped out.

We then must ask ourselves **how does the inner function access the outer function's variable, when the OUTER FUNCTION NO LONGER EXISTS?**

This is what happens:

**The JS engine looks at the outer function at the time of the function's call and makes an inventory in memory.**

**JS engine also looks at the inner function and makes an inventory**

**Inner function**, *mapped* **variable sam** ( given from the outer function ) to **"has the kite."**

WHen this occurs, it doesn't matter then what happens to the outer function. As long as the inner function is still being processed, the **JS engine keeps a pointer to the surrounding applicable variables such in the case, where sam = "has the kite."**

### THanks to the Inventory List that JS created

**JS code are closures rather than bits of code you execute** A **closure** is like a "dream catcher(?)" - they are symbols of a unit. **A closure records not only what code a function must execute but also the environment in which that said function is created in.**

**An inner function is able to access the out function and also to the outer of that said function, this inner function has access all the way to the( the great cosmic) Global object**

<a>
  <img src="https://github.com/stan-alam/Data_Structures/blob/develop/JavaScript/deAraujo/chap03/svg_files/ClosureS.svg" width="80%" height="80%">
</a>

In this diagram the **principle of the closure** is applied to func 2. Due to the **principle of the closure** The JS engine will keep all variables active ( **just as they are at runtime, i.e at execution** ), until *func 2* **returned and finished its process.** On a side note -- it is often read on the great world wide web that **closures**  have "free variables", by free; it is meant that all the functions that can be used by the function but are not within the function's scope. The above diagram illustrates this concept.
You can see that func 2 has access to the following free variables: A, B, and C. (D, is not a free variable it belongs to func 2)

**So variable A is available to the global, function 1 and func 2)**

**variables BC is available to function 1, and func 2**

**variable D is only accessible by func 2**

```JavaScript

var withdraw = function(check) {
    var balance = 419;
    var transaction = function() {
        if (check <= balance) {
            return "Please don't forget to take your cash of " + check;
        } else {
            return "Balance too low for transaction to be performed "
        }
    };
    return transaction();
};

```

```
//console output

withdraw("200");
"Please don't forget to take your cash of 200"
withdraw("5000");
"Balance too low for transaction to be performed "

```

In this example we further isolated the outer function data i.e balance from the public scope. This is done by creating an **inner function** which basically acts as an **interface** between the outer function and the outside world. **The outer function's data remains private -- there is no output directly from it** This property is an example of the **closure principle** which keeps tabs on the **lexical environment** In this case the outer function returns before the inner function does. The **outer function outputs
