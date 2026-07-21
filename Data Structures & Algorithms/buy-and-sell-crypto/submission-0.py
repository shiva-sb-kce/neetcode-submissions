class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        min_price=prices[0]
        max_profit=0
        for i in prices:
            if i<min_price:
                min_price=i

            prof=i-min_price

            if prof>max_profit:
                max_profit=prof
        return max_profit
        