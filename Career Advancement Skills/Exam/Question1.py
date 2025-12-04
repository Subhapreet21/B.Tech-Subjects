def common_in_both(list1,list2):
    common=[]
    for num in list1:
        if num in list2 and num not in common:
            common.append(num)

    return common

list1=[1,2,3,4]
list2=[3,4,5,6]
print(common_in_both(list1,list2))