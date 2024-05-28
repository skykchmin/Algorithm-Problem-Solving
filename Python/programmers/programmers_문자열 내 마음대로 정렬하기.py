strings = ["abce", "abcd", "cdx"]
n = 1

def solution(strings, n):
    strings.sort()
    return sorted(strings, key = lambda strings : strings[n])
    
solution(strings, n)

