# Write your MySQL query statement below
Select id
from Weather W1
Where temperature > (SELECT temperature from Weather w2 Where w2.recordDate = DATE_SUB(w1.recordDate , INTERVAL 1 DAY));