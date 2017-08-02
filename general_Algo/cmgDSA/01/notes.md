Data structures and algos are not just abstract concepts. **Mastering them enables you to write efficient code that runs faster.** 

**So what's all this fuss about Data Structures ? why do they matter ?**


Programming largely revolves around data, i.e. receiving, manipulating and returning data. 

**Data** is may refer to all types of data from strings to basic numbers. 

## Data Structures refer to how data is organized.

Organizing data structures correctly impacts the speed of the execution of the code. A solid grasp of data Structures will allow you to write efficient fast code. 

## The Array is the foundational Data Structures

Array is one of the most basic data structures in comp science. An array is simply a list of data elements. The array is versatile, and can serve as a useful tool in many different scenarios. 

the **index** of an array is the number that identifies where the piece of data is inside the array. [0] based. 

There are four operations used on arrays :

	* READ : reading refers to looking something up from a particular
	spot within the data structure. Meaning looking up the value at
	the particular index. 

	* SEARCH : Searching refers to looking for a particular value within
	data structure. With an array, this would mean looking to see if a 
	particular value exists within the array, and at which index it is at.

	* INSERT : Insertion refers to adding another value to a data structure.
	With an array, this would mean adding a new value to an additional slot
	within the array. 

	* DELETE : Deletion refers to removing a value from the data structure. 
	For an array this would mean removing on of the values of the array. 

## When measuring how "fast" an operation takes, we do not refer to how fast the operation takes in terms of time, but instead in how many steps it takes.

Measuring time is hardware specific. 

**Operations however are objective. Operation A takes 5 steps, while Operation B takes 500 steps... then Operation A will be faster than Operation B on any machine**.

## Time Complexity : Measuring the speed of an operation.

**Speed, time complexity, efficiency and performance are interchangeable**

# Reading :

**Reading is looking up what value is contained in a particular index inside the array.**

**Reading takes one step**

When creating an array the machine allocates specific memory address and that is to why it can find the value in one step. Reading from an array is the most efficient process.

# Searching :

**Searching an array is looking whether a particular value exists within an array and if so, which index it's located at.** 

WHen searching for a value in an array the machine must perform a step by step operation. It begins with index.[0] If index.[0] does not contain the value, it will check the next index value or index.[1] and so on.. until it find the matching value. 

**Linear Search** : When the machine checks each cell one at a time.

An array with an index of 500, and where the value that the machine is searching is the last one, then it will take 500 steps, or index.[499]










