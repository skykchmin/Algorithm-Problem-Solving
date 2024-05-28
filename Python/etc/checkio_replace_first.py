# 1) 첫번째에 늘 요소의 리스트를 만든다
# 2) 첫 요소를 append를 이용해 리스트 끝에 붙인다. 

from typing import Iterable


def replace_first(items: list) -> Iterable:
    if len(items) > 0:
        first_list = []
    
        for i in items[:1]:
            first_list.append(i)
        return items[1:] + first_list
    
    else:
        return items


if __name__ == '__main__':
    print("Example:")
    print(list(replace_first([1, 2, 3, 4])))

    # These "asserts" are used for self-checking and not for an auto-testing
    assert list(replace_first([1, 2, 3, 4])) == [2, 3, 4, 1]
    assert list(replace_first([1])) == [1]
    assert list(replace_first([])) == []
    print("Coding complete? Click 'Check' to earn cool rewards!")
