You are given some domain model classes :
1. MenuItem
2. User
3. Payment
4. Cart
5. Order

Among these model classes, order and cart are not implemented yet. You need to implement these two model classes.
* Order model should have references to user model and payment model.
* Cart should have reference to user model and menu item model.
* Make adjustments/changes if needed for other model classes.

Objective
* Implement OrderService interface.
* For update/delete/checkout, you need to check whether the passed in user owns the cart or not i.e. whether the user object 
is associated with the cart or not. 
* You don't need to implement a full blown payment service interface. Just provide a very basic/
mock implementation of the payment service.
* You can create repository classes to interact with database. For this project, it's not mandatory to implement
a full blown repository class. Just a very basic/mock implementation will be fine.
* Write unit tests for OrderService interface. Mock payment service and repository classes for unit tests.

Deliverables
* Implementation of model classes.
* Implementation of OrderService interface.
* Unit tests for OrderService interface.

