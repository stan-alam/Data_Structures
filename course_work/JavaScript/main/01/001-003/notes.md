# 001

## Using Data structures in JavaScript

Use appropriate data structures for problem domain.

**Some DataStructures are more efficient for recording while others good for retrieving, e.g. linkedList for recording, or to read very quickly use hash table**

Reinforce knowledge of JavaScript algorithms and other important concepts 

Constructor functions 

recursion

"this" keyword

prototype object

Big O notation

# 002

## Using constructor functions and this keyword

**A constructor function allows you to create an object class that allows you to create multiple instances of the class**

You can create a lot of objects from that class that has the properties of that object


e.g. facebook has a lot of users, the users are all objects from the same class, they have all the same properties such as 
name, birthday, gender ..etc

When creating a user object you write a function that creates the object from a class

**when writing a constructor function, create uppercase function name**

```javascript

function User(firstName, lastName, age, gender) {
	this.firstName = fistName;
	this.lastName = lastName;
	this.age = age;
	this.gender = gender; // you're passing the gender parameter to 
};

var user1 = new User('John', 'Smith', 24, 'male');

```
