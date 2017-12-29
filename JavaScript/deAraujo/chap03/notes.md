## JS Functions and Arguments as Objects

Arguments

Arguments are not longer properties of the function, as of ECMA 5 args are **objects** and look like arrays. They have only one array property available and it is **length.**

**Length is important property because it facilitates iteration by looping over each existing arguments' element.**

An *arguments object* acts like a local variable of the function. It is operational with functions. It is called **into action by the function itself.**
It can also **be called by any subfunction** i.e after proper binding is applied...

**You cannot explicitly create an arguments object** it only becomes available when a function **begins** its execution. This *arguments* object has an array with a holding capacity of 255 items.

**argument parameters is declared in individually within the function parentheses. There is no formalization of the parameter's declaration**
In order to pass data into the function. It depends on the code inside the function asks for the particular input data.

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

2. You can call the function with *more* Values

```javascript

x(1,2,3,4,5,6,7,8,9); // which returns [1,2,3,4,5,6,7,8,9]

```

Although *arguments* **looks like an array** it is **NOT AN ARRAY** It can be converted into an array by using the array's **slice()** function.method
and once it is converted to an array, you can use its data for further processing.

e.g. **This will multiply all the arguments by using the array reduce() function.method**

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

### Now Back to the main discussion 
