# 🚀 Ultimate LeetCode Solutions & DSA Patterns Command Center

[![LeetCode Profile](https://img.shields.io/badge/LeetCode-Profile-FFA116?style=for-the-badge&logo=leetcode&logoColor=white)](https://leetcode.com/)
[![Language-C++](https://img.shields.io/badge/Language-C++-00599C?style=for-the-badge&logo=c%2B%2B&logoColor=white)](https://isocpp.org/)
[![Language-Java](https://img.shields.io/badge/Language-Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://www.oracle.com/java/)
[![Language-Python](https://img.shields.io/badge/Language-Python-3776AB?style=for-the-badge&logo=python&logoColor=white)](https://www.python.org/)
[![Grit](https://img.shields.io/badge/Consistency-100%25-success?style=for-the-badge&logo=github-actions)](https://github.com/)

> **A curated showcase of LeetCode solutions organized systematically by core DSA Coding Patterns. Engineered for conceptual mastery, structured interview preparation, and algorithmic excellence.**

---

## 📊 Progress Dashboard

| Category | Solved | Target | Status |
| :--- | :---: | :---: | :---: |
| 🟢 **Easy** | `55` | `150` | `40% Complete` |
| 🟡 **Medium** | `53` | `300` | `40% Complete` |
| 🔴 **Hard** | `11` | `100` | `20% Complete` |
| **Total** | **117** | **550** | **40% Completed** |

---

## 🧩 Core DSA Patterns & Masterclass Tracker

This repository categorizes solutions not by data structures alone, but by **underlying coding patterns**. Mastering these patterns helps solve unseen problems in technical interviews.

### 1. Sliding Window (Fixed & Variable)
*Used for arrays or lists to find sub-arrays satisfying certain conditions, avoiding $O(N^2)$ brute-force solutions.*
- 📝 **Concept:** Expand a right pointer, shrink a left pointer when criteria are violated.
- 🎯 **Key Problems:**
  - [LC 3: Longest Substring Without Repeating Characters](https://leetcode.com/problems/longest-substring-without-repeating-characters/) (Medium)
  - [LC 76: Minimum Window Substring](https://leetcode.com/problems/minimum-window-substring/) (Hard)
  - [LC 438: Find All Anagrams in a String](https://leetcode.com/problems/find-all-anagrams-in-a-string/) (Medium)

### 2. Two Pointers
*Useful for sorted arrays or linked lists where we search for pairs or trios matching a specific criteria.*
- 📝 **Concept:** Meet-in-the-middle or read-write pointer structures.
- 🎯 **Key Problems:**
  - [LC 15: 3Sum](https://leetcode.com/problems/3sum/) (Medium)
  - [LC 11: Container With Most Water](https://leetcode.com/problems/container-with-most-water/) (Medium)
  - [LC 167: Two Sum II - Input Array Is Sorted](https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/) (Easy)

### 3. Fast & Slow Pointers (Tortoise & Hare)
*Mainly used for cycle detection in linked lists, arrays, or finding midpoints.*
- 📝 **Concept:** Move one pointer at speed $1$ and the other at speed $2$. If they meet, a cycle exists.
- 🎯 **Key Problems:**
  - [LC 141: Linked List Cycle](https://leetcode.com/problems/linked-list-cycle/) (Easy)
  - [LC 287: Find the Duplicate Number](https://leetcode.com/problems/find-the-duplicate-number/) (Medium)
  - [LC 234: Palindrome Linked List](https://leetcode.com/problems/palindrome-linked-list/) (Easy)

### 4. Merge Intervals
*Used to deal with overlapping intervals, scheduling, and calendar systems.*
- 📝 **Concept:** Sort intervals by start time, then iterate and merge overlaps.
- 🎯 **Key Problems:**
  - [LC 56: Merge Intervals](https://leetcode.com/problems/merge-intervals/) (Medium)
  - [LC 57: Insert Interval](https://leetcode.com/problems/insert-interval/) (Medium)
  - [LC 252: Meeting Rooms](https://leetcode.com/problems/meeting-rooms/) (Easy)

### 5. Cyclic Sort
*Used when dealing with problems involving arrays containing numbers in a given range (e.g., $1$ to $N$).*
- 📝 **Concept:** Swap numbers to their correct index ($nums[i]$ should be at index $nums[i] - 1$).
- 🎯 **Key Problems:**
  - [LC 41: First Missing Positive](https://leetcode.com/problems/first-missing-positive/) (Hard)
  - [LC 268: Missing Number](https://leetcode.com/problems/missing-number/) (Easy)
  - [LC 448: Find All Numbers Disappeared in an Array](https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/) (Easy)

### 6. Breadth First Search (BFS) & Depth First Search (DFS)
*Graph and tree traversal strategies for shortest paths, connectivity, and hierarchical combinations.*
- 📝 **Concept:** BFS uses a Queue (FIFO) for level-by-level traversal. DFS uses Recursion/Stack for backtracking and path search.
- 🎯 **Key Problems:**
  - [LC 102: Binary Tree Level Order Traversal](https://leetcode.com/problems/binary-tree-level-order-traversal/) (Medium)
  - [LC 200: Number of Islands](https://leetcode.com/problems/number-of-islands/) (Medium)
  - [LC 127: Word Ladder](https://leetcode.com/problems/word-ladder/) (Hard)

---

## ⚡ Big-O Cheat Sheet (Quick Reference)

| Data Structure / Algorithm | Average Search | Worst Search | Average Insertion | Worst Insertion | Space Complexity |
| :--- | :---: | :---: | :---: | :---: | :---: |
| **Array** | $O(N)$ | $O(N)$ | $O(1)$ (append) | $O(N)$ | $O(N)$ |
| **Stack / Queue** | $O(N)$ | $O(N)$ | $O(1)$ | $O(1)$ | $O(N)$ |
| **Linked List** | $O(N)$ | $O(N)$ | $O(1)$ | $O(1)$ | $O(N)$ |
| **Binary Search Tree** | $O(\log N)$ | $O(N)$ | $O(\log N)$ | $O(N)$ | $O(N)$ |
| **AVL / Red-Black Tree** | $O(\log N)$ | $O(\log N)$ | $O(\log N)$ | $O(\log N)$ | $O(N)$ |
| **Hash Table** | $O(1)$ | $O(N)$ | $O(1)$ | $O(N)$ | $O(N)$ |
| **Trie (Prefix Tree)** | $O(W)$ | $O(W)$ | $O(W)$ | $O(W)$ | $O(ALPHABET\_SIZE \cdot W)$ |

*(Note: $N$ represents the size/number of elements; $W$ represents word length in Tries).*

---

## 📂 Repository Architecture

```
LeetCode-Patterns/
├── 01-Sliding-Window/
│   ├── Longest-Substring-Without-Repeating.cpp
│   ├── Minimum-Window-Substring.py
│   └── Pattern-Explanation.md
├── 02-Two-Pointers/
│   ├── 3Sum.java
│   └── Container-With-Most-Water.py
├── 03-Fast-Slow-Pointers/
│   └── Linked-List-Cycle.cpp
├── 04-Merge-Intervals/
│   └── Merge-Intervals.py
├── 05-Cyclic-Sort/
│   └── First-Missing-Positive.cpp
├── 06-BFS-DFS/
│   ├── Number-of-Islands.py
│   └── Binary-Tree-Level-Order.java
├── Cheat-Sheet.md
└── README.md
```

---

## 📝 Solution Template (How each solution is documented)

To maintain structured notes, every solution in this repository follows a clean, standardized layout:

```markdown
# [Title of LeetCode Problem] (Link)

## 💡 Intuition
Describe the core conceptual breakthrough or logic used to approach the solution.

## 🚀 Algorithmic Approach
- **Step 1:** Establish pointers/variables.
- **Step 2:** Loop termination conditions.
- **Step 3:** Corner-case handling.

## 💻 Code Implementation
[Insert Syntax-Highlighted Code Block here (C++, Java, or Python)]

## ⏱️ Complexity Analysis
- **Time Complexity:** $O(...) \rightarrow$ Explain why.
- **Space Complexity:** $O(...) \rightarrow$ Explain why.
```

---

## 🛠️ How to Navigate & Run Solutions

1. **Clone the repository:**
   ```bash
   git clone https://github.com/your-username/your-repo-name.git
   cd your-repo-name
   ```
2. **Browse by Coding Pattern:**
   Open any folder (e.g., `01-Sliding-Window`) to find solutions accompanied by an explanation of the pattern's mechanics.
3. **Run tests:**
   Each solution language folder includes brief test cases and inputs inside the file header comments for easy local compilation.

---

## ⭐ Support & Contributions
If you found these patterns helpful for your interview prep, please leave a **Star** on this repository! Contributions of cleaner solutions or alternative languages (e.g., Go, JS, Rust) are always welcome. Feel free to open a Pull Request.

<!---LeetCode Topics Start-->
# LeetCode Topics
## Linked List
|  |
| ------- |
| [0116-populating-next-right-pointers-in-each-node](https://github.com/aryanmish96-cloud/Leetcode---Solutions/tree/master/0116-populating-next-right-pointers-in-each-node) |
| [0117-populating-next-right-pointers-in-each-node-ii](https://github.com/aryanmish96-cloud/Leetcode---Solutions/tree/master/0117-populating-next-right-pointers-in-each-node-ii) |
| [2130-maximum-twin-sum-of-a-linked-list](https://github.com/aryanmish96-cloud/Leetcode---Solutions/tree/master/2130-maximum-twin-sum-of-a-linked-list) |
## Tree
|  |
| ------- |
| [0101-symmetric-tree](https://github.com/aryanmish96-cloud/Leetcode---Solutions/tree/master/0101-symmetric-tree) |
| [0116-populating-next-right-pointers-in-each-node](https://github.com/aryanmish96-cloud/Leetcode---Solutions/tree/master/0116-populating-next-right-pointers-in-each-node) |
| [0117-populating-next-right-pointers-in-each-node-ii](https://github.com/aryanmish96-cloud/Leetcode---Solutions/tree/master/0117-populating-next-right-pointers-in-each-node-ii) |
| [0637-average-of-levels-in-binary-tree](https://github.com/aryanmish96-cloud/Leetcode---Solutions/tree/master/0637-average-of-levels-in-binary-tree) |
## Depth-First Search
|  |
| ------- |
| [0101-symmetric-tree](https://github.com/aryanmish96-cloud/Leetcode---Solutions/tree/master/0101-symmetric-tree) |
| [0116-populating-next-right-pointers-in-each-node](https://github.com/aryanmish96-cloud/Leetcode---Solutions/tree/master/0116-populating-next-right-pointers-in-each-node) |
| [0117-populating-next-right-pointers-in-each-node-ii](https://github.com/aryanmish96-cloud/Leetcode---Solutions/tree/master/0117-populating-next-right-pointers-in-each-node-ii) |
| [0637-average-of-levels-in-binary-tree](https://github.com/aryanmish96-cloud/Leetcode---Solutions/tree/master/0637-average-of-levels-in-binary-tree) |
## Breadth-First Search
|  |
| ------- |
| [0101-symmetric-tree](https://github.com/aryanmish96-cloud/Leetcode---Solutions/tree/master/0101-symmetric-tree) |
| [0116-populating-next-right-pointers-in-each-node](https://github.com/aryanmish96-cloud/Leetcode---Solutions/tree/master/0116-populating-next-right-pointers-in-each-node) |
| [0117-populating-next-right-pointers-in-each-node-ii](https://github.com/aryanmish96-cloud/Leetcode---Solutions/tree/master/0117-populating-next-right-pointers-in-each-node-ii) |
| [0637-average-of-levels-in-binary-tree](https://github.com/aryanmish96-cloud/Leetcode---Solutions/tree/master/0637-average-of-levels-in-binary-tree) |
| [3286-find-a-safe-walk-through-a-grid](https://github.com/aryanmish96-cloud/Leetcode---Solutions/tree/master/3286-find-a-safe-walk-through-a-grid) |
## Binary Tree
|  |
| ------- |
| [0101-symmetric-tree](https://github.com/aryanmish96-cloud/Leetcode---Solutions/tree/master/0101-symmetric-tree) |
| [0116-populating-next-right-pointers-in-each-node](https://github.com/aryanmish96-cloud/Leetcode---Solutions/tree/master/0116-populating-next-right-pointers-in-each-node) |
| [0117-populating-next-right-pointers-in-each-node-ii](https://github.com/aryanmish96-cloud/Leetcode---Solutions/tree/master/0117-populating-next-right-pointers-in-each-node-ii) |
| [0637-average-of-levels-in-binary-tree](https://github.com/aryanmish96-cloud/Leetcode---Solutions/tree/master/0637-average-of-levels-in-binary-tree) |
## Two Pointers
|  |
| ------- |
| [0016-3sum-closest](https://github.com/aryanmish96-cloud/Leetcode---Solutions/tree/master/0016-3sum-closest) |
| [0027-remove-element](https://github.com/aryanmish96-cloud/Leetcode---Solutions/tree/master/0027-remove-element) |
| [0031-next-permutation](https://github.com/aryanmish96-cloud/Leetcode---Solutions/tree/master/0031-next-permutation) |
| [0080-remove-duplicates-from-sorted-array-ii](https://github.com/aryanmish96-cloud/Leetcode---Solutions/tree/master/0080-remove-duplicates-from-sorted-array-ii) |
| [0088-merge-sorted-array](https://github.com/aryanmish96-cloud/Leetcode---Solutions/tree/master/0088-merge-sorted-array) |
| [0457-circular-array-loop](https://github.com/aryanmish96-cloud/Leetcode---Solutions/tree/master/0457-circular-array-loop) |
| [2130-maximum-twin-sum-of-a-linked-list](https://github.com/aryanmish96-cloud/Leetcode---Solutions/tree/master/2130-maximum-twin-sum-of-a-linked-list) |
## Stack
|  |
| ------- |
| [2130-maximum-twin-sum-of-a-linked-list](https://github.com/aryanmish96-cloud/Leetcode---Solutions/tree/master/2130-maximum-twin-sum-of-a-linked-list) |
## Array
|  |
| ------- |
| [0016-3sum-closest](https://github.com/aryanmish96-cloud/Leetcode---Solutions/tree/master/0016-3sum-closest) |
| [0027-remove-element](https://github.com/aryanmish96-cloud/Leetcode---Solutions/tree/master/0027-remove-element) |
| [0031-next-permutation](https://github.com/aryanmish96-cloud/Leetcode---Solutions/tree/master/0031-next-permutation) |
| [0036-valid-sudoku](https://github.com/aryanmish96-cloud/Leetcode---Solutions/tree/master/0036-valid-sudoku) |
| [0080-remove-duplicates-from-sorted-array-ii](https://github.com/aryanmish96-cloud/Leetcode---Solutions/tree/master/0080-remove-duplicates-from-sorted-array-ii) |
| [0088-merge-sorted-array](https://github.com/aryanmish96-cloud/Leetcode---Solutions/tree/master/0088-merge-sorted-array) |
| [0134-gas-station](https://github.com/aryanmish96-cloud/Leetcode---Solutions/tree/master/0134-gas-station) |
| [0457-circular-array-loop](https://github.com/aryanmish96-cloud/Leetcode---Solutions/tree/master/0457-circular-array-loop) |
| [0523-continuous-subarray-sum](https://github.com/aryanmish96-cloud/Leetcode---Solutions/tree/master/0523-continuous-subarray-sum) |
| [0560-subarray-sum-equals-k](https://github.com/aryanmish96-cloud/Leetcode---Solutions/tree/master/0560-subarray-sum-equals-k) |
| [0724-find-pivot-index](https://github.com/aryanmish96-cloud/Leetcode---Solutions/tree/master/0724-find-pivot-index) |
| [0904-fruit-into-baskets](https://github.com/aryanmish96-cloud/Leetcode---Solutions/tree/master/0904-fruit-into-baskets) |
| [1295-find-numbers-with-even-number-of-digits](https://github.com/aryanmish96-cloud/Leetcode---Solutions/tree/master/1295-find-numbers-with-even-number-of-digits) |
| [3286-find-a-safe-walk-through-a-grid](https://github.com/aryanmish96-cloud/Leetcode---Solutions/tree/master/3286-find-a-safe-walk-through-a-grid) |
| [3976-maximum-subarray-sum-after-multiplier](https://github.com/aryanmish96-cloud/Leetcode---Solutions/tree/master/3976-maximum-subarray-sum-after-multiplier) |
## Sorting
|  |
| ------- |
| [0016-3sum-closest](https://github.com/aryanmish96-cloud/Leetcode---Solutions/tree/master/0016-3sum-closest) |
| [0088-merge-sorted-array](https://github.com/aryanmish96-cloud/Leetcode---Solutions/tree/master/0088-merge-sorted-array) |
## Greedy
|  |
| ------- |
| [0134-gas-station](https://github.com/aryanmish96-cloud/Leetcode---Solutions/tree/master/0134-gas-station) |
## Hash Table
|  |
| ------- |
| [0036-valid-sudoku](https://github.com/aryanmish96-cloud/Leetcode---Solutions/tree/master/0036-valid-sudoku) |
| [0457-circular-array-loop](https://github.com/aryanmish96-cloud/Leetcode---Solutions/tree/master/0457-circular-array-loop) |
| [0523-continuous-subarray-sum](https://github.com/aryanmish96-cloud/Leetcode---Solutions/tree/master/0523-continuous-subarray-sum) |
| [0560-subarray-sum-equals-k](https://github.com/aryanmish96-cloud/Leetcode---Solutions/tree/master/0560-subarray-sum-equals-k) |
| [0904-fruit-into-baskets](https://github.com/aryanmish96-cloud/Leetcode---Solutions/tree/master/0904-fruit-into-baskets) |
## String
|  |
| ------- |
| [0006-zigzag-conversion](https://github.com/aryanmish96-cloud/Leetcode---Solutions/tree/master/0006-zigzag-conversion) |
| [0010-regular-expression-matching](https://github.com/aryanmish96-cloud/Leetcode---Solutions/tree/master/0010-regular-expression-matching) |
## Dynamic Programming
|  |
| ------- |
| [0010-regular-expression-matching](https://github.com/aryanmish96-cloud/Leetcode---Solutions/tree/master/0010-regular-expression-matching) |
| [3976-maximum-subarray-sum-after-multiplier](https://github.com/aryanmish96-cloud/Leetcode---Solutions/tree/master/3976-maximum-subarray-sum-after-multiplier) |
## Recursion
|  |
| ------- |
| [0010-regular-expression-matching](https://github.com/aryanmish96-cloud/Leetcode---Solutions/tree/master/0010-regular-expression-matching) |
## Graph Theory
|  |
| ------- |
| [3286-find-a-safe-walk-through-a-grid](https://github.com/aryanmish96-cloud/Leetcode---Solutions/tree/master/3286-find-a-safe-walk-through-a-grid) |
## Heap (Priority Queue)
|  |
| ------- |
| [3286-find-a-safe-walk-through-a-grid](https://github.com/aryanmish96-cloud/Leetcode---Solutions/tree/master/3286-find-a-safe-walk-through-a-grid) |
## Matrix
|  |
| ------- |
| [0036-valid-sudoku](https://github.com/aryanmish96-cloud/Leetcode---Solutions/tree/master/0036-valid-sudoku) |
| [3286-find-a-safe-walk-through-a-grid](https://github.com/aryanmish96-cloud/Leetcode---Solutions/tree/master/3286-find-a-safe-walk-through-a-grid) |
## Shortest Path
|  |
| ------- |
| [3286-find-a-safe-walk-through-a-grid](https://github.com/aryanmish96-cloud/Leetcode---Solutions/tree/master/3286-find-a-safe-walk-through-a-grid) |
## Math
|  |
| ------- |
| [0523-continuous-subarray-sum](https://github.com/aryanmish96-cloud/Leetcode---Solutions/tree/master/0523-continuous-subarray-sum) |
| [1295-find-numbers-with-even-number-of-digits](https://github.com/aryanmish96-cloud/Leetcode---Solutions/tree/master/1295-find-numbers-with-even-number-of-digits) |
## Sliding Window
|  |
| ------- |
| [0904-fruit-into-baskets](https://github.com/aryanmish96-cloud/Leetcode---Solutions/tree/master/0904-fruit-into-baskets) |
## Prefix Sum
|  |
| ------- |
| [0523-continuous-subarray-sum](https://github.com/aryanmish96-cloud/Leetcode---Solutions/tree/master/0523-continuous-subarray-sum) |
| [0560-subarray-sum-equals-k](https://github.com/aryanmish96-cloud/Leetcode---Solutions/tree/master/0560-subarray-sum-equals-k) |
| [0724-find-pivot-index](https://github.com/aryanmish96-cloud/Leetcode---Solutions/tree/master/0724-find-pivot-index) |
<!---LeetCode Topics End-->