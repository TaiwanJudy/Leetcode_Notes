# 0001. Two Sum

## 題目連結
[LeetCode - Two Sum](https://leetcode.com/problems/two-sum/description/)

## 題目描述
給定一個整數陣列 nums 和一個目標值 target，請找出兩個數，使它們的和等於 target。

## 自己的思路
- 暴力解： 雙迴圈檢查所有組合，O(n²)
  - 外層從第一個元素跑到倒數第二個元素，內層從外層當前元素的下一個跑到最後一個元素
  - 檢查它們的和是否等於 target

## 討論區大神思路
- HashMap 解：邊走邊記錄 target - nums[i]，O(n)。