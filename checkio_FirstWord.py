# 스페이스 전까지 문자를 자른다. slice

def first_word(text: str) -> str:
    text = text.replace('.', ' ').replace(',', ' ').strip() #앞뒤 공백을 없애주고 공백으로 구분
    text = text.split()
    
    return text[0]

if __name__ == '__main__':
    print("Example:")
    print(first_word("Hello world"))
    
    # These "asserts" are used for self-checking and not for an auto-testing
    assert first_word("Hello world") == "Hello"
    assert first_word("a word") == "a"
    assert first_word("hi") == "hi"
    print("Coding complete? Click 'Check' to earn cool rewards!")