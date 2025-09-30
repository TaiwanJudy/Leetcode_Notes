# 0001. Two Sum

## 題目連結
[LeetCode - Two Sum](https://leetcode.com/problems/two-sum/description/)

## 題目描述
給定一個整數陣列 nums 和一個目標值 target，請找出兩個數，使它們的和等於 target。

## 自己的思路 MySolution
- 暴力解： 雙迴圈檢查所有組合，O(n²)。
  - 外層從第一個元素跑到倒數第二個元素，內層從外層當前元素的下一個跑到最後一個元素。
  - 檢查它們的和是否等於 target。

## 討論區大神思路 ElseSolutions
- HashMap 解：邊走邊記錄 target - nums[i] (補數 compement)，O(n)。
1. Create an empty hash table to store elements and their indices.
2. Iterate through the array from left to right.
3. For each element nums[i], calculate the complement by subtracting it from the target: complement = target - nums[i].
4. Check if the complement exists in the hash table. If it does, we have found a solution.
5. If the complement does not exist in the hash table, add the current element nums[i] to the hash table with its index as the value.
6. Repeat steps 3-5 until we find a solution or reach the end of the array.
7. If no solution is found, return an empty array or an appropriate indicator.