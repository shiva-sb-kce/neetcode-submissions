class Solution:
    def isPalindrome(self, s: str) -> bool:
        com="".join(char for char in s if char.isalnum())
        lst=list(com)
        rev=lst[::-1]
        for i in range(len(lst)):
            if lst[i].lower()!=rev[i].lower():
                return False
        return True
        