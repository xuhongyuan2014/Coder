try&catch&finally浅析

finally中的代码是总会执行的，执行完try或者catch后都要执行finally。

如果try或者catch中有return的话，在执行return之前先要执行finally中的代码。
（如果finally中没有return的话，即使在finally中修改了将要return的值也不会生效
，返回结果仍然是try或者catch中的return值；如果finally中有return的话，返回finally中的值。）