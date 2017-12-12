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
