# Write your MySQL query statement below
select e.name , b.bonus
 from Employee e 
 Left Join Bonus b On e.empId = b.empId
Where b.bonus < 1000 or  b.bonus is Null;