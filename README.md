# 📊 Frequency Calculator (Java + DSA)

A high-performance, **Generic** frequency analysis tool built with Java. This project demonstrates the efficient use of **Hashing** to solve data counting problems with optimal time complexity.

---

## 🚀 Overview
This calculator takes any array of data (Strings, Integers, etc.) and provides a detailed statistical breakdown, including absolute counts and percentage distribution.

### Key Technical Features:
* **Hashing ($O(n)$):** Uses `HashMap` and `getOrDefault` for near-instant data retrieval and updates.
* **Generics (`<T>`):** Flexible implementation that works with any object type.
* **Statistical Analysis:** Automatically calculates the **Relative Frequency** (percentage) of each element.
* **Mode Detection:** Identifies the most frequent element (The Statistical Mode).

---

## 🛠️ Performance Analysis

| Metric | Complexity | Explanation |
| :--- | :--- | :--- |
| **Time Complexity** | $O(n)$ | The input array is traversed exactly once. |
| **Space Complexity** | $O(k)$ | $k$ represents the number of unique elements stored in the Map. |

---

## 💻 How to Run

1. **Clone the repository:**
   ```bash
   git clone [https://github.com/YOUR_USERNAME/Frequency-Calculator-Java.git](https://github.com/YOUR_USERNAME/Frequency-Calculator-Java.git)
