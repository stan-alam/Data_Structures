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

e.g. 💜

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

# The CLOSURE principle

          Knowledge is closed under entailment. Entailment means logical consequence. If 'A' knows 'B'
          and 'B' entails 'C', then A knows C.


If the array bobMarley was set to null, then the array will be marked for garbage collection. **yet the variables "whalers" and "legend" have closure on the array. Thisway the array is able to survive the garbage collection of its original pointer ... the variable known as 'bobMarley.'** *essentially the array lives on in the whalers and legend variable(s)*

<a>
  <img src="https://github.com/stan-alam/Data_Structures/blob/develop/JavaScript/deAraujo/chap03/svg_files/kiteJSobj.svg" width="100%" height="100%">
</a>


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
