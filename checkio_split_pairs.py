import itertools
import operator



def split_pairs(a):
    connection_character = itertools.chain(a, '_')
    return map(operator.add, connection_character, connection_character)

def split_pairs2(a):
    len_split_pairs = len(a)

    if len_split_pairs == 0:
        return []
    
    if len_split_pairs == 1:
        return [a + '_']

    else:
        return [a[:2]] + split_pairs2(a[2:])