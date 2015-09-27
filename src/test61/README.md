混乱还原
Time Limit: 10000/5000 MS (Java/Others) Memory Limit: 16384/16384 K (Java/Others)
Problem Description:
下面程序中，shuffle函数用于把整数数列随机打散。函数参数seed是一个随机种子，同一随机种子产生一个确定的随机序列。请为shuffle写一个还原函数（restore），其输入是被shuffle打散后的整数数列a[]以及打散时使用的随机种子seed，功能是将a[]数列还原为打散前的内容。

注意!
本题要求额外空间开销越小越好，时间复杂度相对不重要！
我们会人工二次检查您算法的复杂度与正确性！


Seed 是任意32位正整数
N < 10000
数列里的数都是32位整数

（提示：请您务必点击此处，下载参考框架）
输入
Seed N 整数1 整数2 整数3 ... 整数N 
输出
Success!
或
Failed!

样例输入
12312 3 1 2 3
样例输出
Success!