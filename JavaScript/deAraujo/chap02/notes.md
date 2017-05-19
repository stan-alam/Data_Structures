## chap02

Chap02 will cover methods and object properties.

##2.1 Strings as Objects in JS

Strings are immutable and they reside in the Stack. If the dev edits a string, the variable gets replaced by another string variable of a shorter to a longer length and with the same name. The previous string is destroyed, and not editable.

**String Object** - JS calls the String object at will and wraps strings into objects when it needs to do so.

**All methods and properties of the String object are automatically available to primitive values. There is no need to instantiate an object**.

**Literal** - refers to a character, word or phrase within quote, e.g. "apples and oranges." A **String Literal** is composed of *zero* or more characters enclosed in single or double quotes. Although there is no difference between single or double quotes in JS. Double Quotes are mandatory in JSON.

**method** is what programmers call a __piece of functionality__ that acts __on behalf__ of an object. A method is normally a function, or a collection of functions to accomplish __one__ specific task. ??A method is derived from a class?? while a function is not, both have return types. A constructor is a method without a return type, while a procedure is a function without a return type.

THe literal in JS is normally a primitive type. When a *method* is called on a string literal, the string is temporarily and automatically **wrapped** into an object in order to process the call.


When a string primitive is wrapped around a String object, it automatically inherits several (a) Properties, and (b) methods.

Take a look see:

(a) **String properties** such as length, prototype, constructor:
length:

```javascript

var x = "bananas";

x.length;
// returns 7;

```
The prototype property is used **add properties and methods to an existing object**. Add a property to the String object to see if "x" inherits from the object :

```javascript

var x = "bananas";

String.prototype.feelings = "like bananas!"; //make notice of the capitalized S in String

```

In other words: "Mr. String, please *prototype* ( verb meaning create as prototype ) the property "feelings" with the value "like bananas!" This case view the "see" property as a the key-value pair.

**Think of the the** *prototype command* as adding something new to a menu of tools. Think of this menu as a *prototype*, the verb allowing the addition of new properties and methods is also the verb *prototype*.

```javascript

x.feelings
//returns "love bananas"
// can also be written as x["feelings"];
// because feelings is the location where the property value resides


```

The property feelings became part of the string x and it can be called by using the **Dot** or **bracket** notation. x is still a primitive and you can confirm it by calling **typeof** on it, which returns __lower cased__ string type, and not the *object*.

The syntax property named "feelings" which was prototyped (created) on the **String object prototype** (menu) It is now part of __list of properties__ available to __all__ string primitives during *this* particular **execution context**.















































