-----------------------------------------------
BINARY TREE PROBLEM
-----------------------------------------------
Imagine a binary tree like below:
```
      1
  2	   3
4   5    6   7
```

Given a node in this tree, a sum of its subsequents nodes is required to be calculated.

#### Examples
* Node 2:
```
4 + 5 = 9
```
* Node 3:
```
6 + 7 = 13
```
* Node 4:
```
0 
```
As there is no node under node 4.

#### Solution
```
br/com/buzachero/BinaryTree.java
```

-----------------------------------------------
NUMBER CALCULATION PROBLEM
-----------------------------------------------
Given two numbers A and B, a number C is required, but the following assumptions must be attended:
- 1st digit of number A is the 1st digit of number C;
- 1st digit of number B is the 2nd digit of number C;
- 2nd digit of number A is the 3rd digit of number C;
- 2nd digit of number B is the 4th digit of number C;
- and so on...

- If one of the number has higher amount of digits, so the surplus digits should be copied to number C

- If output of number C is greater than 1000000, so the value of number C is -1

#### Examples
* **Example 1**
```
number A = 1245
number B = 1111
number C = 11214151 > 1000000
```
Therefore:
```
number C = -1
```
* **Example 2**
```
number A = 58
number B = 1478
number C = 518478 ( < 1000000)
```
#### Solution
```
br/com/buzachero/Calculator.java
```

----------------------------------------------------
MATRIX DIFFERENCE OF SUM DIAGONALS CALCULATION PROBLEM
----------------------------------------------------
Given a matrix N x N, it is required to calculate the difference between the sum of its diagonal.

#### Example
```
Matrix = 
[ 1, 2, 3
  4, 5, 6, 
  7, 8, 9 ]
 Diagonal1 : 1 + 5 + 9 = 15
 Diagonal2 : 3 + 5 + 7 = 15
 Difference = Diagonal1 - Diagonal2
 Difference = 0
```
 
#### Solution
```
br/com/buzachero/Matrix.java 
```
----------------------------------------------------
ELETRONICS SHOP
----------------------------------------------------
Given two arrays of prices, one for keyboards and another one for USB drive, and a budget to spend on these items, it is required to calculate 
the maximum money to spend.

#### Example
```
keyboard prices = [3 1]
USB drives prives = [5 2 8]
budget = 10
Max money to spend = 9
```

#### Solution
```
br/com/buzachero/EletronicsShop.java
```
----------------------------------------------------
CATS AND MOUSE
----------------------------------------------------
Given:
1. Cat A position x;
2. Cat B position y;
3. Mouse C position z;

Determine which cat will take the mouse first.
- If cat A arrives first, print "Cat A";
- If cat B arrives first, print "Cat B";
- If both cats arrive at the same time, print "Mouse C". 
  






 