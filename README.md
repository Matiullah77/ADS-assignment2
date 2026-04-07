Assignment 2 – Advanced Data Structures (ADS)

Student Name: Matiullah Zaman
Group: [IT 2501]

1. Introduction

This assignment implements a mini banking system in Java using multiple data structures. The program demonstrates:

LinkedList for dynamic account management
Stack for transaction history
Queue for bill payments and account requests
Array for fixed account storage

Recursion is applied where required to demonstrate understanding of recursive algorithms and traversal in LinkedLists.

2. Tasks and Explanations
Task 1 – LinkedList Accounts

Description:

The BankAccount class stores account information (accountNumber, username, balance) and links to the next account.
Accounts can be added, displayed, and searched recursively, without using loops.

Implementation Highlights:

addAccount method uses recursion to add accounts.
displayAccounts prints all accounts recursively.
searchAccount searches for an account by username recursively.

Data Structure Choice:

LinkedList allows dynamic insertion without resizing.
Recursion demonstrates understanding of pointer-based data structures.
<img width="1809" height="950" alt="Screenshot 2026-04-07 163127" src="https://github.com/user-attachments/assets/ab28c047-300f-48ed-9726-c5e342d87fa6" />


Task 2 – Deposit & Withdraw

Description:

Users can deposit to or withdraw from accounts.
The program first recursively searches for the account.
Updates balance and prints new balance after each operation.

Implementation Highlights:

Deposit and withdraw operations directly modify the balance field of the found account.
Handles invalid usernames gracefully.

Data Structure Choice:

LinkedList enables dynamic management of accounts.
Recursion ensures all accounts are checked during search.
<img width="1886" height="961" alt="Screenshot 2026-04-07 163145" src="https://github.com/user-attachments/assets/5380304d-29f8-4007-94b9-6c7d1227a587" />


Task 3 – Transaction History (Stack)

Description:

Stores transaction history including deposits, withdrawals, and bill payments.
Supports push (add), pop (undo), and peek (view last) operations.

Implementation Highlights:

Stack stores transactions in LIFO order.
Undo operation is demonstrated by pop.
Last transaction can be displayed using peek.

Data Structure Choice:

Stack is suitable for recording the most recent transaction first.
Demonstrates understanding of abstract data structures in banking scenarios.
<img width="1879" height="1023" alt="Screenshot 2026-04-07 163154" src="https://github.com/user-attachments/assets/233e7192-98af-445a-91c1-886641e8bb50" />

Task 4 – Bill Payment Queue

Description:

Manages bills using a FIFO queue.
Users input bills, which are added to the queue.
Processing removes bills in the order they were added.

Implementation Highlights:

Uses LinkedList as a Queue.
poll() removes the first bill, peek() shows the next bill to process.

Data Structure Choice:

Queue ensures fairness — first bill submitted is processed first.
Demonstrates understanding of scheduling operations.

<img width="1828" height="914" alt="Screenshot 2026-04-07 163240" src="https://github.com/user-attachments/assets/34558f6d-8816-45f8-869d-3bcd5d0c0ec5" />

Task 5 – Account Opening Queue

Description:

Users submit account opening requests.
Admin processes requests sequentially:
Request removed from the queue (poll)
Account added to the LinkedList of active accounts

Implementation Highlights:

Ensures account requests are handled in the order submitted.
LinkedList dynamically stores approved accounts.

Data Structure Choice:

Queue ensures fairness for processing requests.
LinkedList provides flexible storage for approved accounts.
<img width="1860" height="1019" alt="Screenshot 2026-04-07 163259" src="https://github.com/user-attachments/assets/cbf5ca4d-a0c9-4add-8a30-44061cb8cf19" />

Task 6 – Array Accounts

Description:

Stores three accounts in an array and prints their details.
Demonstrates fixed-size storage.

Implementation Highlights:

Simple for-each loop displays all accounts.
Perfect for a small, known number of accounts.

Data Structure Choice:

Array is suitable when the number of accounts is known in advance.
Demonstrates understanding of physical data structures.

<img width="1858" height="1004" alt="Screenshot 2026-04-07 163314" src="https://github.com/user-attachments/assets/e2e74110-5c22-43a8-bf4d-0c55241e3bf0" />

Mini Banking Menu

Description:

Integrates all previous tasks into an interactive menu:
Bank Menu: Submit requests, deposit, withdraw
ATM Menu: Check balance, withdraw
Admin Menu: View/process requests, view bill queue

Implementation Highlights:

LinkedList stores accounts with recursive operations for adding and searching.
Stack records transaction history.
Queues manage account requests and bill payments.
Input and output match assignment examples.

Data Structure Choice:

Proper use of each structure in its real-world context:
LinkedList → dynamic accounts
Stack → transactions
Queue → requests and bills

<img width="1767" height="1016" alt="Screenshot 2026-04-07 163332" src="https://github.com/user-attachments/assets/978e6da8-a5fa-4b3c-8304-32092c43d8de" />

3. Work Process
Read the Assignment: Reviewed requirements for recursion and each data structure.
Implemented Tasks Separately:
Each task was implemented as a separate class for clarity.
Recursion applied to LinkedList operations.
Stack and Queue operations tested individually.
Integrated Mini Banking Menu: Combined all tasks into one interactive program.
Testing:
Verified outputs match assignment examples.
Ensured invalid input is handled gracefully (e.g., non-existent account, over-withdrawal).
Challenges & Solutions:
Initial deposit/withdraw not recursive → fixed by using recursive search.
Bill queue hardcoded → updated for user input.
4. Conclusion
All tasks completed according to instructions.
Correct use of LinkedList, Stack, Queue, and Array.
Recursion used where required.
Input/output matches examples provided.
Program demonstrates understanding of data structures, recursion, and mini banking system design.
Ready for submission with screenshots of outputs.
