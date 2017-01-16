## Recursion and Backtracking

    2.2 What is recursion?

Any function which calls itself is called a recursive function. A recursive method solves a problem by calling a copy of itself to work on a smaller problem. This is called the recursion step. The recursion step can result in many more such recursive calls. It is important to ensure that the recursion terminates. Each time the function calls itself with a slightly simpler version of the original problem. The sequence of smaller problems must eventually converge on the base case.

     2.3 Why Recursion?

Recursion is a useful technique borrowed from mathematics . Recursive code is generally shorter and easier to write than iterative code. Generally, loops are turned into recursive functions when they are compiled or interpreted. Recursion is most useful for tasks that can be defined in terms of similar subtasks. For example, **sort** , **search** , **traversal** problems often have simple recursive solutions .

     2.4  What is the format of a recursive function


 A recursive function performs a task in part by calling itself to perform the subtasks. At some point, the function encounters a subtask that it can perform without calling itself