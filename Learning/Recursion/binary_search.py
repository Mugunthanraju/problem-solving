def bs(data, target, low, high ):
    ''' This function is used for performing Binary Search '''
    
    if low > high:
        return "Cannot perform Binary Search"
    else:
        mid = (low + high) // 2
        if target == data[mid]:
            return f"We found the target value's positon {target} in {mid}"
        elif target < data[mid]:
            return bs(data, target, low, mid-1)
        else:
            return bs(data, target, mid+1, high)

user_value = input("Enter each values with space : \n")
l = list(map(int, user_value.split()))
l = sorted(l)
x = int(input("Enter a target number : \n"))

print(bs(l, x, 0, (len(l) - 1)))