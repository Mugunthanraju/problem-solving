'''
0, 1, (0+1)=1, (1+1)=2, (1+2)=3, (2+3)=5, (3+5)=8, (5+8)=13
0, 1, 1, 2, 3, 5, 8, 13
'''
def fib(n):
    if n <= 1 and (!(n < 0)):
        return n
    else:
        return (fib(n-1) + fib(n-2))

nth = int(input())

if nth <= 0:
    print("Enter +ve num")
else:
    print("Sequence : ")
    for i in range(nth):
        print(fib(i))




# nterm = int(input("How many numbers do you want? : "))

# pre, cur = 0 , 1

# if nterm <= 0:
#     print("Provide positive number")
# elif nterm == 1:
#     print(pre)
# else:
#     print("Fib sequence are : \n")
#     for i in range(nterm):
#         print(pre)
#         nth = pre + cur

#         pre = cur
#         cur = nth


        

