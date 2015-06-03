[编程题] Broken Keyboard (20)
On a broken keyboard, some of the keys are worn out. So when you type some sentences, the characters 
corresponding to those keys will not appear on screen.

Now given a string that you are supposed to type, and the string that you actually type out, please list those keys 
which are for sure worn out. 
输入描述:
Each input file contains one test case. For each case, the 1st line contains the original string, and the 2nd line contains the typed-out string. Each string contains 

no more than 80 characters which are either English letters [A-Z] (case 

insensitive), digital numbers [0-9], or "_" (representing the space). It is guaranteed that both strings are non-empty.


输出描述:
For each test case, print in one line the keys that are worn out, in the order of being detected. The English letters must be capitalized. 

Each worn out key must be printed once only. It is guaranteed that there is at least one worn out key.

输入例子:
7_This_is_a_test

_hs_s_a_es

输出例子:
7TI