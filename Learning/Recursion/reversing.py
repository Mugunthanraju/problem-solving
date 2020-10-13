def reverse(S, start, stop):
    '''Reverse elements in implicit slice S[start:stop].'''
    if (start < stop ):
        S[start], S[stop] = S[stop], S[start] # swap first and last
        return reverse(S, start + 1, stop - 1)
    else:
        return S

user_value = input("Enter each values with space : \n")
lst = list(map(int, user_value.split()))

print(reverse(lst, 0, (len(lst) - 1)))