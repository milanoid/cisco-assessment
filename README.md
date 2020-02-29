Technical assignment for QA position to Cisco.

### Question 1
Write a method that answers the following problem:

Accept as input:
· list: a singly-linked list

Remove the middle element of the list without iterating the list more than once. Assume the list
size cannot be known until traversed.
Support your answer with tests.

---
[![Build Status](https://travis-ci.com/milanoid/cisco-assessment.svg?branch=master)](https://travis-ci.com/milanoid/cisco-assessment)

- Tests in [SinglyLinkedListTest](src/test/java/SinglyLinkedListTest.java
)
- Method in [Answer1.removeMiddleElement()](src/main/java/Answer1.java#8)

### Question 2

Write a method that answers the following problem:

Accept as input:
· list: an unordered list of arrays each with 4 elements.
· target: an integer
Find and display the complete array that contains the provided target number.

---

pseudocode
```
function search(list: List, n: Int) {
	
	for array in list {
		if n in array { print array }
	}
}
```

### Question 3
Assume a database with the following structure:

#### Members
|ID| NAME| ADDRESS| PHONE| NUMBER| AGE|

#### Organization
|ID|MEMBER_ID|LOCATION|DUES
1. Write a query that lists each member name, address, dues and location.
2. Write a SQL Query to pull all members that are over 45
3. Write a SQL Query to pull all members that have a dues value of 0.

---
1. 
```
select members.name, members.address, organization.dues, organization.location 
from members
join organization on members.id=organization.member_id
```
2. 
```
select * from members where age > 45
```
3.
```
select * 
from members 
join organization on members.id=organization.member_id
where
organization.dues=0
```
