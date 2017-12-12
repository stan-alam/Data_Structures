# Python Lists

What are lists used for ?

You will need to see your data as chunks.

Problems are solved by manipulating lists of data. Python has a natural extension for lists.
In Python it is better to think in **lists**.

## CRUD and Beyond

Crud - create, read, update, delete

Which are the basic list operations. FIrst, you create a list, read values from the list, modify the list's contents, and
delete items from the lists.

## Hello, Multiverse !

```
greetingFromUpsideDownWorld = ['Hello', 'Regular Worlds']

```

This is an example of a "literal" definition of a list. COnsisting of a comma-separated series of values enclosed in square brackets. This lists shows two string brackets. **Lists can contain any type of value, and different types of values can be mixed together**

Python allows trailing commas. But don't do it.


# Python Lists

## 2

## The [] operator

To create an empty list is easy. DO it like so ...

```Python

  greetingsEarthling = []

```

Another way to create an empty list is by calling the list() function with no params

Here is the aforementioned functions ...

```Python

  greetingsEarthling = lists()


```

## You can also create lists from Empty lists

Lists can be nested. It's possible to create a list of empty lists. If the number of sub-list is small, you can specify them literally.

Creating a List of Empty Lists with a List Comprehension

```Python


  x = [ [], [], [], [], ] # literal list definition

  y = [ [] for i in range(5) ] # List Comprehension


  ```

## Avoid using the Repeat operator

```Python

#like so

x = [ [] for i in range(5) ]


```
using the repeat operator will not allow for the creation of a distinct sub-lists
Instead it will create only **ONE** sub-list and fill the main list with multiple references
to that **ONE** list.


## 3

# Converting To Other types

A new set object can be produced from a list by passing the list to the set()
function. Duplicate values are eliminated, so

```Python

  x = set([5,5,5])

  # produces only 5


```

  **Order is not preserved...**


```Python

  x = set([1,2,3,1,1])

  # may produce depending on how it is mapped/pulled from ram
  # {1,2,3}, {1,3,2}, or {2,3,1}

```

# Converting a List To A dictionary

A new dictionary can be produced from a list of (key, value) pairs by passing the
list to the dict() function.

```Python


  dict(['a',1]), ('b',2), ('c', 2)])

  ## This will produce {'a':1, 'b':2, 'c': 2}


```


# Converting a String to a List


the list() function will convert a string into a list of characters.

```Python

    greetingsEarthling = 'Sup_yo'
    characters = list(greetingsEarthling)

# Convert a list to a set

    x = set([5,5,5])

```
